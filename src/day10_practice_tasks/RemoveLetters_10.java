package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters_10 {

    public static void main(String[] args) {


        ArrayList<Character> list = new ArrayList<>(Arrays.asList('A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'));

        list.removeIf(ch -> Character.isLetter(ch));

        System.out.println(list);


    }
}
