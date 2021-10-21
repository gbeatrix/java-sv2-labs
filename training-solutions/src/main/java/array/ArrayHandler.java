package array;

public class ArrayHandler {
    void addIndexToNumber(int[] source){
        for(int i=0; i<source.length; i++){
            source[i] += i;
        }
    }

    void concatenateIndexToWord(String[] source){
        for(int i=0; i<source.length; i++){
             source[i] = i + source[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0, 0, 2, 6, 12};
        String[] words = new String[] {"alma", "banán", "citrom", "dinnye", "eper"};

        ArrayHandler ah = new ArrayHandler();
        ah.addIndexToNumber(nums);
        ah.concatenateIndexToWord(words);

        for(int num : nums) {
            System.out.println(num);
        }
        System.out.println();

        for(String word : words) {
            System.out.println(word);
        }
        System.out.println();

        for(int num : nums) {
            System.out.print(num + ", ");
        }
        System.out.println();

        for(String word : words) {
            System.out.print(word + ", ");
        }
        System.out.println();
    }
}
