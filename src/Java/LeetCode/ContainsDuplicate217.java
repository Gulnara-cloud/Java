package Java.LeetCode;
import java.util.HashSet;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        ContainsDuplicate217 obj = new ContainsDuplicate217();
        int[] nums = {1, 2, 3, 4};
        System.out.println(obj.containsDuplicate(nums));
    }
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!seen.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}

