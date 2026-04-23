package Java.Examples;

import java.util.HashMap;

public class Program {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> values = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            if (values.containsKey(needed)) {
                return new int[]{values.get(needed), i};
            }
            values.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
