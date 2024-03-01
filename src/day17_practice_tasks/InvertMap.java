package day17_practice_tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class InvertMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        Map<String,Integer> invertMap = new HashMap<>();

        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            invertMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println(invertMap);
    }
}
