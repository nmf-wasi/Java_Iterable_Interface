package Collection;

public class Customer implements Comparable<Customer> {
    private String name;
    private String email;
    public Customer(String name, String email) {
        this.name = name;
        this.email=email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


