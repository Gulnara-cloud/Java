package Java.HRsolutions;

import java.util.Scanner;

public class SubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] storageOFArrays = new int[num];
        for(int i = 0; i < num; i++) {
            storageOFArrays[i] = sc.nextInt();
        }
        int sumOfNegative = 0;

        for(int i = 0; i < num; i++) {
            int sum = 0;
            for(int k = 0; k < num; k++) {
                sum += storageOFArrays[k];
                if(sum < 0) {
                    sumOfNegative++;
                }
            }
        }
        System.out.println(sumOfNegative);
    }
}
