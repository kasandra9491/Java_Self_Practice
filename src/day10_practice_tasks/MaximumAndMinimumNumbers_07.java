package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumAndMinimumNumbers_07 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int maxNumber = Collections.max(list);
        int minNumber = Collections.min(list);

        System.out.println("Maximum number is " + maxNumber);
        System.out.println("Minimum number is " + minNumber);
    }
}
