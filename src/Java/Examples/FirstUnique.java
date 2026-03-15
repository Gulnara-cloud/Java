package Java.Examples;

import java.util.HashMap;
import java.util.Map;

public class FirstUnique {

    public static int firstUnique(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {5, 1, 4, 2, 1, 2};
        System.out.println(firstUnique(nums));
    }
}
