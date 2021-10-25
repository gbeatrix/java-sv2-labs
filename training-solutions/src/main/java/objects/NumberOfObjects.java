package objects;

public class NumberOfObjects {
    public static void main(String[] args) {
        //                        új objektum   Objektum (változó, amivel hozzá lehet férni)
        Book book1 = new Book(); //   A         A(book1)
        Book book2 = new Book(); //   B         A(book1), B(book2)
        Book book3 = new Book(); //   C         A(book1), B(book2), C(book3)
        Book book4 = book1;      //             A(book1, book4), B(book2), C(book3)
        Book book5 = book1;      //             A(book1, book4, book5), B(book2), C(book3)
        Book book6 = book3;      //             A(book1, book4, book5), B(book2), C(book3, book6)
        Book book7 = null;       //             A(book1, book4, book5), B(book2), C(book3, book6)
        book4 = book6;           //             A(book1, book5), B(book2), C(book3, book6, book4)
        new Book();              //   D         A(book1, book5), B(book2), C(book3, book6, book4), D()
        book5 = new Book();      //   E         A(book1), B(book2), C(book3, book6, book4), D(), E(book5)
        book6 = null;            //             A(book1), B(book2), C(book3, book4), D(), E(book5)
        book5 = book4;           //             A(book1), B(book2), C(book3, book4, book5), D(), E()

        // objektum példányok összesen: 5
        // az első 3-hoz tudunk hozzáférni a futás végére
        // a 3. objektumot több változón keresztül is elérjük
    }
}
