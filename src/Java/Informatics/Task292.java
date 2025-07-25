package Java.Informatics;

import java.util.Scanner;

public class Task292 {
    public static void main(String[] args) {
        //  Входные данные
        //Даны два целых числа, каждое число записано в отдельной строке.
        //
        //Выходные данные
        //Выведите наибольшее из данных чисел.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
