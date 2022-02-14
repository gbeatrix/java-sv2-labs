package activitytracker;

import java.time.LocalDateTime;
import java.util.Objects;

public class Activity {
    private long id;
    private LocalDateTime startTime;
    private String desc;
    private Type type;

    public Activity(long id, LocalDateTime startTime, String desc, Type type) {
        this.id = id;
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    public Activity(LocalDateTime startTime, String desc, Type type) {
        this(0L, startTime, desc, type);
    }

    public Activity(long id, Activity other) {
        this(id, other.startTime, other.desc, other.type);
    }

    public long getId() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return id == activity.id && Objects.equals(startTime, activity.startTime) && Objects.equals(desc, activity.desc) && type == activity.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startTime, desc, type);
    }
}
