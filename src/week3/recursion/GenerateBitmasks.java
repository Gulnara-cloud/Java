package week3.recursion;

import java.util.Scanner;

public class GenerateBitmasks {
    public static void generate(int n, String current) {
        if (n == 0) {
            System.out.println(current);
            return;
        }
        current += "0";
        generate(n - 1, current);
        current = current.substring(0, current.length() - 1);
        current += "1";
        generate(n - 1, current);
        current = current.substring(0, current.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generate(n,"");
    }
}
