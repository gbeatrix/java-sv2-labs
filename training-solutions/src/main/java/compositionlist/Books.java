package compositionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {
    private List<String> titles = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Books books = new Books();

        System.out.print("Hány könyvcímet szeretnél eltárolni: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<n; i++){
            System.out.print("Add meg a könyv címét: ");
            books.addBook(scanner.nextLine());
        }

        System.out.println("\nA könyvlista tartalma:");
        System.out.println(books.getTitles());

        books.findBookAndSetAuthor("Egri csillagok", "Gárdonyi Géza");

        System.out.println("\nA könyvlista tartalma:");
        System.out.println(books.getTitles());

        System.out.print("\nMelyik könyvcímhez adnál meg szerzőt: ");
        String title = scanner.nextLine();
        System.out.print("Add meg a szerzőt: ");
        String author = scanner.nextLine();
        books.findBookAndSetAuthor(title, author);

        System.out.println("\nA könyvlista tartalma:");
        System.out.println(books.getTitles());
    }

    public void addBook(String title){
        titles.add(title);
    }

    public void findBookAndSetAuthor(String title, String author){
        if(titles.contains(title)){
            int idx = titles.indexOf(title);
            titles.set(idx, author + ": " + titles.get(idx));
        }
    }

    public List<String> getTitles() {
        return titles;
    }
}
