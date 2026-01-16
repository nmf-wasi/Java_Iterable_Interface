package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show(){
        var c1=new Customer("a","E1");
        var c2=new Customer("b","E2");
        var c3=new Customer("c","E3");
        Map<String, Customer> map=new HashMap<>();

        map.put(c1.getEmail(),c1);
        map.put(c2.getEmail(),c2);
        map.put(c3.getEmail(),c3);

        var customer=map.get("E1");
        System.out.println(customer);

        var unknownCustomer=new Customer("Unknown Customer", "");
        var customer2=map.getOrDefault("E10", unknownCustomer);
        System.out.println(customer2);

        System.out.println(map.containsKey("E1"));
        System.out.println(map.containsValue("Wasi"));

        for (var key:map.keySet())
            System.out.println(key);
        for (var entry: map.entrySet())
            System.out.println(entry);

        for(var entry: map.entrySet())
            System.out.println(entry.getValue());
        for(var entry: map.entrySet())
            System.out.println(entry.getKey());
        for (var c : map.values())
            System.out.println(c);
    }
}
