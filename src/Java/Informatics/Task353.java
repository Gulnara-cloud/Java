package Java.Informatics;

import java.util.Scanner;

public class Task353 {
    /* Сумма степеней
Входные данные
Вводится натуральное число N, которое не превосходит 30.

Выходные данные
Вычислите 1+2+22+23+…+2 N.

Операцией возведения в степень пользоваться запрещено

Примеры
Входные данные
4
Выходные данные
31 | 1 + 2 + 2sq + 2cube + ...+ 2N | If N = 4 | 1 + 2 + 4 + 8 + 16 = 31
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        int term = 1;

        for(int i = 1; i <= n; i++) {
            term *= 2;
            sum += term;
        }
        System.out.println(sum);
    }
}

