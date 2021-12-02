package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonAncestor {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        objects.add(new Fruit()); // @
        objects.add(new Apple()); // @
        objects.add(new Starking()); // @
        objects.add(new Vegetable());
        objects.add("alma");
        objects.add(12);
        objects.add('x');
        objects.add(LocalDate.now());
        objects.add(new int[]{2, 3, 5, 7}); // @
        objects.add(Arrays.asList("kettő", "három", "öt", "hét"));
        System.out.println(objects);
    }
}
