package Java.Examples;

public class ReusableMethod {
    public static void main(String[] args) {

        String name = "Nara";
        int age = 30;
        happyBirthday(name,age);

    }
    static void happyBirthday(String name, int age) {
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n", name);
        System.out.println("You are " + age + " years old!.");
        System.out.println("Happy birthday to you!");
    }
}
