package week6;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    void treeSet() {
        Set<Integer> set = new TreeSet<>();
//        Red-black tree
        set.add(100);
        set.add(500);
        set.add(300);
        for (int value : set) {
            System.out.println(value);
        }
        set.remove(300);

        set.contains(100); // O(log(N))
    }

    void customClass() {
        Set<Student> students = new TreeSet<>();
        students.add(new Student("John"));
        students.add(new Student("Adrian"));
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    void hashSet() {
        Set<Student> students = new HashSet<>();
        //        Create a hash from the content, hash is a number
        students.add(new Student("John"));
        students.add(new Student("Adrian"));
        for (Student student : students) {
            System.out.println(student.getName());
        }
        System.out.println(students.contains(new Student("John")));
    }
}

