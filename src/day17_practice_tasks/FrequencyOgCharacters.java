package day17_practice_tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOgCharacters {

    public static void main(String[] args) {

        String stroka = "bbcccaaaaa";

        Map<Character,Integer> map = new HashMap<>();

        for (Character ch : stroka.toCharArray()) {

            if (map.containsKey(ch)) {
                map.put((ch), map.get(ch) + 1);
            }
            else {
                map.put((ch), 1);
            }
        }
        System.out.println(map);
    }
}
