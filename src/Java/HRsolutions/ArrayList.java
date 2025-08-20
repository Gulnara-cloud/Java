package Java.HRsolutions;

import java.util.Scanner;

public class ArrayList<S> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
  //      ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int NumberCount = sc.nextInt();
 //           ArrayList<Integer> innerArrayList = new ArrayList<>();
            for (int j = 0; j < NumberCount; j++) {
                int num = sc.nextInt();
  //              innerArrayList.add(num);
            }
  //          arrayList.add(innerArrayList);
        }
        int q = sc.nextInt();
        for (int k = 0; k < q; k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
 //               System.out.println(arrayList.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}