package week9;

//import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class JsonExample {
    public static void main(String[] args) throws IOException {
        Person anuar = new Person(20, "Anuar");
        Person taalai = new Person(35, "Taalai");
        List<Person> people = new ArrayList<>();
        people.add(anuar);
        people.add(taalai);
      //  ObjectMapper objectMapper = new ObjectMapper();

        try (FileOutputStream fos = new FileOutputStream("src/week9/people.json")) {
      //      objectMapper.writeValue(fos, people);
            fos.flush();
        }

        byte[] bytes = Files.readAllBytes(Path.of("src", "week9", "people.json"));
        try (ByteArrayInputStream bais = new ByteArrayInputStream(bytes)) {
     //       List<Person> list = objectMapper.readValue(bais, people.getClass());
      //      System.out.println(list.get(0));
        }
    }
}