package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        String productName;
        int price;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a termék nevét: ");
        productName = scanner.nextLine();
        System.out.print("Add meg a termék árát: ");
        price = scanner.nextInt();
        scanner.nextLine();

        Product product = new Product(productName, price);
        System.out.println(product.getName() + ": " + product.getPrice() + "Ft");

        product.decreasePrice(20);
        System.out.println(product.getName() + ": " + product.getPrice() + "Ft");

        product.increasePrice(30);
        System.out.println(product.getName() + ": " + product.getPrice() + "Ft");
    }
}
