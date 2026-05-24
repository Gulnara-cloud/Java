package Java.Examples;

import java.util.Arrays;

public class ArrayExample {

    public static int findSecondLargest(int[] numbers) {

        Arrays.sort(numbers);

        return numbers[numbers.length - 2];
    }

    public static void main(String[] args) {

        int[] numbers = {13, 5, 8, 21, 19};

        int result = findSecondLargest(numbers);

        System.out.println(result);
    }
}