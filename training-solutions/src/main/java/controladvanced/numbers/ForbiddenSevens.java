package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add meg a kezdőszámot: ");
        int num = scanner.nextInt();
        while(!(Integer.toString(num).contains("7") && num%7!=0)){
            System.out.print((num%7==0?"X":num) + " ");
            num++;
        }
    }
}
