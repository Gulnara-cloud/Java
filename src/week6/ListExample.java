package week6;
import java.util.*;

public class ListExample {
    void list() {
        List<Integer> list = new LinkedList<Integer>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        Collections.sort(list);
        Collections.rotate(list, 1);
        for (int i = 0; i < list.size(); ++i) {
            System.out.println(list.get(i));
        }
        //       for (Integer it : list) {
        //            System.out.println(it);
        //       }
        //       Iterator<Integer> it = list.iterator();
        //       while (it.hasNext()) {
        //           int value = it.next();
        //           System.out.println(value);
    }
}

