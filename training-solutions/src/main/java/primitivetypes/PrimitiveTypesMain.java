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

        boolean k = true; // típusnak megfelelő értékadás
        Boolean l = true; // autoboxing
        boolean m = Boolean.valueOf(true); // autounboxing
        Boolean n = Boolean.valueOf(true); // típusnak megfelelő értékadás
        boolean o = Boolean.parseBoolean("TrUe"); // típusnak megfelelő értékadás
        Boolean p = Boolean.parseBoolean("TrUe"); // autoboxing
        boolean q = Boolean.parseBoolean("TreU"); // típusnak megfelelő értékadás
        Boolean r = Boolean.parseBoolean("TreU"); // autoboxing

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
    }
}
