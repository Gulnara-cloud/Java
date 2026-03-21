package Java.Examples;

public class Reverse {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        reverse(nums);

        for (int num : nums) {
            System.out.print(num + " "); // 5 4 3 2 1
        }
    }

    public static void reverse(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            // swap
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}