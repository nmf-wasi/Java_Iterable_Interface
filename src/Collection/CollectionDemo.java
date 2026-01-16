package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

public class CollectionDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        collection.add("e");
        collection.add("d");
        collection.add("bod");
        System.out.println(collection);

//        if we wanna add all of these in 1 go, instead of calling add 3 times:

        Collections.addAll(collection, "a", "b", "c");
        System.out.println(collection);
        System.out.println(collection.size());
        collection.remove("a");
        System.out.println(collection);
        collection.clear();
        System.out.println(collection.isEmpty());
        System.out.println(collection.contains("A"));
        System.out.println(collection.contains("b"));
        Object[] objectArray = collection.toArray(); // returns an obj array

//        String[] stringArray = collection.toArray(new String[0]); // pass a string of the size of the original collection array, now it will convert the collection array to string array
//        System.out.println(stringArray[0].toLowerCase());

//        Comparing 2 collections:

        Collection<String>other=new ArrayList<>();
        other.addAll(collection);
        System.out.println(collection==other); // are different objs in memory, so false
        System.out.println(collection.equals(other)); // true cause this checks items in memory

    }
}
