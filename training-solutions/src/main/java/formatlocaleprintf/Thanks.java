package formatlocaleprintf;

import java.util.Arrays;
import java.util.List;

public class Thanks {
    public static void main(String[] args) {
        List<String> persons = Arrays.asList("Remek Elek", "Zsíros B. Ödön", "Major Anna", "Gipsz Jakab", "Szikla Szilárd");
        for (String person : persons) {
            System.out.printf("Kedves %s! Örülünk, hogy termékünket választotta!%n", person);
        }
    }
}
