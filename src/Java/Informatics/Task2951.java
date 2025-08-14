package Java.Informatics;

import java.util.Scanner;

public class Task2951 {
    /* Стоимость покупки
Пирожок в столовой стоит a рублей и b копеек.
Определите, сколько рублей и копеек нужно заплатить за n пирожков.

Входные данные
Программа получает на вход три числа: a, b, n.

Выходные данные
Программа должна вывести два числа: стоимость покупки в рублях и копейках.

Примеры
Входные данные
10
15
2
Выходные данные
20 30
Входные данные
2
50
4
Выходные данные
10 0
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int totalKopecksPerPie = a * 100 + b;
        int totalKopecks = totalKopecksPerPie * n;

        int rubles = totalKopecks / 100;
        int kopecks = totalKopecks % 100;

        System.out.println(rubles + " " + kopecks);
    }
}
