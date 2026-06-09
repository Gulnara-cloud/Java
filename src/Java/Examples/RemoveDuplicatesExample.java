package Java.Examples;

public class RemoveDuplicatesExample {
    public static void main(String[] args) {

        int[] numbers = {1, 1, 2, 2, 3, 4, 4};

        int k = removeDuplicates(numbers);

        System.out.println("Unique count: " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static int removeDuplicates(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int index = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1]) {
                numbers[index] = numbers[i];
                index++;
            }
        }

        return index;
    }
}