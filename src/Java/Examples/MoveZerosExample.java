package Java.Examples;

import java.util.Arrays;

public class MoveZerosExample {
    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 0, 12};

        int index = 0;

        for (int number : numbers) {
            if (number != 0) {
                numbers[index] = number;
                index++;
            }
        }

        while (index < numbers.length) {
            numbers[index] = 0;
            index++;
        }

        System.out.println(Arrays.toString(numbers));
    }
}