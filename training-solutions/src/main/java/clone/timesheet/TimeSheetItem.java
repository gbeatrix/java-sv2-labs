package clone.timesheet;

import java.time.LocalDateTime;

public class TimeSheetItem {
    private String employee; // a String és a LocalDateTime is immutable!
    private String project;
    private LocalDateTime from;
    private LocalDateTime to;

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }

    public TimeSheetItem(TimeSheetItem o) {
        this(o.employee, o.project, o.from, o.to);
    }

    public String getEmployee() {
        return employee;
    }

    public String getProject() {
        return project;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public TimeSheetItem copyWithDifferentEmployee(TimeSheetItem timeSheetItem, String newEmployee){
        TimeSheetItem result = new TimeSheetItem(timeSheetItem);
        result.employee = newEmployee;
        return result;
    }
}
