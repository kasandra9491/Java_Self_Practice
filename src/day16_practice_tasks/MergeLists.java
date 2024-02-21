package day16_practice_tasks;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class MergeLists {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(asList(
                10,20,30,40,50,60,70
        ));
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(asList(
                30,40,50,60,70,80,90,100
        ));
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println(list3);

        List<Integer> uniqueList = new ArrayList<>();

        for (Integer each : list3) {
            if (uniqueList.contains(each)) {
                continue;
            }
            uniqueList.add(each);
        }
        System.out.println(uniqueList);

    }
}
