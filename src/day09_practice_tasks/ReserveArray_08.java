package day09_practice_tasks;

import java.util.Arrays;

public class ReserveArray_08 {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int[] reversedArray = new int [array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray [j] =array[i];
        }
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }
}
