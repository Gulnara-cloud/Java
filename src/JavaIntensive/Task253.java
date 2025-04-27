package JavaIntensive;

import java.util.Scanner;

public class Task253 {
 /*   Требуется определить, является ли данный год високосным. (Напомним, что год является високосным, если его номер кратен 4, но не кратен 100, а также если он кратен 400.)

Входные данные
Вводится единственное число - номер года (целое, положительное, не превышает 30000).

Выходные данные
Требуется вывести слово YES, если год является високосным и NO - в противном случае.
  */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 & year % 100 != 0 | year % 400 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

