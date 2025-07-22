package Java.Informatics;

import java.util.Scanner;

public class Task312 {
    /* Степень
Напишите программу, вычисляющую 2 N.
Операцию возведения в степень использовать запрещено.

Входные данные
Вводится целое неотрицательное число N, которое не превосходит 30.

Выходные данные
Выведите число 2 N.

Примеры
Входные данные
4  | N = 4
Выходные данные
16 | 2*2*2*2 = 16 / 2N = 16 | Calculating two(2) four(4) times
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 1;

        for(int i = 1; i <= N; i++) {
            num *= 2;
        }
        System.out.println(num);
    }
}
