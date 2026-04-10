package Java.Examples;

public class Recursion {

    public static int solve(int n) {
        if (n == 0) {
            return 0;
        }

        return n + solve(n - 1);
    }

    public static void main(String[] args) {
        int result = solve(6);
        System.out.println(result);
    }
}
