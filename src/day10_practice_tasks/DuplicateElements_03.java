package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements_03 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

    }
}
