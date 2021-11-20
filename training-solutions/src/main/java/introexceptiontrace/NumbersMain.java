package introexceptiontrace;

import java.util.Arrays;

public class NumbersMain {
    public static void main(String[] args) {
        Change change = new Change();
        int[] arr = change.changeNumbers();
        System.out.println(Arrays.toString(arr));
    }
}

// A 8-ik sorban a change.changeNumbers() hívásakor
// a Change osztályban az 5-ik sorban a new RandomOperations().getNumbers() hívásakor
// a RandomOperations osztályban a 13-ik sorban a numbers[i] ArrayIndexOutOfBoundsException-t dob,
// mert a for ciklus feltétele hibás, i==lengthOfArray-re már túlindexelés történik
