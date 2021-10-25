package introconstructors;

import java.time.LocalDate;

public class CyclingTour {
    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public void registerPerson(int person){
        numberOfPeople += person;
    }

    public void ride(double km){
        kms += km;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public static void main(String[] args) {
        CyclingTour tour = new CyclingTour("biciklitúra", LocalDate.of(2022,3,5));
        System.out.println("leírás: " + tour.getDescription());
        System.out.println("indulás: " + tour.getStartTime());
        System.out.println("út: " + tour.getKms() + " km");
        System.out.println("résztvevők száma: " + tour.getNumberOfPeople());
        System.out.println();

        tour.registerPerson(3);
        tour.ride(2);

        System.out.println("leírás: " + tour.getDescription());
        System.out.println("indulás: " + tour.getStartTime());
        System.out.println("út: " + tour.getKms() + " km");
        System.out.println("résztvevők száma: " + tour.getNumberOfPeople());
    }
}
