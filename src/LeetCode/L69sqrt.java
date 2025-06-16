package LeetCode;

import java.util.Scanner;

public class L69sqrt {
    public static int mySquare(int x) {
        int l = 0;
        int r = x;
        while (l <= r) {
            int m = l + (r - l) / 2;
            long square = (long) m * m;
            if (square == x) {
                return m;
            } else if (x > square) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(mySquare(n));
    }
}

