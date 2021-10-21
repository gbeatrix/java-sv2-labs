package arrays;

import java.util.Arrays;

public class ArraysMain {
    public String numberOfDaysAsString(){
        int[] numberOfDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size){
        int[][] mult = new int[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                mult[i][j] = (i+1)*(j+1);
            }
        }
        return Arrays.deepToString(mult);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day, anotherDay);
    }

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();

        System.out.println(arraysMain.numberOfDaysAsString());

        System.out.println(arraysMain.multiplicationTableAsString(7));

        double[] mon = { 14, 14, 13, 13, 12, 11, 10, 10, 10, 11, 12, 14, 14, 14, 15, 15, 15, 14, 14, 13, 12, 11, 11, 10 };
        double[] tue = { 14, 14, 13, 13, 12, 11, 10, 10, 10, 11, 12, 14, 15, 15, 16, 16, 16, 15, 15, 14, 13, 12, 12, 11 };
        double[] sat = Arrays.copyOf(mon, mon.length);
        System.out.println(arraysMain.sameTempValues(mon, sat)?"pass":"fail");
        System.out.println(arraysMain.sameTempValues(mon, tue)?"fail":"pass");
    }
}
