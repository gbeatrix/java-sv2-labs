package introexceptiontrace.aquarium;

public class AquariumMain {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.addFish(new Fish("xifo", "narancssárga")); // NullPointerException, mert az Aquarium ornamentalFish attribútuma az alapértelmezés szerinti null-ra lett inicializálva, így a lista add() metódusa nem hívható meg rajta
        aquarium.addFish(new Fish("neonhal", "zöld"));
        aquarium.addFish(new Fish("neonhal", "vörös"));
        System.out.println(aquarium.getNumberOfFish());
    }
}
