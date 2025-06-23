package Java.HRsolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int q = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < q; i++) {
            String command = scanner.nextLine();
            if (command.equals("Insert")) {
                String[] parts = scanner.nextLine().split(" ");
                int index = Integer.parseInt(parts[0]);
                int num = Integer.parseInt(parts[1]);
                list.add(index, num);
            } else if (command.equals("Delete")) {
                int index = Integer.parseInt(scanner.nextLine());
                list.remove(index);
            }

        }

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}

