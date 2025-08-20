package week8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Buffered {
    public static void inputExample() throws IOException {
//        try-with-resources
        try (BufferedInputStream is = new BufferedInputStream(new FileInputStream("src/week8/input.txt"))) {
            String result = new String(is.readAllBytes());
            System.out.println(result);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("src/week8/input.txt"))) {
            List<String> lines = new ArrayList<>();
            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                System.out.println(line);
                line = reader.readLine();
            }
            System.out.println(lines.contains("Hello world! Hello world!Hello world! Hello world!"));
        }
    }

    // Memory - Fast
    // Disk - Slow
    public static void outputExample() throws IOException {
        try (BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("src/week8/output.txt"))) {
            byte[] helloWorldInRussian = new byte[]{-48, -97, -47, -128, -48, -72, -48, -78, -48, -75, -47, -126, 32, -48, -68, -48, -72, -47, -128, 33};
            os.write(helloWorldInRussian);
            os.flush();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/week8/output_writer.txt"))) {
            writer.write("привет мир!");
            writer.flush();
        }
    }
}
