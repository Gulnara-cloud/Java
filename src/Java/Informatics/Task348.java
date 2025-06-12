package Java.Informatics;

import java.util.Scanner;

public class Task348 {
    /* Уравнение по возрастанию
  Входные данные
  Вводятся 4 числа: a, b, c и d.
  Выходные данные
  Найдите все целые решения уравнения ax3 + bx2 + cx + d = 0
  на отрезке [0,1000] и выведите их в порядке возрастания.
  Если на данном отрезке нет ни одного решения,
  то ничего выводить не нужно.
  Примеры
  Входные данные
  1
  -5
  6
  0
  Выходные данные
  0 2 3
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        for (int x = 0; x <= 1000; x++) {
            int value = a * x * x * x + b * x * x + c * x + d;
            if (value == 0) {
                System.out.print(x + " ");
            }
        }
    }
}

