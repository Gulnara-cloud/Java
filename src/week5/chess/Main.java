package week5.chess;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner sc = new Scanner(System.in);
        while (true) {
            game.printBoard();
            String from = sc.next(); // Letter + Number; A7 -> 0, 6
            String to = sc.next();

            try {
                game.validateMoves(from, to);
            } catch (GameException e) {
                System.out.println(e.getMessage());
                System.out.println("retry!");
            }
        }
    }
}