package week4.zoo;

public class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(this.name + " mewed!");
    }
}
