package week8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Path.of("src", "week8", "input.txt"));
        Map<String, Integer> count = new HashMap<>();
        for (String line : lines) {
            count.put(line, count.getOrDefault(line, 0) + 1);
        }
        for (String fruit : count.keySet()) {
            System.out.printf("There are %d occurrences of %s\n", count.get(fruit), fruit);
        }
    }
}