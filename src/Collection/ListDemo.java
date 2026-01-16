package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        list.add(0, "1");
        System.out.println(list);
        Collections.addAll(list, "Wasi", "Yuna", "Kel");
        System.out.println(list);
        list.set(2, "Ryu");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        Collections.addAll(list, "0", "ryu", "Wasi");
        System.out.println(list.lastIndexOf("Wasi"));

        System.out.println(list.subList(2,5));
    }
}
