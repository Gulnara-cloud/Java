package Java.LeetCode;

public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(ClimbStairs(4));
    }

    public static int ClimbStairs(int n) {
        if (n <= 2) return n;
        int AllWays = 0;
        int OneStepBefore = 2;
        int TwoStepbefore = 1;
        for (int i = 3; i <= n; i++) {
            AllWays = OneStepBefore + TwoStepbefore;
            TwoStepbefore = OneStepBefore;
            OneStepBefore = AllWays;
        }
        return AllWays;
    }
}

