package arrayofarrays;

public class Triangular {
    public int[][] triangularMatrix(int size){
        int[][] result = new int[size][];
        for(int i=0; i<size; i++){
            result[i] = new int[i+1];
            for(int j=0; j<i+1; j++){
                result[i][j] = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Triangular triangular = new Triangular();
        int[][] mtx = triangular.triangularMatrix(4);

        for (int[] row : mtx){
            for(int item : row){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
