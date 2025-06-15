package Java.Informatics;

import java.util.Scanner;

public class Task2937 {
    /* Следующее и предыдущее
Напишите программу, которая считывает целое число и выводит текст,
аналогичный приведенному в примере.
Пробелы, знаки препинания, заглавные и строчные буквы важны!

Входные данные
Вводится целое число, по модулю не превосходящее 10000.

Выходные данные
Выведите сначала фразу "The next number for the number ",
затем введенное число, затем слово " is ", окруженное пробелами,
затем формулу для следующего за введенным числа, наконец, знак точки без пробела.
Аналогично в следующей строке для предыдущего числа.
При необходимости используйте параметр вывода sep в языке Python.

Примеры
Входные данные
179

Выходные данные
The next number for the number 179 is 180.
The previous number for the number 179 is 178.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int next = n + 1;
        int previous = n - 1;

        System.out.println("The next number for the number " + n + " is " + next + ".");
        System.out.println("The previous number for the number " + n + " is " + previous + ".");
    }
}
