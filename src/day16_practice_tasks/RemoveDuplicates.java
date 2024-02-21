package day16_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(asList(
                20, 15, 10, 20, 30, 10, 20, 15, 0
        ));

        List<Integer> uniqueList = new ArrayList<>();

        for (Integer each : list) {
            if (uniqueList.contains(each)) {
                continue;
            }
            uniqueList.add(each);
        }
        Collections.sort(uniqueList);
        System.out.println(uniqueList);
    }
}
