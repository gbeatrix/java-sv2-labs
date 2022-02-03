package activity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Activities {
    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public int numberOfTrackActivities() {
        return (int) activities.stream().filter(a -> a instanceof ActivityWithTrack).count();
    }

    public int numberOfWithoutTrackActivities() {
        return (int) activities.stream().filter(a -> a instanceof ActivityWithoutTrack).count();
    }

    public List<Report> distancesByTypes() {
        Map<ActivityType, Double> result = activities.stream()
                .collect(
                        Collectors.groupingBy(Activity::getType,
                                Collectors.summingDouble(Activity::getDistance)
                        ));
        return Arrays.stream(ActivityType.values()).map(type -> new Report(type, result.getOrDefault(type, 0d))).toList();
    }
}
