package week5.examples.zoo;

public abstract class Animal {
    protected String name;
    Animal(String name) {
        this.name = name;
    }
    abstract void makeSound();
}
