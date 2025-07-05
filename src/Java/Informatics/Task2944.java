package Java.Informatics;

import java.util.Scanner;

public class Task2944 {
    /* Сумма цифр
Дано трехзначное число. Найдите сумму его цифр.

Входные данные
Вводится трехзначное число.

Выходные данные
Выведите ответ на задачу.

Примеры
Входные данные
179
Выходные данные
17
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int a = number / 100;
        int b = (number / 10) % 10;
        int c = number % 10;

        int sum = a + b + c;
        System.out.println(sum);
    }
}