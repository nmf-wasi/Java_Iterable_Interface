import Collection.Customer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customerList=new ArrayList<>();
        customerList.add(new Customer("daa"));
        customerList.add(new Customer("b"));
        customerList.add(new Customer("c"));
        System.out.println(customerList);
        Collections.sort(customerList);
        System.out.println(customerList);
    }
}


