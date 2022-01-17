package lambdacomparator.account;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BankAccounts {
    private List<BankAccount> accounts;

    public BankAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public List<BankAccount> listBankAccountsByAccountNumber(){
        return order(Comparator.naturalOrder());
    }

    public List<BankAccount> listBankAccountsByBalance(){
        return order(Comparator.comparing(BankAccount::getBalance, Comparator.comparingDouble(Math::abs)));
    }

    public List<BankAccount> listBankAccountsByBalanceDesc(){
        return order(Comparator.comparing(BankAccount::getBalance).reversed());
    }

    public List<BankAccount> listBankAccountsByNameThenAccountNumber(){
        return order(Comparator.comparing(BankAccount::getNameOfOwner, Comparator.nullsFirst(Collator.getInstance())).thenComparing(BankAccount::getAccountNumber));
    }

    private List<BankAccount> order(Comparator<BankAccount> comparator){
        List<BankAccount> ordered = new ArrayList<>(accounts);
        ordered.sort(comparator);
        return ordered;
    }
}
