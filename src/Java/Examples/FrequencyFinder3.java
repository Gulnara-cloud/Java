package Java.Examples;

import java.util.*;

public class FrequencyFinder3 {

    public static List<Integer> topKFrequent(int[] numbers, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // count frequency
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // create list from map entries
        List<Integer> list = new ArrayList<>(frequencyMap.keySet());

        // sort by frequency (descending)
        list.sort((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

        // take top k
        return list.subList(0, k);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 2, 2, 3};
        int k = 2;

        List<Integer> result = topKFrequent(numbers, k);

        System.out.println(result);
    }
}