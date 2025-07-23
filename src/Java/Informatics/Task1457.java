package Java.Informatics;

import java.util.Scanner;

import static week3.strings.Palindrome.reverse;

public class Task1457 {
    /* Двойной переворот

Дана последовательность натуральных чисел 1, 2, 3, ...,
N (1 ≤ N ≤ 1000). Необходимо сначала расположить
в обратном порядке часть этой последовательности
от элемента с номером A до элемента с номером B,
а затем от C до D (A < B; C < D; 1 ≤ A, B, C, D ≤ N).

Входные данные
Вводятся натуральные числа числа N, A, B, C, D.

Выходные данные
Требуется вывести полученную последовательность.

Примеры
Входные данные
9 2 5 6 9
Выходные данные
1 5 4 3 2 9 8 7 6
Входные данные
9 3 6 5 8
Выходные данные
1 2 6 5 8 7 3 4 9
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int n = sc.nextInt();      // size of sequence
        int a = sc.nextInt() - 1;  // convert to 0-based
        int b = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;
        int d = sc.nextInt() - 1;

        // Create initial array: 1 to N
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        // First reversal: from a to b
        int i = a, j = b;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // Second reversal: from c to d
        i = c;
        j = d;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        // Print result
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }

        sc.close();
    }
}