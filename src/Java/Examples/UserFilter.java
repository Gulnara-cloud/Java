package Java.Examples;

import java.util.ArrayList;
import java.util.List;

class User {

    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class UserFilter {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Anna", 17));
        users.add(new User("John", 25));
        users.add(new User("Mike", 20));
        users.add(new User("Kevin", 35));

        for (User user : users) {

            if (user.age >= 18) {
                System.out.println(user.name);
            }
        }
    }
}