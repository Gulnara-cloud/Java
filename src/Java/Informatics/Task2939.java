package Java.Informatics;

import java.util.Scanner;

public class Task2939 {
    /* Дележ яблок - 2
N школьников делят K яблок поровну,
неделящийся остаток остается в корзинке.
Сколько яблок останется в корзинке?

Входные данные
Программа получает на вход числа N и K.

Выходные данные
Программа должна вывести искомое количество яблок.

Примеры
Входные данные
3
14
Выходные данные
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int leftOverApples = K % N;
        System.out.println(leftOverApples);
    }
}
