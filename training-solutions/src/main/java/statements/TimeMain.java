package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour;
        int min;
        int sec;

        System.out.println("Add meg az első időpontot: (ó p mp)");
        hour = scanner.nextInt();
        min = scanner.nextInt();
        sec = scanner.nextInt();
        Time firstTime = new Time(hour, min, sec);

        System.out.println("Add meg a második időpontot: (ó p mp)");
        hour = scanner.nextInt();
        min = scanner.nextInt();
        sec = scanner.nextInt();
        Time secondTime = new Time(hour, min, sec);

        System.out.println("Az első időpont " + firstTime.toString() + " = " + firstTime.getInMinutes() + " perc");
        System.out.println("A második időpont " + secondTime.toString() + " = " + secondTime.getInSeconds() + " másodperc");
        System.out.println("Az első korábbi, mint a második: " + firstTime.earlierThan(secondTime));
    }
}
