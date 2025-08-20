package week7;

import java.io.*;

public class ReadFileExample {
    static void readFile(String filename) throws FileNotFoundException {
        FileReader in = new FileReader(filename);
        BufferedReader br = new BufferedReader(in);

        try {
            String s = br.readLine();
            System.out.println(s);
        } catch (IOException e) {
            System.out.println("some IO error occurred");
        }
    }
}
