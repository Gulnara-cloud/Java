package week3.methods;

public class GreetSomebody {
    public static String fullName(String name, String surname) {
       return name + " " + surname;
    }

    public static void greet(String name, String surname) {
        System.out.println("Hello " + fullName(name, surname) + "!");
    }

    public static void main(String[] args) {
        greet("Gulnara", "Nuraly");
        greet("Chynara", "O");
    }
}
