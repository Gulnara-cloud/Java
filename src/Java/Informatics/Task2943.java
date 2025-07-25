package Java.Informatics;

import java.util.Scanner;

public class Task2943 {
    /*Число десятков
Дано неотрицательное целое число.
Найдите число десятков в его десятичной записи
(то есть вторую справа цифру его десятичной записи).

Входные данные
Вводится неотрицательное целое число.

Выходные данные
Выведите ответ на задачу.

Примеры
Входные данные
179
Выходные данные
7
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;
        System.out.println(b);
    }
}
