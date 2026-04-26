package Java.Examples;

import java.util.HashSet;

public class PrintFirstDuplicate {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 3, 2, 6};

        findFirstDuplicate(numbers);
    }

    public static void findFirstDuplicate(int[] numbers) {

        HashSet<Integer> seen = new HashSet<>();

        for (int num : numbers) {
            if (seen.contains(num)) {
                System.out.println("First duplicate: " + num);
                return;
            }
            seen.add(num);
        }
    }
}
