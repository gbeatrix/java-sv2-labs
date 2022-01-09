package exceptionclass.bank;

public class Account {
    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("Account number should not be null!");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = 100000;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        validateAmount(maxSubtract);
        this.maxSubtract = maxSubtract;
    }

    public double subtract(double value) {
        validateAmount(value);
        if (value > balance) {
            throw new LowBalanceBankOperationException("Low balance!");
        } else if (value > maxSubtract) {
            throw new InvalidAmountBankOperationException("Amount is over limit " + maxSubtract);
        }
        balance -= value;
        return balance;
    }

    public double deposit(double value) {
        validateAmount(value);
        balance += value;
        return balance;
    }

    private void validateAmount(double amount) {
        if (amount < 0) {
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
    }
}
