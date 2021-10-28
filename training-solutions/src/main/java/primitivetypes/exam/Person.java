package primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDate;
    private int zipCode;
    private double avg;

    public Person(String name, LocalDate birthDate, int zipCode, double avg) {
        this.name = name;
        this.birthDate = birthDate;
        this.zipCode = zipCode;
        this.avg = avg;
    }

    @Override
    public String toString() {
        return  "{ név: " + name +
                ", szül. idő: " + birthDate +
                ", irsz.: " + zipCode +
                ", átlag: " + avg + " }";
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getZipCode() {
        return zipCode;
    }

    public double getAvg() {
        return avg;
    }
}
