package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {
        List<String> favouriteThings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add meg a kedvenc színészedet: ");
        favouriteThings.add(scanner.nextLine());
        System.out.print("Add meg a kedvenc filmedet: ");
        favouriteThings.add(scanner.nextLine());
        System.out.print("Add meg a kedvenc színedet: ");
        favouriteThings.add(scanner.nextLine());
        System.out.print("Add meg a kedvenc zenekarodat: ");
        favouriteThings.add(scanner.nextLine());
        System.out.print("Add meg a kedvenc zeneszámodat: ");
        favouriteThings.add(scanner.nextLine());
        System.out.print("Add meg a kedvenc állatodat: ");
        favouriteThings.add(scanner.nextLine());
        System.out.println(favouriteThings.size());
        System.out.println(favouriteThings);
    }
}
