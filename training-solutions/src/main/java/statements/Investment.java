package statements;

public class Investment {
    private double cost;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        this.cost = 0.3;
        this.active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days){
        return fund*(interestRate/100.0)*(days/365.0);
    }

    public double close(int days){
        double result = getFund();
        result += getYield(days);
        result -= result*(cost/100);
        result = active?result:0;
        active = false;
        return result;
    }
}
