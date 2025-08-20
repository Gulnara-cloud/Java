package basics;

import java.util.Random;

public class FindMinMax {
    // Arrays// Find min and max in an array of random numbers

    public static void main(String[] args) {
        // step 1// Create an array
        int[] numbers = new int[10];

        // step 2// Fill the array with random numbers (0 to 99)
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);// random number from 0 to 99
        }
        // step 3// Print the array
        System.out.println("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // step 4// Initialize min and max
        int min = numbers[0];
        int max = numbers[0];

        // step 5// Loop through the array to find min and max
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        // step 6// Print min and max
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " +max);
    }
}
