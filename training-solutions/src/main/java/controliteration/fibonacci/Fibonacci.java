package controliteration.fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány elemet írjak ki?");
        int limit = scanner.nextInt();

        int f0=0;
        int f1=1;
        int tmp;
        for(int i=0; i<limit; i++){
            System.out.print(f0 + ", ");
            tmp = f0+f1;
            f0 = f1;
            f1 = tmp;
        }
        System.out.println();

        List<Integer> fibonacci = new ArrayList<>();
        while(fibonacci.size()<limit){
            int n = fibonacci.size();
            if(n==0){
                fibonacci.add(0);
            } else if(n==1){
                fibonacci.add(1);
            } else {
                fibonacci.add(fibonacci.get(n-1)+fibonacci.get(n-2));
            }
        }
        System.out.println(fibonacci);
    }
}
