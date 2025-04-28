package JavaIntensive;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task298 {
    /* Поле шахматной доски определяется парой чисел (a, b), каждое от 1 до 8, первое число задает номер столбца,
     второе – номер строки. Заданы две клетки.
    Определите, может ли шахматный король попасть с первой клетки на вторую за один ход.
    Входные данные
    Даны 4 целых числа от 1 до 8 каждое, первые два задают начальную клетку, вторые два задают конечную клетку.
    Начальная и конечная клетки не совпадают. Числа записаны в отдельных строках.
    Выходные данные
    Программа должна вывести YES, если из первой клетки ходом короля можно попасть во вторую, или NO в противном случае.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int KingLine = sc.nextInt();
        int KingColumn = sc.nextInt();
        int EnemyLine = sc.nextInt();
        int EnemyColumn = sc.nextInt();
        if (abs(KingLine - EnemyLine) <= 1 & abs(KingColumn - EnemyColumn) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}