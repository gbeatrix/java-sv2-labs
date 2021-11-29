package introinheritance.fruit;

public class FruitsMain {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("mangó");
        fruit.setWeight(0.33);
        System.out.println(fruit.getName() + ", " + fruit.getWeight());

        Grape grape = new Grape();
        grape.setName("szőlő");
        grape.setWeight(0.5);
        grape.setType("Zalagyöngye");
        System.out.println(grape.getName() + ", " + grape.getWeight() + ", " + grape.getType());

        Apple apple = new Apple();
        apple.setName("alma");
        apple.setWeight(2.0);
        apple.setPieces(15);
        System.out.println(apple.getName() + ", " + apple.getWeight() + ", " + apple.getPieces());

        GoldenDelicious goldenDelicious = new GoldenDelicious();
        goldenDelicious.setName("alma (Golden delicious)");
        goldenDelicious.setWeight(2.0);
        goldenDelicious.setPieces(15);
        System.out.println(goldenDelicious.getName() + ", " + goldenDelicious.getWeight() + ", " + goldenDelicious.getPieces() + ", " + goldenDelicious.getColour());

        Starking starking = new Starking();
        starking.setName("alma (Starking)");
        starking.setWeight(2.0);
        starking.setPieces(15);
        System.out.println(starking.getName() + ", " + starking.getWeight() + ", " + starking.getPieces() + ", " + starking.getColour());
    }
}
