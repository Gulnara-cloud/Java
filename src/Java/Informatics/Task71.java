package Java.Informatics;

import java.util.Scanner;

public class Task71 {
    /*Циклический сдвиг вправо

Напишите программу, которая циклически сдвигает элементы массива вправо
(например, если элементы нумеруются, начиная с нуля, то 0-й элемент становится 1-м,
1-й становится 2-м, ..., последний становится 0-м,
то есть массив {3, 5, 7, 9} превращается в массив {9, 3, 5, 7}).

Входные данные
Сначала задано число 𝑁 — количество элементов в массиве (1≤𝑁≤35).
Далее через пробел записаны 𝑁 чисел — элементы массива.
Массив состоит из целых чисел.

Выходные данные
Необходимо вывести массив, полученный после сдвига элементов.

Примеры
Входные данные
6
4 5 3 4 2 3
Выходные данные
3 4 5 3 4 2
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read number of elements
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Step 2: Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Perform right cyclic shift
        int last = arr[n - 1]; // Save last element

        // Shift all elements one step to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last; // Put last element at the start

        // Step 4: Print the result
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}


