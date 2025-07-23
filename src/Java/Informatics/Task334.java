package Java.Informatics;//package Java.Informatics;

import java.util.Scanner;

public class Task334 {

    /* Остаток
 Входные данные
 Вводятся 4 числа: a, b, c и d.

 Выходные данные
 Выведите все числа на отрезке от a до b, дающие остаток c при делении на d.
 Если таких чисел не существует, то ничего выводить не нужно.

 Примеры
 Входные данные
 2
 5
 0
 2
 Выходные данные
 2 4
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % d == c) {
                System.out.print(i + " ");
            }
        }
    }
}
