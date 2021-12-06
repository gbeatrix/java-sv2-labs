package interfacedependencyinversion.amount;

public class Cash implements Payable {
    @Override
    public int getPayableAmount(int amount) {
        int mod = (amount + 2) % 5 - 2;
        return amount - mod;
    }
}
