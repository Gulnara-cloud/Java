package week7;

public class Exceptions {
    private static void printHelloForUnderage(int age, String name) {
        System.out.println("Hello for children: " + name);
    }

    static void printHello(int age, String gender, String name) throws AgeException, GenderMismatchException {
        if (age < 18) {
            throw new AgeException(age);
        }
        if (!gender.equals("Male")) {
            GenderMismatchException e = new GenderMismatchException();
//            ...
            throw e;
        }
        System.out.println("Hello " + name);
    }

    static void print(int age, String gender, String name) throws GenderMismatchException {
        try {
            printHello(age, gender, name);
        } catch (AgeException e) {
            printHelloForUnderage(age, name);
            System.out.println(e.age);
        }
    }

    static void example() {
        try {
            print(16, "Male", "John");
        } catch (GenderMismatchException e) {
            System.out.println("Sorry " + e.getMessage());
        }
    }
}
