package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store storeA = new Store("alma");
        Store storeB = new Store("banán");

        storeA.store(10);
        storeB.store(100);
        storeA.dispatch(3);
        storeB.dispatch(70);

        System.out.println(storeA.getProduct() + ": " + storeA.getStock());
        System.out.println(storeB.getProduct() + ": " + storeB.getStock());
    }
}
