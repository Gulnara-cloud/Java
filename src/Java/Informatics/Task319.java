package Java.Informatics;

import java.util.Scanner;

public class Task319 {
    /* Геометрическая прогрессия
По данному действительному числу a и натуральному n вычислите сумму 1+a+a2+...+an,
не используя формулу суммы геометрической прогрессии и операцию возведения в степень.
Время работы программы должно быть пропорционально n.

Входные данные
Вводятся 2 числа - a и n.

Выходные данные
Необходимо вывести  значение суммы.

Примеры
Входные данные
2
2
Выходные данные
7 |  (1+a+a2+...+an)   1 + 2 + 4 = 7
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(); // Read a (real number)
        int n = sc.nextInt();       // Read n (natural number)

        double sum = 1.0;          // Start with the first term
        double term = 1.0;         // Current power of a (starts at a^0 = 1)

        for(int i = 1; i <= n; i++) {
            term *= a;             // Compute next power of a
            sum += term;           // Add it to the sum
        }
        System.out.println(sum);
    }
}
