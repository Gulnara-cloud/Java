package JavaIntensive;

import java.util.Scanner;

public class Task254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Rookline = sc.nextInt();
        int RookColumn = sc.nextInt();
        int enemyLine = sc.nextInt();
        int enemyColumn = sc.nextInt();
        if (Rookline == enemyLine | RookColumn == enemyColumn) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
