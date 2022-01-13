package searching;

import java.text.Collator;
import java.time.LocalDate;
import java.util.Objects;

public class LostProperty implements Comparable<LostProperty> {
    private String regNumber;
    private String description;
    private LocalDate date;

    public LostProperty(String regNumber, String description, LocalDate date) {
        this.regNumber = regNumber;
        this.description = description;
        this.date = date;
    }

    public LostProperty(String description, LocalDate date) {
        this(null, description, date);
    }

    public LostProperty(String description) {
        this(null, description, null);
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LostProperty that = (LostProperty) o;
        return Objects.equals(description, that.description) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, date);
    }

    @Override
    public int compareTo(LostProperty o) {
        Collator collator = Collator.getInstance();
        int result = collator.compare(description, o.description);
        if (result == 0) {
            return date.compareTo(o.date);
        } else {
            return result;
        }
    }

    @Override
    public String toString() {
        return (regNumber == null ? "" : (regNumber + " ")) + description + (date == null ? "" : (" " + date));
    }
}
