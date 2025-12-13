package Java.Examples;

public class Hanoi {
    public static void backTracking(int n, char source, char destination, char helper) {
        if (n == 1) return;
        backTracking(n - 1, source, helper, destination);
        System.out.println(" Move disk " + n + " from " + source + " to " + destination);
        backTracking(n - 1, helper, destination, source);
    }

    public static void main(String[] args) {
        backTracking(2, 'A', 'C', 'B');
    }
}
