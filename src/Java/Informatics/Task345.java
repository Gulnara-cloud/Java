package Java.Informatics;

import java.util.Scanner;

public class Task345 {
    /* Нули
 Входные данные
 Вводится число N, а затем N чисел.

 Выходные данные
 Подсчитайте и выведите, сколько среди данных N чисел нулей.

 Примеры
 Входные данные
 3
 1
 2
 3
 Выходные данные
 0
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int zeroCount = 0;

        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            if (number == 0) {
                zeroCount++;
            }
        }
        System.out.println(zeroCount);
    }
}
