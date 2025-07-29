package Java.Informatics;

import java.util.Scanner;

public class Task261 {
    /* Сложное уравнение
Решить в целых числах уравнение ( ax + b ) : ( cx + d ) = 0.

Входные данные
Вводятся 4 числа: a, b, c и d; c и d не равны нулю одновременно.

Выходные данные
Необходимо вывести все целочисленные решения, если их число конечно,
“NO” (без кавычек),если целочисленных решений нет, и “INF” (без кавычек),
если их бесконечно много.

Примеры
Входные данные
1
1
2
2

Выходные данные
NO

Входные данные
2
-4
7
1

Выходные данные
2
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("INF");
                } else {
                    System.out.println("INF");
                }
            } else {
                System.out.println("NO");
            }
        } else {
            if (-b % a != 0) {
                System.out.println("NO");
            } else {
                int x0 = -b / a;
                if (c * x0 + d == 0) {
                    System.out.println("NO");
                } else {
                    System.out.println(x0);
                }
            }
        }
    }
}

