package basics;

public class Main {
    public static void main(String[] args) {
        int role = 2;
        switch (role) {
            case 1:
                System.out.println("You are an admin");
                break;
            case 2:
                System.out.println("You are a student");
                break;
            case 3:
                System.out.println("You are a teacher");
            default:
        }
    }
}
