package week6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    void treeMap() {
        Map<String, Integer> scores = new TreeMap<>();
        scores.put("Adrian", 10);
        scores.put("John", 20);
//        0(log(N)) time complexity
        System.out.println(scores.get("Adrian"));
    }

    void hashMap() {
        Map<String, Integer> scores = new HashMap<>();
 //       0(1) time complexity
        scores.put("Adrian", 10);
        scores.put("John", 20);
        System.out.println(scores.get("Adrian"));
    }
}
