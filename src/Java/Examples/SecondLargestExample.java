package Java.Examples;

public class SecondLargestExample {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 20, 8, 20, 15};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest number");
        } else {
            System.out.println("Second largest: " + secondLargest);
        }
    }
}