package Java.Informatics;

import java.util.Scanner;

public class Task315 {
    /* Сумма квадратов
По данному натуральному n вычислите сумму 12+22+...+n2.

Входные данные
Вводится единственное натуральное число n, не превосходящее 100

Выходные данные
Необходимо вывести  вычисленную сумму.

Примеры
Входные данные
2
Выходные данные
5 | 1sq + 2 sq = 1 + 4 = 5
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }
}
