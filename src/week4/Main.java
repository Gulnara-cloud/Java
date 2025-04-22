package week4;

public class Main {
    public static void main(String[] args) {
        Dog bobby = new Dog("Bobby");
        bobby.name = "not Bobby";
        bobby.bark();

        Dog buddy = new Dog("Buddy");
        buddy.bark();

        Dog duddy = new Dog("Buddy");
        buddy.bark();
    }
}
