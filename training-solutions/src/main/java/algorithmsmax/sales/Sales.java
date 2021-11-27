package algorithmsmax.sales;

import java.util.List;

public class Sales {
    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {
        Salesperson result = null;
        for (Salesperson salesperson : sales) {
            if (result == null || result.getAmount() < salesperson.getAmount()) {
                result = salesperson;
            }
        }
        return result;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {
        Salesperson result = null;
        int maxDiff = Integer.MIN_VALUE;
        for (Salesperson salesperson : sales) {
            int actualDiff = salesperson.getDifferenceFromTarget();
            if (result == null || maxDiff < actualDiff) {
                result = salesperson;
                maxDiff = actualDiff;
            }
        }
        return result;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        Salesperson result = null;
        int minDiff = Integer.MAX_VALUE;
        for (Salesperson salesperson : sales) {
            int actualDiff = salesperson.getDifferenceFromTarget();
            if (result == null || minDiff > actualDiff) {
                result = salesperson;
                minDiff = actualDiff;
            }
        }
        return result;
    }
}
