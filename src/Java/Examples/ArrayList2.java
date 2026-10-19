package Java.Examples;

import java.util.*;

// Backed by dynamic arrays (resizes automatically).
// Default capacity = 10; when exceeded, grows by ~50%.
// Performance:
// Access by index: O(1) (fast lookup)
// Insert at end: Amortized O(1)
// Insert/remove in middle: O(n) (because elements shift)
// Use Case: Best when you need fast random access and fewer insertions/removals in middle.

public class ArrayList2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(60);
        System.out.println(nums.get(1));

        // replace, set
        nums.set(1, 15);
        System.out.println(nums);

        // remove
        nums.remove(2);
        System.out.println(nums);

        // size
        System.out.println(nums.size());

        // contains
        System.out.println(nums.contains(60)); // false

        //subList , int fromIndex - to int Index
        List<Integer> sub = nums .subList(0,2);
        System.out.println(sub);
    }
}