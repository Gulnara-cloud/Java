package Java.Examples;

import java.util.HashMap;
import java.util.Map;

public class NumberFrequency {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 4, 2, 4, 9, 7, 2};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}