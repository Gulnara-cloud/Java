package Java.Informatics;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task255 {
    /*Требуется определить, бьет ли слон, стоящий на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.

Входные данные
Вводятся четыре числа: координаты слона и координаты другой фигуры. Координаты - целые числа в интервале от 1 до 8.

Выходные данные
Требуется вывести слово YES, если слон способен побить фигуру за 1 ход, в противном случае вывести слово NO

        * * * * * * * * * * * * *
        * * * * * * * * * * * * *
        * * * * * * E * * * * * *
        * * * * * * * * * * * * *
        * * * * * * * * * * * * *
        * * * * * * * * * * * * *
        * * B * * * * * * * * * *
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int BishopLine = sc.nextInt();
        int BishopColumn = sc.nextInt();
        int EnemyLine = sc.nextInt();
        int EnemyColumn = sc.nextInt();
        if (abs(BishopLine - EnemyLine) == abs(BishopColumn - EnemyColumn)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


