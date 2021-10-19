package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
        Performance performance = new Performance(
                LocalDate.of(1989,6,2),
                "Queen",
                LocalTime.of(18,0),
                LocalTime.of(20,0)
        );

        System.out.println("Előadó: " + performance.getArtist());
        System.out.println("Dátum: " + performance.getDate());
        System.out.println("Kezdés: " + performance.getStartTime());
        System.out.println("Befejezés: " + performance.getEndTime());
        System.out.println(performance.getInfo());
    }
}
