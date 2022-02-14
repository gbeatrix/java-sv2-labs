package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.io.IOException;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ActivityTrackerMain {
    private Properties dbconnection;
    private MariaDbDataSource dataSource;

    public static void main(String[] args) {
        ActivityTrackerMain program = new ActivityTrackerMain();
        program.addFirstActivities();
        System.out.println(program.getActivityById(3));
        program.getActivitiesFromDb().forEach(System.out::println);
    }

    public List<Activity> getActivitiesFromDb() {
        String sql = "SELECT * FROM activities;";
        try (
                Connection connection = getDataSource().getConnection();
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
                        result.getLong("id"),
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

    public Activity getActivityById(long id){
        String sql = "SELECT * FROM activities WHERE id = ?;";
        try (
                Connection connection = getDataSource().getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql)
        ) {
            stmt.setLong(1, id);
            return getFirstActivityByQuery(stmt);

        } catch (SQLException sqlerr) {
            throw new IllegalStateException("Error executing SELECT.", sqlerr);
        }
    }

    private Activity getFirstActivityByQuery(PreparedStatement stmt) {
        try (ResultSet result = stmt.executeQuery()) {
            if (result.next()) {
                 return new Activity(
                        result.getLong("id"),
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

    public void addFirstActivities() {
        List<Activity> activities = getActivities();
        try (Connection connection = getDataSource().getConnection()) {
            dropTableActivities(connection);
            createTableActivities(connection);
            for (Activity activity : activities) {
                insertActivity(connection, activity);
            }
        } catch (SQLException sqlerr) {
            throw new IllegalStateException("Cannot connect to database.", sqlerr);
        }
    }

    private List<Activity> getActivities() {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity(LocalDateTime.of(2022, 2, 12, 5, 30), "hajnali futás", Type.RUNNING));
        activities.add(new Activity(LocalDateTime.of(2022, 2, 12, 8, 0), "reggeli edzés", Type.BASKETBALL));
        activities.add(new Activity(LocalDateTime.of(2022, 2, 12, 18, 0), "délutáni játék a gyerekekkel", Type.BASKETBALL));
        activities.add(new Activity(LocalDateTime.of(2022, 2, 13, 5, 30), "hajnali futás", Type.RUNNING));
        activities.add(new Activity(LocalDateTime.of(2022, 2, 13, 8, 0), "reggeli edzés", Type.BASKETBALL));
        activities.add(new Activity(LocalDateTime.of(2022, 2, 13, 18, 0), "délutáni játék a gyerekekkel", Type.BASKETBALL));
        return activities;
    }

    private void readProperties() {
        try {
            if (dbconnection == null) {
                dbconnection = new Properties();
                dbconnection.load(ActivityTrackerMain.class.getResourceAsStream("/dbconnection.properties"));
            }
        } catch (IOException ioerr) {
            throw new IllegalStateException("Cannot read database connection properties.", ioerr);
        }
    }

    private MariaDbDataSource getDataSource() {
        try {
            if (dataSource == null) {
                readProperties();
                dataSource = new MariaDbDataSource();
                dataSource.setUrl("jdbc:mariadb://localhost:3306/%s?useUnicode=true".formatted(dbconnection.getProperty("database")));
                dataSource.setUser(dbconnection.getProperty("username"));
                dataSource.setPassword(dbconnection.getProperty("password"));
            }
            return dataSource;
        } catch (SQLException sqlerr) {
            throw new IllegalStateException("Cannot set up data source.", sqlerr);
        }
    }

    private void dropTableActivities(Connection connection) {
        String sql = "DROP TABLE IF EXISTS activities";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.execute();
        } catch (SQLException sqlerr) {
            throw new IllegalStateException("Cannot drop table activities.", sqlerr);
        }
    }

    private void createTableActivities(Connection connection) {
        String sql = "CREATE TABLE IF NOT EXISTS activities ("
                + "id INT AUTO_INCREMENT,"
                + "start_time DATETIME,"
                + "activity_desc VARCHAR(255),"
                + "activity_type ENUM('BIKING', 'HIKING', 'RUNNING', 'BASKETBALL'),"
                + "PRIMARY KEY (id)"
                + ")";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.execute();
        } catch (SQLException sqlerr) {
            throw new IllegalStateException("Cannot create table activities.", sqlerr);
        }
    }

    private void insertActivity(Connection connection, Activity activity) {
        String sql = "INSERT INTO activities (start_time, activity_desc, activity_type) "
                + "VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();
        } catch (SQLException sqlerr) {
            throw new IllegalStateException("Cannot insert activity.", sqlerr);
        }
    }
}
