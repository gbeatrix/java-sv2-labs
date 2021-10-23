package finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {
    public static final List<String> DAYS = Arrays.asList("hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap");

    public static void main(String[] args) {
        System.out.println(DAYS);
        DAYS.set(1, "szerda");
        System.out.println(DAYS);
    }
}
