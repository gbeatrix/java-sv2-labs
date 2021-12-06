package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter {
    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String billItem : billItems) {
            String[] parts = billItem.split(";");
            int quantity = Integer.parseInt(parts[2]);
            int price = Integer.parseInt(parts[1]);
            sb.append(String.format("%s, %d * %d = %d Ft%n", parts[0], quantity, price, quantity * price));
        }
        return sb.toString();
    }
}
