package collectionsequalshash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebShop {
    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return List.copyOf(products);
    }

    public void addProducts(Product... products) {
        this.products.addAll(Arrays.asList(products));
    }

    public int findHowMany(Product product) {
        int sum = 0;
        for (Product actual : products) {
            if (product.equals(actual)) {
                ++sum;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        WebShop webShop = new WebShop();
        webShop.addProducts(new Product("póló", "1"));
        webShop.addProducts(new Product("bögre", "2"));
        webShop.addProducts(new Product("mintás póló", "1"));
        webShop.addProducts(new Product("bögre", "2"));
        webShop.addProducts(new Product("fehér bögre", "2"));
        webShop.addProducts(new Product("bögre", "2"));
        webShop.addProducts(new Product("póló", "1"));
        System.out.println(webShop.findHowMany(new Product("ruha", "1")));
        System.out.println(webShop.findHowMany(new Product("bögre", "2")));
    }
}
