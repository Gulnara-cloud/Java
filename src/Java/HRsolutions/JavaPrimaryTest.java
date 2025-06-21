package Java.HRsolutions;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimaryTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger bigint = sc.nextBigInteger();
        if (bigint.isProbablePrime(10)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
