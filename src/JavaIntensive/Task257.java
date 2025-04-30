package JavaIntensive;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task257 {

    /*/*Требуется определить, бьет ли конь, стоящий на клетке с указанными координатами
         (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.
         Входные данные
         Вводятся четыре числа: координаты коня и координаты другой фигуры.
         Все координаты - целые числа в интервале от 1 до 8.
         Выходные данные
         Программа должна вывести слово YES, если конь может побить фигуру за 1 ход,
         в противном случае вывести слово NO.

          #  #  #  #  #  #  #  #
          #  #  #  #  #  #  #  #
          #  E  #  #  #  #  #  #
          #  #  #  K  #  #  #  #
          #  #  #  #  #  #  #  #
          #  E  E  #  #  #  #  #
          #  #  #  #  #  #  #  #
          K  #  #  #  #  #  #  #

          1 1  3 2  YES

          1 1  3 3  NO

         */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int KnightLine = sc.nextInt();
        int KnightColumn = sc.nextInt();
        int EnemyLine = sc.nextInt();
        int EnemyColumn = sc.nextInt();

        int LineDiff = abs(KnightLine - EnemyLine);
        int ColumnDiff = abs(KnightColumn - EnemyColumn);
        if ((LineDiff == 1 & ColumnDiff == 2) | (LineDiff == 2 & ColumnDiff == 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}




