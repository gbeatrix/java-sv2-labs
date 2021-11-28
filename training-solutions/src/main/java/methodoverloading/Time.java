package methodoverloading;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isEqual(Time time) {
        return compareTo(time) == 0;
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        return compareTo(new Time(hours, minutes, seconds)) == 0;
    }

    public boolean isEarlier(Time time) {
        return compareTo(time) < 0;
    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        return compareTo(new Time(hours, minutes, seconds)) < 0;
    }

    private int compareTo(Time t) {
        return Integer.compare(getTimeInSeconds(), t.getTimeInSeconds());
    }

    private int getTimeInSeconds() {
        return 60 * 60 * hours + 60 * minutes + seconds;
    }
}
