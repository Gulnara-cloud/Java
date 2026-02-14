package Java.Examples;

public class factorial {
    public static int fact(int num) {
        if (num < 0) {
            return -1;
        }
        if (num == 0) {
            return 1;
        }
        return fact(num - 1) * num;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(fact(nums.length));
    }
}
