package Java.Informatics;

import java.util.Scanner;

public class Task72 {
    /* Максимум в массиве

Вводится массив, состоящий из целых чисел. Найти наибольшее среди них.

Входные данные
Сначала задано число 𝑁 — количество элементов в массиве (1≤𝑁≤35).
Далее через пробел записаны 𝑁 чисел — элементы массива.
Массив состоит из целых чисел.

Выходные данные
Необходимо вывести значение наибольшего элемента в массиве.

Примеры
Входные данные
3
1 2 3

Выходные данные
3
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        sc.close();
    }
}

