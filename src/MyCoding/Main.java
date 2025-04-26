package MyCoding;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secretNumber = 8;

        System.out.print("Try to find a correct number: ");
        int guess = scanner.nextInt();

        if (guess == secretNumber) {
            System.out.println("You did it!");
        } else {
            System.out.println("Maybe, try again");
        }
    }
}