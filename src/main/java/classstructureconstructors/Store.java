package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Store(String product) {
        this.product = product;
        stock = 0;
    }

    public void store(int quantity){
        setStock(stock + quantity);
    }

    public void dispatch(int quantity){
        setStock(stock - quantity);
    }
}
