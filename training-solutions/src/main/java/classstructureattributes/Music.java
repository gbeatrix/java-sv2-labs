package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a kedvenc zeneszámod előadóját: ");
        song.band = scanner.nextLine();
        System.out.print("Add meg a kedvenc zeneszámod címét: ");
        song.title = scanner.nextLine();
        System.out.print("Add meg a hosszát percben: ");
        song.length = scanner.nextInt();
        scanner.nextLine();

        System.out.print(song.band);
        System.out.print(" - " + song.title);
        System.out.println(" (" + song.length + " perc)");
    }
}
