package Java.Informatics;

import java.util.Scanner;

public class Task2936 {
    /* Гипотенуза
Дано два числа a и b. Найдите гипотенузу треугольника с заданными катетами.

Входные данные
В двух строках вводятся два числа (числа целые,положительные, не превышают 1000).

Выходные данные
Выведите ответ на задачу.

Примеры
Входные данные
3
4
Выходные данные
5.0
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sumOfSquares = a * a + b * b; // 3 * 3 + 4 * 4 = 25 | sqrt of 25 = 5
        double hypotenuse = Math.sqrt(sumOfSquares);
        System.out.println(hypotenuse);
    }
}
