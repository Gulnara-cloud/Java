package Java.Examples;

import java.util.Arrays;

public class hasDuplicates {

    public static boolean hasDuplicate(int[] numbers) {
        Arrays.sort(numbers); // sort array first

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 3};

        boolean result = hasDuplicate(numbers);

        System.out.println(result);
    }
}