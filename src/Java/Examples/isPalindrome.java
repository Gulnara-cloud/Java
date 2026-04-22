package Java.Examples;

public class isPalindrome {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word1 = "madam";
        String word2 = "hello";
        String word3 = "racecar";

        System.out.println(word1 + " - " + isPalindrome(word1));
        System.out.println(word2 + " - " + isPalindrome(word2));
        System.out.println(word3 + " - " + isPalindrome(word3));
    }
}
