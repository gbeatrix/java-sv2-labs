package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {                        // Objektum (változónév)
        List<Dog> dogs = new ArrayList<>();                         // L[] (dogs)
        Dog dog1 = new Dog("Anton", 4, "vörös");   // A (dog1)
        Dog dog2 = new Dog("Bodri", 1, "tarka");   // B (dog2)
        Dog dog3 = new Dog("Csibész", 10, "fehér");// C (dog3)
        dogs.add(dog1);                                             // L[A] (dogs)
        dogs.add(dog2);                                             // L[A,B] (dogs)
        dogs.add(dog3);                                             // L[A,B,C] (dogs)
        System.out.println(dogs);

        Dog dog4 = dogs.get(1);                                     // B (dog2, dog4)
        dog4.setColour("kék-fehér");                                // B' (dog2, dog4)
        System.out.println(dogs);                                   // L[A,B',C] (dogs)

        Dog dog5 = new Dog("Darla", 15, "szürke"); // D (dog5)
        System.out.println(dog5);                                   // D (dog5)
        dog5 = dogs.get(1);                                         // B' (dog2, dog4, dog5) D ()
        System.out.println(dog5);                                   // B' (dog2, dog4, dog5)
        dogs.add(dog5);                                             // L[A,B',C,B'] (dogs)
        System.out.println(dogs);

        Dog dog6 = dog4;                                            // B' (dog2, dog4, dog5, dog6)
        dog6.setColour("tigriscsíkos-fehér");                       // B" (dog2, dog4, dog5, dog6)
        System.out.println(dogs);                                   // L[A,B",C,B"] (dogs)

        List<Dog> dogList = dogs;                                   // L[A,B",C,B"] (dogs, dogList)

        Dog dog7 = dog4;                                            // B" (dog2, dog4, dog5, dog6, dog7)
        dog7.setColour("kék-fehér");                                // B^ (dog2, dog4, dog5, dog6, dog7)
        System.out.println(dogList);                                // L[A,B^,C,B^] (dogs, dogList)

        dog2.setColour("fekete");                                   // B* (dog2, dog4, dog5, dog6, dog7)
        System.out.println(dogList);                                // L[A,B*,C,B*] (dogs, dogList)
        dog2 = null;                                                // B* (dog4, dog5, dog6, dog7)
        System.out.println(dogList);                                // L[A,B*,C,B*] (dogs, dogList)

        Dog dog8 = dogs.get(1);                                     // B* (dog4, dog5, dog6, dog7, dog8)
        dog8 = null;                                                // B* (dog4, dog5, dog6, dog7)
        System.out.println(dogList);                                // L[A,B*,C,B*] (dogs, dogList)

        Dog dog9 = dogs.get(1);                                     // B* (dog4, dog5, dog6, dog7, dog9)
        dog9.setColour("tarka");                                    // B+ (dog4, dog5, dog6, dog7, dog9)
        System.out.println(dogList);                                // L[A,B+,C,B+] (dogs, dogList)
    }
}
