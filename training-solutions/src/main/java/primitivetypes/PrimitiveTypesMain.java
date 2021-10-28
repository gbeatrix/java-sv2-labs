package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
        int a = 2;                            // int típusnak megfelelő értékadás
        Integer b = 2;                        // autoboxing
        Integer c = a;                        // autoboxing
        Integer d = b;                        // Integer típusnak megfelelő értékadás
        Integer e = Integer.valueOf(2);       // Integer típusnak megfelelő értékadás
        int f = Integer.valueOf(2);           // autounboxing
        int g = Integer.valueOf(a);           // autounboxing
        int h = Integer.valueOf(c);           // c autounboxing, mert int-et vár a metódus, majd h esetében is autounboxing
        int i = Integer.parseInt("2");     // int típusnak megfelelő értékadás
        Integer j = Integer.parseInt("2"); // autoboxing

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
    }
}
