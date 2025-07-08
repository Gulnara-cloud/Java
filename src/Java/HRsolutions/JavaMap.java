package Java.HRsolutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();

        int n = Integer.parseInt(in.nextLine());

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            String phone = in.nextLine();
            phoneBook.put(name, phone);
        }
        while (in.hasNextLine()) {
            String query = in.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
