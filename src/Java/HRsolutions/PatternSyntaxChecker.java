package Java.HRsolutions;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfWords = Integer.parseInt(sc.nextLine());
        while (numberOfWords > 0) {
             String string = sc.nextLine();
             try {
                 Pattern.compile(string);
                 System.out.println("Valid");
             } catch (PatternSyntaxException e) {
                 System.out.println("Invalid");
             }
             numberOfWords--;
        }
    }
}
