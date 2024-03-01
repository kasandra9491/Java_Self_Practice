package day17_practice_tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabcccdeeeef";
        Map<String, Integer> uniqueCharactersMap = new LinkedHashMap<>();

        for (String each : str.split("")) {
            if(Collections.frequency(Arrays.asList(str.split("")), each) ==1){
                uniqueCharactersMap.put( each, 1);
            }
        }

        System.out.println(uniqueCharactersMap);

    }

}
