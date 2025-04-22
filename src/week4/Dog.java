package week4;

public class Dog extends Animal {

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(this.name + " barked!");
    }
}


