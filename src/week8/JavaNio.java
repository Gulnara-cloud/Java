package week8;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class JavaNio {
    public static void example() throws IOException {
        Path path = Path.of("src", "week8", "Java/FilesStrings/input.txt");
        for (String line : Files.readAllLines(path)) {
            System.out.println(line);
        }

        Path writePath = Path.of("src", "week8", "nio_output.txt");
        BufferedWriter bf = Files.newBufferedWriter(writePath);
        PrintWriter pw = new PrintWriter(bf);
        pw.println("Hello World!");
        pw.flush();
    }
}
