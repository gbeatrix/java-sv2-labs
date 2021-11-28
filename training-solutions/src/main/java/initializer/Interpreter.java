package initializer;

public class Interpreter {

    private String field;

    public Interpreter() {
        System.out.print(1);                // 6
    }

    {
        System.out.print(2);                // 3,7
    }

    {
        System.out.print(3);                // 4,8
    }

    static {
        System.out.print(4);                // 1
    }

    public Interpreter(String field) {
        System.out.print(5);                // 10
    }

    {
        System.out.print(6);                // 5,9
    }

    static {
        System.out.print(7);                // 2
    }

    public static void main(String[] args) {
        Interpreter interpreterOne = new Interpreter();
        Interpreter interpreterTwo = new Interpreter("");
        // kiírás: 4723612365
    }
}
