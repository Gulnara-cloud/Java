package week9;

//import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.*;
import java.util.Arrays;

public class Example {
    static class Human implements Serializable {
        int age;

        public Human() {
            this.age = 0;
        }

        public Human(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    static class Person extends Human implements Serializable {
        @Serial
        private static final long serialVersionUID = 1L;

  //      @JsonProperty("full_name")
        String name;

        public Person(String name) {
            this.name = name;
        }

        public Person(String name, int age) {
            super(age);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(new Person("Anuar", 12));
        oos.close();
        System.out.println(Arrays.toString(baos.toByteArray()));
        ObjectInputStream bis = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Person person = (Person) bis.readObject();
        System.out.println(person);
    }
}