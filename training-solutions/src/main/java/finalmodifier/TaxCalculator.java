package finalmodifier;

public class TaxCalculator {
    public static final double VAT = 27/100.;

    public double tax(double price){
        return price*VAT;
    }

    public double priceWithTax(double price){
        return price*(1+VAT);
    }

    public static void main(String[] args) {
        int price = 20000;
        TaxCalculator tc = new TaxCalculator();

        System.out.println("Az ár nettó " + price + " Ft plussz " + tc.tax(price) + " Ft ÁFA, összesen " + tc.priceWithTax(price) + " Ft");
    }
}
