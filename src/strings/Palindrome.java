package strings;

import java.util.Scanner;

public class Palindrome {
    public static String reverse(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            char c = s.charAt(i);
            reversed = reversed + c;
        }
        return reversed;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       String reversed = reverse(s);

       if (s.equals(reversed)) {
           System.out.println("Palindrome");
       } else {
           System.out.println("Not palindrome");
       }
    }
}
