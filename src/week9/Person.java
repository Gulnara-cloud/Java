package week9;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public class Person extends Human implements Serializable {
    private String name;
    private List<Pet> pets;

    public Person(int age, String name) {
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
                '}';
    }
}