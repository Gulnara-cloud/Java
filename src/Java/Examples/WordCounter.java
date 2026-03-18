package Java.Examples;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) {

        String text = "Los Angeles is the most beautiful city in US";

        String[] words = text.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {

            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
    }
}