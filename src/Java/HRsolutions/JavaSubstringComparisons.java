package Java.HRsolutions;

import java.util.Scanner;

public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        for (int i = 1; i  <= s.length()-k; i++) {
            String current = s.substring(i, i + k);
            if (current.compareTo(s.substring(i)) < 0) {
                current = smallest;
            } if (current.compareTo(s.substring(i)) < 0) {
                current = largest;
            }
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
