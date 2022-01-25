package lambdaprimitives;

import java.util.IntSummaryStatistics;
import java.util.List;

public class SportGadgetStore {
    private List<Product> products;

    public SportGadgetStore(List<Product> products) {
        this.products = products;
    }

    public int getNumberOfProducts() {
        return products.stream()
                .mapToInt(Product::getCount)
                .sum();
    }

    public double getAveragePrice() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0);
    }

    public String getExpensiveProductStatistics(double minPrice) {
        IntSummaryStatistics stats = products.stream()
                .filter(product -> product.getPrice() > minPrice)
                .mapToInt(Product::getCount)
                .summaryStatistics();
        if (stats.getCount() > 0) {
            return "Összesen %d féle termék, amelyekből minimum %d db, maximum %d db, összesen %d db van."
                    .formatted(stats.getCount(), stats.getMin(), stats.getMax(), stats.getSum());
        } else {
            return "Nincs ilyen termék.";
        }
    }
}
