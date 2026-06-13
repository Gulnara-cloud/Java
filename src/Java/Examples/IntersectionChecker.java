package Java.Examples;

import java.util.HashSet;

public class IntersectionChecker {

    public static HashSet<Integer> findIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }
        for (int num : arr2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 6, 6};

        HashSet<Integer> intersection = findIntersection(arr1, arr2);
        System.out.println(intersection);
    }
}