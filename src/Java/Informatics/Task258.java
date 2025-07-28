package Java.Informatics;

import java.util.Scanner;

public class Task258 {
    /* Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек,
    если разрешается сделать один разлом по прямой между дольками (то есть разломить шоколадку на два прямоугольника).
Входные данные
Вводятся 3 числа: n, m и k; k не равно n × m. Гарантируется, что количество долек в шоколадке не превосходит 30000.
Выходные данные
Программа должна вывести слово YES, если возможно отломить указанное число долек, в противном случае вывести слово NO.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        if (k < m * n & (k % n == 0 | k % m == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
