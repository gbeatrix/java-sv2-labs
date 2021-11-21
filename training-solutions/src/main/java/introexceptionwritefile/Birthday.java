package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hány embert rögzítesz: ");
        int k = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < k; i++) {
            System.out.print("Add meg a nevet: ");
            String name = scanner.nextLine();
            System.out.print("Add meg a születésnapot: ");
            String birthday = scanner.nextLine();
            list.add(String.format("%s, %s", name, birthday));
        }

        try {
            Files.write(Paths.get("birthdays.txt"), list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
