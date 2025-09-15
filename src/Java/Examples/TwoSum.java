package Java.Examples;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> lastSeen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int b = nums[i];
            int a = target - b;
            if (lastSeen.containsKey(a)) {
                return new int[]{lastSeen.get(a), i};
            }
            lastSeen.put(b, i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = obj.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
