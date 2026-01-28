package Java.Examples.SetDemo;

import java.util.HashSet;

public class DuplicateCheck {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        System.out.println(containsDuplicate(arr));
    }
}
