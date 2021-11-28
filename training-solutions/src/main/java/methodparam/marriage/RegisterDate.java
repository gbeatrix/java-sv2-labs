package methodparam.marriage;

import java.time.LocalDate;

public class RegisterDate {
    private String description;
    private LocalDate date;

    public RegisterDate(String description, LocalDate date) {
        if(description == null || description.isBlank()){
            throw new IllegalArgumentException("Description must not be empty.");
        }
        if(date == null || date.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Date is invalid.");
        }
        this.description = description;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }
}
