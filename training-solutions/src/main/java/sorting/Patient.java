package sorting;

import java.time.LocalDateTime;

public class Patient {
    private String name;
    private String ssn;
    private LocalDateTime dateTime;

    public Patient(String name, String ssn, LocalDateTime dateTime) {
        this.name = name;
        this.ssn = ssn;
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
