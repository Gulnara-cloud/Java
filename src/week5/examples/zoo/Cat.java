package week5.examples.zoo;

public class Cat extends DomesticAnimal {

    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(this.name + " mews!");
    }
}
