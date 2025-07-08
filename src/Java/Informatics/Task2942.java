package Java.Informatics;

import java.util.Scanner;

public class Task2942 {
    /*Число десятков двузначного числа
Дано двузначное число. Найдите число десятков в нем.

Входные данные
Вводится двухзначное число.

Выходные данные
Выведите ответ на задачу.

Примеры
Входные данные
42
Выходные данные
4
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int tens = number/ 10;
        System.out.println(tens);
    }
}
