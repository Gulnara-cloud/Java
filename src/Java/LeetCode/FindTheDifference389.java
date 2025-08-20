package Java.LeetCode;

import java.util.Arrays;

public class FindTheDifference389 {
    public static char FindTheDifference(String s, String t) {
        char[] ArrayS = s.toCharArray();
        char[] ArrayT = t.toCharArray();

        Arrays.sort(ArrayS);
        Arrays.sort(ArrayT);
        for (int i = 0; i < ArrayS.length; i++) {
            if (ArrayS[i] != ArrayT[i]) {
                return ArrayT[i];
            }
        }
        return ArrayT[ArrayT.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(FindTheDifference("abc", "adbc"));
    }
}
