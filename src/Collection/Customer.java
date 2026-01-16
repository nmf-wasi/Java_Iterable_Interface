package Collection;

public class Customer implements Comparable<Customer> {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Customer o) {
//        this < other -> -1
//        this > other -> 1
//        this = other -> 0

//        if(name<o.name) // will not work because comparison operators only work on numbers
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name;
    }
}


