package initializer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private static final List<Rate> ACTUAL_RATES;

    private long balance;

    static {
        ACTUAL_RATES = new ArrayList<>();
    }

    public CreditCard(long balance, Currency currency, List<Rate> rates) {
        ACTUAL_RATES.clear();
        ACTUAL_RATES.addAll(rates);
        this.balance = (long) (balance * getRate(currency));
    }

    public CreditCard(long balance, Currency currency) {
        this.balance = (long) (balance * getRate(currency));
    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public boolean payment(long amount, Currency currency) {
        long amountInHuf = (long) (amount * getRate(currency));
        if (amountInHuf <= balance) {
            balance -= amountInHuf;
            return true;
        }
        return false;
    }

    private static double getRate(Currency currency) {
        for (Rate rate : ACTUAL_RATES) {
            if (rate.getCurrency() == currency) {
                return rate.getConversionFactor();
            }
        }
        if (currency == Currency.HUF) {
            return 1;
        } else {
            throw new IllegalStateException("Rates are not uploaded.");
        }
    }

    public boolean payment(long amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
