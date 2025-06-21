package Java.Examples;

public class ReusableMethod {
    public static void main(String[] args) {

        String name = "Nara";
        int age = 30;
        happyBirthday(name);

    }
    static void happyBirthday(String name) {
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n", name);
        System.out.println("You are x years old!.");
        System.out.println("Happy birthday to you!");
    }
}
