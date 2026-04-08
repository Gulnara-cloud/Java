package Java.Examples;

public class Recursion {

    public static int solve(int n) {
        // base case
        if (n == 0) {
            return 0;
        }

        // recursive case
        return n + solve(n - 1);
    }

    public static void main(String[] args) {
        int result = solve(5);
        System.out.println(result);
    }
}
