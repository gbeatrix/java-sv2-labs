package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean boat2 = false;
        boolean boat3 = false;
        boolean boat5 = false;
        int capacity = 10;

        System.out.print("Add meg a csoport létszámát: ");
        int num = scanner.nextInt();

        if(num>3){
            boat5 = true;
            num -= 5;
            capacity -= 5;
        }
        if(num>2){
            boat3 = true;
            num -= 3;
            capacity -= 3;
        }
        if(num>0){
            boat2 = true;
            num -= 2;
            capacity -= 2;
        }

        System.out.println("A csoport az alábbi csónakokat vitte el:");
        System.out.print(boat2?"2 személyes\n":"");
        System.out.print(boat3?"3 személyes\n":"");
        System.out.print(boat5?"5 személyes\n":"");

        if(capacity>0){
            System.out.println("Még " + capacity + " fő mehet utánuk.");
        }

        if(num>0){
            System.out.println("Még " + num + " fő maradt a parton.");
        }

    }
}
