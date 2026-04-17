package Java.Examples;

import java.util.*;

class DuplicateValidator {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }

            seen.add(num);
        }

        return false;
    }
    public static void main(String[] args) {

        DuplicateValidator checker = new DuplicateValidator();

        boolean result = checker.hasDuplicate(
                new int[]{1, 2, 3, 1}
        );

        System.out.println(result);
    }
}