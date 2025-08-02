package Java.Informatics;

import java.util.Scanner;

public class Task2948 {
    /* Электронные часы - 2
Электронные часы показывают время в формате h:mm:ss,
то есть сначала записывается количество часов,
потом обязательно двузначное количество минут,
затем обязательно двузначное количество секунд.
Количество минут и секунд при необходимости
дополняются до двузначного числа нулями.

С начала суток прошло n секунд. Выведите, что покажут часы.

Входные данные
Вводится целое число n.

Выходные данные
Выведите ответ на задачу, соблюдая требуемый формат.

Примеры
Входные данные
3602
Выходные данные
1:00:02
Входные данные
129700
Выходные данные
12:01:40
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int hours = n / 3600;
        int minutes = (n % 3600) / 60;
        int seconds = n % 60;

        if (minutes < 10) {
            System.out.print(hours + ":0" + minutes + ":");
        } else {
            System.out.print(hours + ":" + minutes + ":");
        }
        if (seconds < 10) {
            System.out.println("0" + seconds);
        } else {
            System.out.println(seconds);
        }
    }
}