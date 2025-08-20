package Java.HRsolutions;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        HashSet<String> pairs = new HashSet<>();
        for (int i = 0; i < t; i++) {

            pairs.add(sc.next() + " " + sc.next());
            System.out.println(pairs.size());
        }
        sc.close();
    }
}
