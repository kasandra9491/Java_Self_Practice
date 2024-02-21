package day16_practice_tasks;

import java.util.*;

public class DifferenceBetweenTwoSets {

    public static void main(String[] args) {

        List<Integer> set1 = new ArrayList<>();
        set1.addAll(Arrays.asList(
                1,2,3,5
        ));
        System.out.println(set1);

        List<Integer> set2 = new ArrayList<>();
        set2.addAll(Arrays.asList(
                2,3,4
        ));
        System.out.println(set2);

        set1.removeAll(set2);
        System.out.println(set1);
    }
}
