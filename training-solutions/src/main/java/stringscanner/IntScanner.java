package stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntScanner {
    public String convertInts(String ints){
        Scanner intScanner = new Scanner(ints).useDelimiter(";");
        List<Integer> bigInts = new ArrayList<>();
        for (;intScanner.hasNextInt();) {
            int k = intScanner.nextInt();
            if(k>100){
                bigInts.add(k);
            }
        }

        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for(int bigInt : bigInts){
            if(first){
                first = false;
            } else {
                sb.append(",");
            }
            sb.append(bigInt);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        IntScanner intScanner = new IntScanner();
        System.out.println(intScanner.convertInts("5;3;107;12;123;18;198"));
    }
}
