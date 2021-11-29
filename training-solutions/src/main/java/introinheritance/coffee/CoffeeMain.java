package introinheritance.coffee;

public class CoffeeMain {
    public static void main(String[] args) {
        System.out.printf("%20s | %8s%n", "név      ", "ár  ");

        Coffee coffee = new Coffee();
        coffee.setName("Hosszú kávé 3 dl");
        coffee.setPrice(640);
        System.out.printf("%20s | %5d Ft%n", coffee.getName(), coffee.getPrice());

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Cappuccino 3 dl");
        cappuccino.setPrice(690);
        System.out.printf("%20s | %5d Ft%n", cappuccino.getName(), cappuccino.getPrice());
    }
}
