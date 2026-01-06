package Java.Examples.SetDemo;
import java.util.LinkedHashSet;
import java.util.Set;
 /*
   Maintains insertion order.

   Slightly slower than HashSet but predictable iteration order.

    */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // Create a LinkedHashSet of Strings
        Set<String> cities = new LinkedHashSet<>();

        //Add elements
        cities.add("Chicago");
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("New Jersey"); //duplicate, ignored

        //print the set
        System.out.println("Cities: "+cities);

        //Check membership
        System.out.println("Contains New York? " + cities.contains("New York"));

        // Iterate over the set
        System.out.println("Iterating: ");
        for (String cit: cities){
            System.out.println(cit);
        }
    }
}

