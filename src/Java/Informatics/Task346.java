package Java.Informatics;

import java.util.Scanner;

public class Task346 {
    /* Подсчет чисел
  Подсчитайте, сколько среди данных N чисел нулей,
  положительных чисел, отрицательных чисел.

  Входные данные
  Вводится число N, а затем N целых чисел.

  Выходные данные
  Необходимо вывести сначала число нулей,
  затем число положительных и отрицательных чисел.

 Примеры
 Входные данные
 5
 28
 0
 0
 0
 0
 Выходные данные
 4 1 0
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int zeroCount = 0;
        int pozitivCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            if (number == 0) {
                zeroCount++;
            } else if (number > 0) {
                pozitivCount++;
            } else {
                negativeCount++;
            }
        }
        System.out.println(zeroCount + " " + pozitivCount + " " + negativeCount);
    }
}
