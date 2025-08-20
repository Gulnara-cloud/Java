package week3.recursion;

public class Factorial {
    // n! = 1 * 2 * 3 * ...* n
    // factorial(n) = | factorial(n - 1) * n, if n > 1
    //                | 1, if n == 1
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}







