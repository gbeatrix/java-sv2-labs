package attributes.bill;

public class Bill {
    public static void main(String[] args) {
        BillItem item = new BillItem("Ultra mosogatópor 500g", 502, 10, 27);

        System.out.println("termék: " + item.getProduct());
        System.out.println("nettó egységár: " + item.getPrice() + " Ft");
        System.out.println("ÁFA-kulcs: " + item.getVatPercent() + "%");
        System.out.println("mennyiség: " + item.getQuantity());
        System.out.println("bruttó összesen: " + item.calculateTotalPrice() + " Ft");

        System.out.println();
        item = new BillItem("Cirmi UHT tej 1,5% 1l", 150, 12, 18);

        System.out.println("termék: " + item.getProduct());
        System.out.println("nettó egységár: " + item.getPrice() + " Ft");
        System.out.println("ÁFA-kulcs: " + item.getVatPercent() + "%");
        System.out.println("mennyiség: " + item.getQuantity());
        System.out.println("bruttó összesen: " + item.calculateTotalPrice() + " Ft");

    }
}
