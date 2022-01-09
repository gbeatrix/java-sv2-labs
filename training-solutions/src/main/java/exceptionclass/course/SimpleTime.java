package exceptionclass.course;

public class SimpleTime {
    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        validate(hour, minute);
        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String hhmm) {
        validate(hhmm);
        String[] time = hhmm.split(":");
        hour = Integer.parseInt(time[0]);
        minute = Integer.parseInt(time[1]);
        validate(hour, minute);
    }

    private void validate(int hour, int minute) {
        if (hour < 0 || hour > 23) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }

        if (minute < 0 || minute > 59) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
    }

    private void validate(String hhmm) {
        if (hhmm == null) {
            throw new InvalidTimeException("Time is null");
        }
        if (!hhmm.matches("[0-9][0-9]:[0-9][0-9]")) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
    }

    @Override
    public String toString() {
        return "%02d:%02d".formatted(hour, minute);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
