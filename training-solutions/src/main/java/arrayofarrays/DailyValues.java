package arrayofarrays;

public class DailyValues {
    public int[][] getValues(){
        int[][] result = new int[12][];
        for(int i=0; i<12; i++){
            if(i+1 == 2){
                result[i] = new int[28];
            } else {
                if(i+1 == 4 || i+1 == 6 || i+1 == 9 || i+1 == 11){
                    result[i] = new int[30];
                } else {
                    result[i] = new int[31];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        DailyValues dailyValues = new DailyValues();
        int[][] mtx = dailyValues.getValues();

        for (int[] row : mtx){
            for(int item : row){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
