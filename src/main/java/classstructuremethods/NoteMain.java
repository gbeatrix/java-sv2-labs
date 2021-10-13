package classstructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a felhasználó nevét: ");
        note.setName(scanner.nextLine());
        System.out.print("Add meg a jegyzet témáját: ");
        note.setTopic(scanner.nextLine());
        System.out.print("Add meg a jegyzet szövegét: ");
        note.setText(scanner.nextLine());

        System.out.println(note.getNoteText());
    }
}
