package basics;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day number (1-7): ");

        if (sc.hasNextInt()) {
            int dayNumber = sc.nextInt();
            String dayName;

            switch (dayNumber) {
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
                case 7:
                    dayName = "Sunday";
                    break;
                default:
                    dayName = "Invalid day Number";
            }
            System.out.println("Day of the week: " + dayName);
        } else {
            System.out.println("Error: Please enter a number!");
        }
        sc.close();
    }
}

