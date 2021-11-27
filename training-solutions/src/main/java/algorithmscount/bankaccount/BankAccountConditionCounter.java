package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {
    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int limit) {
        int count = 0;
        for (BankAccount acc : bankAccounts) {
            if (acc.getBalance() > limit) {
                ++count;
            }
        }
        return count;
    }
}
