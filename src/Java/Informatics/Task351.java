package Java.Informatics;

import java.util.Scanner;

public class Task351 {
    /* Факториал
Вычислите N! ("эн-факториал") – произведение всех натуральных чисел от 1 до N ( N!=1∙2∙3∙…∙ N ).

Входные данные
Вводится единственное число N – натуральное, не превосходит 12.

Выходные данные
Выведите полученное значение N!

Примеры
Входные данные
3
Выходные данные
6 | 3 = 1 * 2 * 3 = 6
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= N; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
