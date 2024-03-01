package day16_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovePalindrome {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                "Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"
        ));

        List<String> result = new ArrayList<>();

        for (String each : list) {
            String reversedStr = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reversedStr += each.charAt(i);
            }

            if (!each.equalsIgnoreCase(reversedStr)) {
                result.add(each);
            }
        }

        System.out.println(result);

    }

}
