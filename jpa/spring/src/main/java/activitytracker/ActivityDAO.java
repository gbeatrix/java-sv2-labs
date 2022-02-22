package activitytracker;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Timestamp;

public class ActivityDAO {
    private JdbcTemplate jdbcTemplate;

    public ActivityDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void insertActivity(Activity activity){
        jdbcTemplate.update("INSERT INTO activities VALUE (?, ?, ?, ?)",
                activity.getId(),
                Timestamp.valueOf(activity.getStartTime()),
                activity.getDesc(),
                activity.getType().toString());
    }
}
