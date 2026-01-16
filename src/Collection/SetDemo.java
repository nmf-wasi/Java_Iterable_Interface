package Collection;

import java.util.*;

public class SetDemo {
    public static void show() {
//        Set<String> set=new HashSet<>();
//        set.add("sky");
//        set.add("is");
//        set.add("blue");
//        set.add("is");

//        removing duplicates
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "C", "a", "A");
        Set<String> set = new HashSet<>(collection);
        System.out.println(set);

        Set<String> set1 = new HashSet<>(Arrays.asList("A","B", "C", "D"));
        Set<String> set2 = new HashSet<>(Arrays.asList("A", "F", "R","T"));
        set1.addAll(set2);//union
        System.out.println(set1);
        set1 = new HashSet<>(Arrays.asList("A","B", "C", "D"));
        set1.retainAll(set2);//intersect
        set1 = new HashSet<>(Arrays.asList("A","B", "C", "D"));
        set1.removeAll(set2); // set1'
        System.out.println(set1);
    }
}
