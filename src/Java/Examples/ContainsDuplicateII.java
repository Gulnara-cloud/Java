package Java.Examples;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // Keep the window size <= k
            if (i > k) {
                window.remove(nums[i - k - 1]);
            }

            // Duplicate found
            if (!window.add(nums[i])) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 5};

        System.out.println(containsNearbyDuplicate(nums, 3));
    }
}