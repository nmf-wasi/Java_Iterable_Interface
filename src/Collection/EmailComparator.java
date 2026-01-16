package Collection;

import java.util.Comparator;

// a generic interface and lets u decide on which attribute, u wanna compare
public class EmailComparator implements Comparator<Customer> {


    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getEmail().compareTo(o2.getEmail());
    }
}
