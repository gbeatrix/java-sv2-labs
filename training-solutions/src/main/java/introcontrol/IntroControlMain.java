package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl ic = new IntroControl();

        System.out.println(6 == ic.subtractTenIfGreaterThanTen(6)?"pass":"fail");
        System.out.println(96 == ic.subtractTenIfGreaterThanTen(106)?"pass":"fail");

        System.out.println(ic.describeNumber(0).equals("zero")?"pass":"fail");
        System.out.println(ic.describeNumber(1).equals("not zero")?"pass":"fail");

        System.out.println(ic.greetingToJoe("Joe").equals("Hello Joe")?"pass":"fail");
        System.out.println(ic.greetingToJoe("Jane").equals("")?"pass":"fail");

        System.out.println(123_054 == ic.calculateBonus(1_230_540)?"pass":"fail");
        System.out.println(0 == ic.calculateBonus(930_540)?"pass":"fail");

        System.out.println(500 == ic.calculateConsumption(7453, 7953)?"pass":"fail");
        System.out.println(500 == ic.calculateConsumption(9753,253)?"pass":"fail");

        System.out.println("Print numbers to 3:");
        ic.printNumbers(3);

        System.out.println("Print numbers from 3 to 7:");
        ic.printNumbersBetween(3,7);
        System.out.println("Print numbers from 4 to 6:");
        ic.printNumbersBetween(6,4);

        System.out.println("Print numbers from 13 to 17:");
        ic.printNumbersBetweenAnyDirection(13,17);
        System.out.println("Print numbers from 16 to 14:");
        ic.printNumbersBetweenAnyDirection(16,14);

        System.out.println("Print odd numbers to 7:");
        ic.printOddNumbers(7);
    }
}
