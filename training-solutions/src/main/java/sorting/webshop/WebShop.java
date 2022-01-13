package sorting.webshop;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WebShop {
    private List<Product> products = new ArrayList<>();

    public void addProducts(Product... products) {
        this.products.addAll(Arrays.asList(products));
    }

    public List<Product> getProductsOrderByName() {
        List<Product> products = new ArrayList<>(this.products);
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Collator.getInstance().compare(o1.getName(), o2.getName());
            }
        });
        return products;
    }

    public List<Product> getProductsOrderByPrice() {
        List<Product> products = new ArrayList<>(this.products);
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
        });
        return products;
    }

    public List<Product> getProductsOrderByDate() {
        List<Product> products = new ArrayList<>(this.products);
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getFrom().compareTo(o2.getFrom());
            }
        });
        return products;
    }
}
