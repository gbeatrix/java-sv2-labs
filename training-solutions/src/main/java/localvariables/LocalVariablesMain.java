package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {
        boolean b;
        // System.out.println(b);
        // java: variable b might not have been initialized

        b = false;
        System.out.println(b); // false

        int a = 2;
        System.out.println(a); // 2

        int i = 3;
        int j = 4;
        int k = i;
        System.out.println("i: "+i+", j: "+j+", k: "+k); // i: 3, j: 4, k: 3

        // System.out.println(s);
        // java: cannot find symbol

        String s;
        s = "Hello World";
        System.out.println(s); // Hello World

        String t = s;
        System.out.println(t); // Hello World

        {
            int x = 0;
            System.out.println(x); // 0
            System.out.println(a); // 2
        }

        // System.out.println(x);
        // java: cannot find symbol
    }
}
