package week8;

import java.io.*;

public class Output {
    public static void example() throws IOException {
        try (OutputStream os = new FileOutputStream("src/week8/output.txt")) {
            byte[] helloWorldInRussian = new byte[]{-48, -97, -47, -128, -48, -72, -48, -78, -48, -75, -47, -126, 32, -48, -68, -48, -72, -47, -128, 33};
            os.write(helloWorldInRussian);
            os.flush();
        }

        try (Writer writer = new FileWriter("src/week8/output_writer.txt")) {
            writer.write("привет мир!");
            writer.flush();
        }
    }
}
