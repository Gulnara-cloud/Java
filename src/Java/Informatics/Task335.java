package Java.Informatics;

import java.util.Scanner;

public class Task335 {
    /* Квадраты
Входные данные
Вводятся целые числа a и b. Гарантируется, что a не превосходит b.

Выходные данные
Выведите все числа на отрезке от a до b, являющиеся полными квадратами.
Если таких чисел нет, то ничего выводить не нужно.

Примеры
Входные данные
2
8
Выходные данные
4
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            int sqrt = (int)Math.sqrt(i);
            if (sqrt * sqrt == i) {
                System.out.println(i + " ");
            }
        }
    }
}
