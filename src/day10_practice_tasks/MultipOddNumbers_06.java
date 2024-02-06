package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MultipOddNumbers_06 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        for (int i =0; i < list.size(); i++){
            int num = list.get(i);
            if (i%2==0){
                list.set(i,num *2);
            }
            }
        System.out.println(list);
        }
    }
