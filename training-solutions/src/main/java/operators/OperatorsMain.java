package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators = new Operators();

        System.out.println(Integer.toBinaryString(2021));
        System.out.println("A 2021 " + (operators.isEven(2021)?"páros":"páratlan"));
        System.out.println("A 2022 " + (operators.isEven(2022)?"páros":"páratlan"));
        System.out.println(operators.getResultOfDivision(16, 3));

        String s = null;
        System.out.println(operators.isNull(s));
        System.out.println(operators.isNull(null));
        System.out.println(operators.isNull(""));
        s = "null";
        System.out.println(operators.isNull(s));

        String t = null;
        System.out.println(operators.isEmpty(t));
        System.out.println(operators.isEmpty(null));
        System.out.println(operators.isEmpty(""));
        t = "null";
        System.out.println(operators.isEmpty(t));
    }
}
