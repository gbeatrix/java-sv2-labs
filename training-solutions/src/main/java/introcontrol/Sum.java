package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<5; i++){
            System.out.print("Add meg a(z) " + (i+1) + ". számot: ");
            sum += scanner.nextInt();
        }

        System.out.println("A megadott számok összege " + sum);
    }
}
