package day09_practice_tasks;

import java.util.Arrays;
import java.util.Collections;

public class MoveTheZeros_09 {

    public static void main(String[] args) {

        int [] array = {10,0,5,0,1,0};

        Arrays.sort(array);

        int[] sortArray = new int [array.length];


        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            sortArray [j] = array[i];
        }
        System.out.println(Arrays.toString(sortArray));

    }
}
