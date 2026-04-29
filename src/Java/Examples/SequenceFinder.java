package Java.Examples;

import java.util.HashSet;

public class SequenceFinder {
    public static int longestConsecutive(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        // add all numbers to set
        for (int num : numbers) {
            set.add(num);
        }
        int maxLength = 0;

        for (int num : set) {
            // start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] numbers = {100, 4, 200, 1, 3, 2};

        int result = longestConsecutive(numbers);

        System.out.println(result);
    }
}