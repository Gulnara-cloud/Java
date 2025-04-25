package week4;

import week4.zoo.Animal;
import week4.zoo.Cat;
import week4.zoo.Dog;

public class Main {
    public static void makeItSound(Animal animal) {
        animal.makeSound();
    }
    public static void main(String[] args) {
        Dog bobby = new Dog("Bobby");
        Cat dong = new Cat("Dong");
        makeItSound(bobby);
        makeItSound(dong);
    }
}
