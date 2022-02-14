package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {
    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Activity saveActivity(Activity activity){
        String sql = "INSERT INTO activities (start_time, activity_desc, activity_type) VALUES (?, ?, ?)";
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql,
                        Statement.RETURN_GENERATED_KEYS)
        ) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();
            return new Activity(getFirstGeneratedKey(stmt), activity);
        } catch (SQLException sqlerr) {
            throw new IllegalStateException("Cannot insert activity into database.", sqlerr);
        }
    }

    private int getFirstGeneratedKey(PreparedStatement stmt) {
        try (ResultSet rs = stmt.getGeneratedKeys()) {
            if (rs.next()) {
                return rs.getInt(1);
            } else {
                throw new SQLException("Cannot get any generated id");
            }
        } catch (SQLException sqlerr) {
            throw new IllegalArgumentException("Error by insert", sqlerr);
        }
    }

    public Activity findActivityById(long id){
        String sql = "SELECT * FROM activities WHERE id = ?;";
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql)
        ) {
            stmt.setInt(1, (int)id);
            return getFirstActivityByQuery(stmt);

        } catch (SQLException sqlerr) {
            throw new IllegalStateException("Error executing SELECT.", sqlerr);
        }
    }

    private Activity getFirstActivityByQuery(PreparedStatement stmt) {
        try (ResultSet result = stmt.executeQuery()) {
            if (result.next()) {
                return new Activity(
                        result.getInt("id"),
                        result.getTimestamp("start_time").toLocalDateTime(),
                        result.getString("activity_desc"),
                        Type.valueOf(result.getString("activity_type"))
                );
            } else {
                throw new IllegalArgumentException("Cannot find activity by query " + stmt);
            }
        } catch (SQLException sqlerr) {
            throw new IllegalStateException("Error executing SELECT.", sqlerr);
        }
    }

    public List<Activity> listActivities(){
        String sql = "SELECT * FROM activities;";
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql)
        ) {
            return getAllActivitiesByQuery(stmt);
        } catch (SQLException sqlerr) {
            throw new IllegalStateException("Error executing SELECT.", sqlerr);
        }
    }

    private List<Activity> getAllActivitiesByQuery(PreparedStatement stmt) {
        try (ResultSet result = stmt.executeQuery()) {
            List<Activity> activities = new ArrayList<>();
            while (result.next()) {
                activities.add(new Activity(
                        result.getInt("id"),
                        result.getTimestamp("start_time").toLocalDateTime(),
                        result.getString("activity_desc"),
                        Type.valueOf(result.getString("activity_type"))
                ));
            }
            return activities;
        } catch (SQLException sqlerr) {
            throw new IllegalStateException("Error executing SELECT.", sqlerr);
        }
    }
}
