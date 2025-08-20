package week5.examples.zoo;

public class Dog extends DomesticAnimal {

    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(this.name + " woofs!");
    }
}
