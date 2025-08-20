package week9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person anuar = new Person(20, "Anuar");
//        Gradle, Maven
        try (FileOutputStream fos = new FileOutputStream("src/week9/person.bin")) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(anuar);
            oos.flush();
        }
        byte[] bytes = Files.readAllBytes(Path.of("src", "week9", "person.bin"));
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bytes))) {
            Object o = ois.readObject();
            Person p = (Person) o;
            System.out.println(p);
        }
    }
}