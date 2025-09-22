package Java.Examples;

public class BinaryPowerOfTwo {
    public static void main(String[] args) {
        int n = 64;
        System.out.println(n + " -> " + isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
