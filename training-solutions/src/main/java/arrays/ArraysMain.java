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

    public int min(int a, int b){
        return a<b ? a : b;
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay){
        int len = min(day.length, anotherDay.length);
        return sameTempValues(Arrays.copyOfRange(day, 0, len), Arrays.copyOfRange(anotherDay, 0, len));
    }

    public boolean wonLottery(int[] ticket1, int[] ticket2){
        int[] t1 = Arrays.copyOf(ticket1, ticket1.length);
        int[] t2 = Arrays.copyOf(ticket2, ticket2.length);
        Arrays.sort(t1);
        Arrays.sort(t2);
        return Arrays.equals(t1, t2);
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

        double[] fri = Arrays.copyOf(mon, mon.length-1);
        double[] sun = new double[25];
        sun[0] = mon[mon.length-1];
        System.arraycopy(mon, 0, sun, 1, mon.length);
        System.out.println(Arrays.toString(sun));
        System.out.println(arraysMain.sameTempValuesDaylight(mon, fri)?"pass":"fail");
        System.out.println(arraysMain.sameTempValuesDaylight(sun, fri)?"fail":"pass");

        int[] ticket = { 64, 49, 86, 73, 22 };
        System.out.println(arraysMain.wonLottery(ticket, new int[]{ 25, 36, 49, 64, 81 })?"Nyert":"Talán legközelebb");
        System.out.println(arraysMain.wonLottery(ticket, new int[]{ 22, 73, 86, 49, 64 })?"Nyert":"Talán legközelebb");
        System.out.println(Arrays.toString(ticket));
    }
}
