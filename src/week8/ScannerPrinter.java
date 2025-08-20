package week8;

import java.io.*;
import java.util.Scanner;

public class ScannerPrinter {
    public static void scannerExample() throws IOException {
        try (Scanner sc = new Scanner(new FileInputStream("src/week8/input.txt"))) {
            System.out.println(sc.nextInt());
        }
    }

    public static void printerExample() throws IOException {
        try (PrintStream ps = new PrintStream(new FileOutputStream("src/week8/output.txt"))) {
            int age = 10;
            String name = "John";
            ps.printf("%s is %d years old\n", name, age);
        }
    }
}
