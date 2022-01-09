package exceptionclass.bank;

import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("Account list should not be null!");
        }
        this.accounts = accounts;
    }

    public void payment(String accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        account.subtract(amount);
    }

    public void deposit(String accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        account.deposit(amount);
    }

    private Account getAccount(String accountNumber) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("Account number is null");
        }
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new InvalidAccountNumberBankOperationException("Invalid account number!");
    }
}
