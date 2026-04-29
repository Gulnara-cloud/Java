package Java.Examples;

import java.util.HashSet;
import java.util.ArrayList;

public class SequenceFinder2 {

    public static ArrayList<Integer> longestConsecutiveSequence(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : numbers) {
            set.add(num);
        }
        int bestStart = 0;
        int bestLength = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                if (currentLength > bestLength) {
                    bestLength = currentLength;
                    bestStart = num;
                }
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < bestLength; i++) {
            result.add(bestStart + i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {100, 4, 200, 1, 3, 2};

        ArrayList<Integer> result = longestConsecutiveSequence(numbers);

        System.out.println(result);
    }
}