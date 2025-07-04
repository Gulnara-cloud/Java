package Java.Informatics;

import java.util.Scanner;

public class Task2941 {
    /* Последняя цифра
Дано натуральное число. Выведите его последнюю цифру.

Входные данные
Вводится натуральное число.

Выходные данные
Выведите ответ на задачу.

Примеры
Входные данные
179
Выходные данные
9
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int lastDigit = num % 10;
        System.out.println(lastDigit);
    }
}
