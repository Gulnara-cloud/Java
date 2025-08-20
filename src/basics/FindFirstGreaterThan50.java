package basics;

import java.util.Scanner;

public class FindFirstGreaterThan50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > 50) {
                System.out.println(numbers[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No number greater than 50 found");
        }
        sc.close();
    }
}

