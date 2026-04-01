package Java.Examples;

public class EvenSum {
    public static void main(String[] args) {
        int[] numbers = {5, 13, 8, 12, 3, 7, 10};

        int sum = 0;

        for (int num : numbers) {
            if (num % 2 == 0 && num > 5) {
                sum += num;
            }
        }

        System.out.println("Sum: " + sum);
    }
}