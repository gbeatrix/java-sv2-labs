package activitytracker;

import java.time.LocalDateTime;

public class Activity {
    private int id;
    private LocalDateTime startTime;
    private String desc;
    private Type type;
    private static int lastId = 0;

    public Activity(int id, LocalDateTime startTime, String desc, Type type) {
        this.id = id;
        lastId = id;
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    public Activity(LocalDateTime startTime, String desc, Type type) {
        this(lastId + 1, startTime, desc, type);
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDesc() {
        return desc;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", desc='" + desc + '\'' +
                ", type=" + type +
                '}';
    }
}
