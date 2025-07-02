package Java.Informatics;

import java.util.Scanner;

public class Task67 {
    /* Есть ли два элемента с одинаковыми знаками
 Дан массив, состоящий из целых чисел.
 Напишите программу, которая определяет,
 есть ли в массиве пара соседних элементов с одинаковыми знаками.

 Входные данные
 Сначала задано число 𝑁 — количество элементов в массиве (1≤𝑁≤10000).
 Далее через пробел записаны 𝑁
 чисел — элементы массива.
 Массив состоит из целых чисел не равных 0.

 Выходные данные
 Необходимо вывести слово YES,
 если существует пара соседних элементов с одинаковыми знаками.
 В противном случае следует вывести слово NO.

 Примеры
 Входные данные
 5
 1 -3 4 -2 1
 Выходные данные
 NO
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        boolean found = false;
        for (int i = 0; i < n - 1; i++) {
            if((array[i] > 0 && array[i + 1] > 0) || (array[i] < 0 && array[i + 1] < 0)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
