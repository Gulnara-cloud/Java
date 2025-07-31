package Java.Informatics;

import java.util.Scanner;

public class Task2950 {
    /*Конец уроков
В некоторой школе занятия начинаются в 9:00.
Продолжительность урока — 45 минут, после 1-го, 3-го, 5-го и т.д.
уроков перемена 5 минут, а после 2-го, 4-го, 6-го и т.д. — 15 минут.
Определите, когда заканчивается указанный урок.

Входные данные
Дан номер урока (число от 1 до 10).

Выходные данные
Выведите два целых числа: время окончания урока в часах и минутах.
При решении этой задачи нельзя пользоваться циклами и условными инструкциями.

Примеры
Входные данные
3
Выходные данные
11 35
Входные данные
2
Выходные данные
10 35
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lesson = sc.nextInt();
        int hours = 9;
        int minutes = 0;
        for (int i = 1; i <= lesson; i++) {

            minutes += 45;
            if (minutes >= 60) {
                hours += minutes / 60;
                minutes = minutes % 60;
            }
            if (i % 2 == 1) {
                minutes += 5;
            } else {
                minutes += 10;
            }
            if (minutes >= 60) {
                hours += minutes / 60;
                minutes = minutes % 60;
            }
        }
        System.out.println(hours + " " + minutes);
    }
}
