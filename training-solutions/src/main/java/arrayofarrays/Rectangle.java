package arrayofarrays;

public class Rectangle {
    public int[][] rectangularMatrix(int size){
        int[][] result = new int[size][];
        for(int i=0; i<size; i++){
            result[i] = new int[size];
            for(int j=0; j<size; j++){
                result[i][j] = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        int[][] mtx = rectangle.rectangularMatrix(4);

        for (int[] row : mtx){
            for(int item : row){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
