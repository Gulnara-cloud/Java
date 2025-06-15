package Java.HRsolutions;

import java.util.Scanner;

public class ValidUsernameRegularExpression {
    public static class usernameValidator {
        public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String usenname = sc.nextLine();
            if (usenname.matches(usernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
