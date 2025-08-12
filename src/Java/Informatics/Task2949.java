package Java.Informatics;

import java.util.Scanner;

public class Task2949 {
    /* Обмен значений
Напишите программу, которая считывает значения
двух целочисленных переменных a и b,
затем меняет их значения местами
(то есть в переменной a должно быть записано то,
что раньше хранилось в b, а в переменной b записано то,
что раньше хранилось в a). Затем выведите значения переменных.

Входные данные
Вводятся целые числа a и b.

Выходные данные
Выведите ответ на задачу.

Примечание
Решением задачи не является такой код:

a = input ()
b = input ()
print (b, a)

То есть  ваша программа должна иметь примерно такой вид:
a = input ()
b = input ()
# Допишите сюда
# свой код
print (a, b)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
