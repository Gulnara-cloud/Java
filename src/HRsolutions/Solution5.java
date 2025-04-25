package HRsolutions;

import java.util.*;

class Solution5 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
//            int a = in.nextInt();
            int a = 0;
            int b = 2;
            int n = 10;
            int result = a;
            int c = 1;

            for(int j=1; j<=n; j++) {
                result = result + (c * b);
                System.out.print(result+ " ");
                c = c*2;

            }
            System.out.println();
        }
        in.close();
    }
}
