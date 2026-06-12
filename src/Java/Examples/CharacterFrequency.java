package Java.Examples;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    public static void main(String[] args) {

        String text = "Los Angeles";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : text.toCharArray()) {

            map.put(c, map.getOrDefault(c, 0) + 1);

        }
        System.out.println(map);
    }
}