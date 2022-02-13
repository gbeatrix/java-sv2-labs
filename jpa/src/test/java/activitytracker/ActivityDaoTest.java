package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {
    private ActivityDao activityDao;

    @BeforeEach
    void init() throws IOException, SQLException {
        Properties dbconnection = new Properties();
        dbconnection.load(ActivityTrackerMain.class.getResourceAsStream("/dbconnection.properties"));

        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/%s?useUnicode=true".formatted(dbconnection.getProperty("database")));
        dataSource.setUser(dbconnection.getProperty("username"));
        dataSource.setPassword(dbconnection.getProperty("password"));

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        flyway.clean();
        flyway.migrate();

        activityDao = new ActivityDao(dataSource);
    }

    @Test
    void testActivityDao() {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity(LocalDateTime.of(2022, 2, 12, 5, 30), "hajnali futás", Type.RUNNING));
        activities.add(new Activity(LocalDateTime.of(2022, 2, 12, 8, 0), "reggeli edzés", Type.BASKETBALL));
        activities.add(new Activity(LocalDateTime.of(2022, 2, 12, 18, 0), "délutáni játék a gyerekekkel", Type.BASKETBALL));
        activities.add(new Activity(LocalDateTime.of(2022, 2, 13, 5, 30), "hajnali futás", Type.RUNNING));
        activities.add(new Activity(LocalDateTime.of(2022, 2, 13, 8, 0), "reggeli edzés", Type.BASKETBALL));
        activities.add(new Activity(LocalDateTime.of(2022, 2, 13, 18, 0), "délutáni játék a gyerekekkel", Type.BASKETBALL));

        activities.forEach(activityDao::saveActivity);

        assertEquals(activities.get(2), activityDao.findActivityById(3L));

        assertEquals(activities, activityDao.listActivities());
    }
}