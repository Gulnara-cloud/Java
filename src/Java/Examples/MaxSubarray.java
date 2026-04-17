package Java.Examples;


class MaxSubarraySolver {
    public int maxSum(int[] nums) {
        int current = nums[0];
        int best = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            best = Math.max(best, current);
        }

        return best;
    }
    public static void main(String[] args) {

        MaxSubarraySolver solver = new MaxSubarraySolver();

        int result = solver.maxSum(
                new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}
        );

        System.out.println(result);
    }
}