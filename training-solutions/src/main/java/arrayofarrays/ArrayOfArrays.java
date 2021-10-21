package arrayofarrays;

public class ArrayOfArrays {
    public void printArrayOfArrays(int[][] a){
        for(int[] row : a){
            for(int item : row){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] numbers = {
            { 0, 1, 2 },
            { 0, 1, 2 },
            { 0, 1, 2 },
            { 0, 1, 2 },
            { 0, 1, 2 }
        };
        ArrayOfArrays arr = new ArrayOfArrays();
        arr.printArrayOfArrays(numbers);
    }
}
