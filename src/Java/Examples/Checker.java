package Java.Examples;

import java.util.HashMap;

public class Checker {

    public static boolean hasDuplicates(int[] nums) {
        HashMap<Integer, Integer> values = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (values.containsKey(nums[i])) {
                return true;
            }
            values.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 4};
        boolean result = hasDuplicates(nums);
        System.out.println(result);
    }
}
