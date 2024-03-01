package day17_practice_tasks;
import java.util.HashMap;
import java.util.Map;

public class Mergemaps {

    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('A', 10);
        map.put('B', 20);

        Map<Character,Integer> map1 = new HashMap<>();
        map1.put('B', 30);
        map1.put('C', 40);

        for (Map.Entry<Character,Integer> entry : map.entrySet()) {

            if (map1.containsKey(entry.getKey())) {
                map1.put(entry.getKey(), map1.get(entry.getKey()) + entry.getValue());
            } else {
                map1.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println(map1);
    }
}
