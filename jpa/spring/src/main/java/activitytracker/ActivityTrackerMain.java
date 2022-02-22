package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ActivityTrackerMain {
    private Properties dbconnection;
    private DataSource dataSource;

    public ActivityTrackerMain() {
        try {
            dbconnection = new Properties();
            dbconnection.load(ActivityTrackerMain.class.getResourceAsStream("/application.properties"));
            MariaDbDataSource mariaDbDataSource = new MariaDbDataSource();
            mariaDbDataSource.setUrl(dbconnection.getProperty("url", "jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true"));
            mariaDbDataSource.setUser(dbconnection.getProperty("username", "activitytracker"));
            mariaDbDataSource.setPassword(dbconnection.getProperty("password", "activitytracker"));
            this.dataSource = mariaDbDataSource;
        } catch (IOException ioerr) {
            throw new IllegalStateException("Cannot read application properties.", ioerr);
        } catch (SQLException sqlerr) {
            throw new IllegalStateException("Cannot reach database.", sqlerr);
        }
    }

    public static void main(String[] args) {
        ActivityTrackerMain program = new ActivityTrackerMain();
        Flyway flyway = Flyway.configure().dataSource(program.dataSource).load();
        flyway.clean();
        flyway.migrate();

        program.simpleJdbcDataModification();
    }

    private void simpleJdbcDataModification() {
        ActivityDAO activityDAO = new ActivityDAO(dataSource);
        for (Activity activity : getActivities()) {
            activityDAO.insertActivity(activity);
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
}
