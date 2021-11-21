package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {
        List<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (String todo = null; !"x".equals(todo); ) {
            System.out.print("Kérem a következő todo-t (kilépés: x): ");
            todo = scanner.nextLine();
            if (!"x".equals(todo)) {
                toDoList.add(todo);
            }
        }

        try {
            Files.write(Paths.get("todos.txt"), toDoList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
