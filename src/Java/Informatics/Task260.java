package Java.Informatics;

import java.util.Scanner;

public class Task260 {
    /*Уравнение
Решить в целых числах уравнение ax + b = 0.

Входные данные
Вводятся 2 целых числа: a и b.

Выходные данные
Необходимо вывести все решения, если их число конечно,
“NO” (без кавычек), если решений нет, и “INF” (без кавычек),
если решений бесконечно много.

Примеры
Входные данные
6
-2
Выходные данные
NO
Входные данные
1
1
Выходные данные
-1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("INF");
            } else {
                System.out.println("NO");
            }
        } else {
            if (-b % a == 0) {
                System.out.println(-b / a);
            } else {
                System.out.println("NO");
            }
        }
    }
}