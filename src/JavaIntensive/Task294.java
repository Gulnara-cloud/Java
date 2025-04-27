package JavaIntensive;

import java.util.Scanner;

public class Task294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int maxFromNum1andNum2 = Math.max(num1, num2);
        int max = Math.max(maxFromNum1andNum2, num3);
        System.out.println(max);
    }
}
