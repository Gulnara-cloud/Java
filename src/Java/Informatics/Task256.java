package Java.Informatics;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task256 {
    /* Требуется определить, бьет ли ферзь,стоящий на клетке с указанными координатами
      (номер строки и номер столбца),фигуру, стоящую на другой указанной клетке.
      Входные данные
      Вводятся четыре числа: координаты ферзя и координаты другой фигуры.
      Координаты - целые числа в интервале от 1 до 8.
      Выходные данные
      Требуется вывести слово YES, если ферзь может побить фигуру за 1 ход,
      в противном случае вывести слово NO

      E  #  #  #  #  #  #  E
      #  #  #  #  #  #  #  #
      #  #  #  #  #  #  #  #
      #  #  #  #  #  #  #  #
      #  #  #  #  #  #  #  #
      #  #  #  #  #  #  #  #
      #  #  #  #  #  #  #  #
      Q  #  Q  #  #  #  #  #

      1 1  8 1  YES
      3 2  8 3  NO
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int QueenLine = sc.nextInt();
        int QueenColumn = sc.nextInt();
        int EnemyLine = sc.nextInt();
        int EnemyColumn = sc.nextInt();
        if (abs(QueenLine - EnemyLine) == abs(QueenColumn - EnemyColumn) | ((QueenLine == EnemyLine) | (QueenColumn == EnemyColumn))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
