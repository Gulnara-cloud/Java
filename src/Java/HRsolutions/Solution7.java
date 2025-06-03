package Java.HRsolutions;

import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            System.out.println(num + " " + s);
            num++;
        }
    }
}
