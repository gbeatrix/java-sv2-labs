package math.math;

public class MathMethods {
    public static void main(String[] args) {
        int a = -143;
        int b = -257;
        System.out.println(Math.max( a,  b));
        System.out.println(Math.max(-a, -b));
        System.out.println(Math.min( a,  b));
        System.out.println(Math.min(-a, -b));
        System.out.println(Math.PI);
        System.out.println(Math.round(Math.PI));
        System.out.println(Math.round( 28.678));
        System.out.println(Math.round(-28.678));
        System.out.println(Math.abs( a));
        System.out.println(Math.abs(-a));
        System.out.println(Math.negateExact(-a));
        System.out.println(Math.negateExact( a));
        System.out.println(Math.addExact(a, b));
        System.out.println(Math.subtractExact(a, b));
        System.out.println(Math.multiplyExact(256, 4));
        System.out.println(Math.pow(256, 1.25));
        System.out.println(Math.incrementExact(a));
        System.out.println(Math.decrementExact(a));
        System.out.println(Math.random());
    }
}
