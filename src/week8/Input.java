package week8;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Input {
    public static void example() throws IOException {
//        try-with-resources
        try (InputStream is = new FileInputStream("src/week8/input.txt")) {
            List<Byte> bytesList = new ArrayList<>();
            while (true) {
                byte[] buffer = new byte[256];

                int n = is.read(buffer);
                if (n == -1) {
                    break;
                }
                for (byte b : buffer) {
                    bytesList.add(b);
                }
            }
            byte[] bytes = new byte[bytesList.size()];
            for (int i = 0; i < bytes.length; ++i) {
                bytes[i] = bytesList.get(i);
            }
            String result = new String(bytes);
            System.out.println(result);
        }

        try (Reader reader = new FileReader("src/week8/input.txt")) {
            char[] input = new char[256];

            int n = reader.read(input);
            System.out.println(n);

            System.out.println(new String(input, 0, n));
        }
    }
}
