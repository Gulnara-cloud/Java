package Java.Examples.SetDemo;

import java.util.*;
 /*
    Does not allow duplicate elements (each element must be unique).
    Does not guarantee order, unless you use a specific implementation that does
    (like LinkedHashSet for insertion order or TreeSet for sorted order).
    Is part of the Java Collections Framework, defined by the java.util.Set interface.

    Set cannot be accessed by index, because:
    Set is not a List.
    It does not maintain positional access (like list.get(2)).
    The design of Set is about uniqueness and (in the case of TreeSet) sorted order, not about indexed access.
     */
public class SetDefinitionDemo {
    public static void main(String[] args) {

        System.out.println("How to get elements in Set?");
        System.out.println();
        System.out.println("First option is to convert to a List");
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        System.out.println(numbers);
        //Convert to List 1st option
        List<Integer> list = new ArrayList<>(numbers);
        //Convert to List 2nd option
        List<Integer> list2 = new ArrayList<>();
        for(int i : numbers){
            list2.add(i);
        }
        System.out.println("List2: " + list2);
        //Access by index
        System.out.println("Element at index 2: " + list.get(2));//30

        System.out.println();
        System.out.println("Second option is to iterate until the index you want");
        int index = 2;
        int i = 0;
        int value = -1;
        for (int num : numbers) {
            if (i == index) {
                value = num;
            }
            i++;
        }

        System.out.println("Element at index 2: " + value);


    /*
    Add → add, addAll
Remove → remove, removeAll, clear
Check → contains, containsAll
Query → size, isEmpty
Iterate → iterator, forEach
Algebra → retainAll, removeAll, addAll
Convert → toArray
     */
        System.out.println();
        System.out.println("Set operations");

        Set<String> clothes = new HashSet<>();
        // add
        clothes.add("Shirt");
        clothes.add("Pants");
        clothes.add("Jacket");
        System.out.println("After add: " + clothes);

        //addAll(union)
        clothes.addAll(Arrays.asList("Shoes", "Hat", "Pants") );
        System.out.println("After addAll: " + clothes);
        boolean b = clothes.containsAll(Arrays.asList("Shoes", "Hat") );
        System.out.println( b + " containsAll");

        //remove
        clothes.remove("Shirt"); //removes shirt if exists
        System.out.println("After remove: " + clothes);

        clothes.removeAll(Arrays.asList("Shoes", "Jacket") ); //removes shoes and jacket
        System.out.println("After removeAll: " + clothes);

        clothes.clear(); //removes everything
        System.out.println("After clear: " + clothes);

        //add again for next operations
        clothes.addAll(Arrays.asList("Shirt", "Pants", "Jacket", "Hat") );

        //check operations: contains, containsAll
        System.out.println("Contains Shirt? " + clothes.contains("Shirt"));
        System.out.println("ContainsAll [Pants, Hat]? " + clothes.containsAll(Arrays.asList("Pants", "Hat") ));

        //query operations
        System.out.println("Size: " + clothes.size());
        System.out.println("Is empty? " + clothes.isEmpty());

        //iterate operations iterator
        System.out.println("Iterating with iterator: ");
        Iterator<String> it = clothes.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
        System.out.println("Iterating with forEach");
        clothes.forEach(System.out::println);

        //algebra operations
        Set<String> winterClothes = new HashSet<>(Arrays.asList("Coat", "Pants", "Scarf") );
        //union(addAll)

        Set<String> union = new HashSet<>(clothes);
        union.addAll(winterClothes);
        System.out.println("Union: " + union);

        //intersection (retainAll)
        Set<String> intersection = new HashSet<>(clothes);
        intersection.retainAll(winterClothes);
        System.out.println("Intersection: " + intersection);
        System.out.println(clothes);
        System.out.println(winterClothes);

        Set<String> difference = new HashSet<>(clothes);
        difference.removeAll(winterClothes);
        System.out.println("Difference: " + difference);
        System.out.println("Clothes" +clothes);

        //convert operations
        System.out.println();
        List<String> arrayList = new ArrayList<>(clothes);
        System.out.println("Arraylist: " + arrayList);
        System.out.println();
        String[] arr = clothes.toArray(new String[0]);
        System.out.println("Converted to array: " + Arrays.toString(arr));

    }
}

