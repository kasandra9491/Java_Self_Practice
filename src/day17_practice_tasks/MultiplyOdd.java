package day17_practice_tasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MultiplyOdd {

    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);

        Iterator<Map.Entry<Character,Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Character,Integer> entry = itr.next();
            if (entry.getValue() % 2 == 1){
                map.put(entry.getKey(),entry.getValue() * 2);
            }
        }
        System.out.println(map);
    }
}
