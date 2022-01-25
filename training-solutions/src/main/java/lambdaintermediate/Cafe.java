package lambdaintermediate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Cafe {
    private List<CoffeeOrder> orders;

    public Cafe(List<CoffeeOrder> orders) {
        this.orders = orders;
    }

    public void addCoffeeOrder(CoffeeOrder order) {
        orders.add(order);
    }

    public Integer getTotalIncome() {
        return orders.stream()
                .map(CoffeeOrder::getCoffees)
                .flatMap(Collection::stream)
//                .mapToInt(Coffee::getPrice)
//                .sum();
                .map(Coffee::getPrice)
                .reduce(0, Integer::sum);
    }

    public Integer getTotalIncome(LocalDate date) {
        return orders.stream()
                .filter(order -> order.getDateTime().toLocalDate().equals(date))
                .map(CoffeeOrder::getCoffees)
                .flatMap(Collection::stream)
//                .mapToInt(Coffee::getPrice)
//                .sum();
                .map(Coffee::getPrice)
                .reduce(0, Integer::sum);
    }

    public long getNumberOfCoffee(CoffeeType type) {
        return orders.stream()
                .map(CoffeeOrder::getCoffees)
                .flatMap(Collection::stream)
                .filter(coffee -> coffee.getType() == type)
                .count();
    }

    public List<CoffeeOrder> getOrdersAfter(LocalDateTime from) {
        return orders.stream()
                .filter(order -> order.getDateTime().isAfter(from))
                .toList();
    }

    public List<CoffeeOrder> getFirstFiveOrder(LocalDate date) {
        return orders.stream()
                .filter(order -> order.getDateTime().toLocalDate().equals(date))
                .sorted(Comparator.comparing(CoffeeOrder::getDateTime))
                .limit(5)
                .toList();
    }
}
