package Java.Examples;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();

        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);

        System.out.println("Alice's score: " + scores.get("Alice"));

        if (scores.containsKey("Bob")) {
            System.out.println("Bob exists in the map");
        }

        scores.put("Alice", 100);

        scores.remove("Charlie");

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}