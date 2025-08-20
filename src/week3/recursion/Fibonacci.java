package week3.recursion;

public class Fibonacci {
    //  F(n) = F(n - 1) + F(n - 2)
    //  F(1) = 1, F(2) = 1
    // 1 1 2 3 5 8  13 21 ...
    public static int f(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return f(n - 1) + f(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(f(7));
    }
}
