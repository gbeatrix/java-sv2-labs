package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {
    private List<SimpleTime> timeTable;

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = new ArrayList<>(timeTable);
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        timeTable = new ArrayList<>();
        for (int i = firstHour; i <= lastHour; i++) {
            timeTable.add(new SimpleTime(i, everyMinute));
        }
    }

    public SimpleTime getNextBus(SimpleTime actual) {
        if (timeTable.isEmpty() || timeTable.get(timeTable.size() - 1).getDifference(actual) < 0) {
            throw new IllegalStateException("No more buses today!");
        }
        int i = 0;
        while (i < timeTable.size() && timeTable.get(i).getDifference(actual) < 0) {
            i++;
        }
        return timeTable.get(i);
    }

    public List<SimpleTime> getTimeTable() {
        return List.copyOf(timeTable);
    }
}
