public class Main {
    public static void main() {
        var list=new GenericList<String>();
        list.items[0]="a";
        System.out.println(list.items.length); // when we have a generic Array, we can use this
//        however, if we use an ArrayList or LinkedList, we can't do this anymoree
//        becasue ArrayList do not have .length function and it doesnt support [] for accessing elements
    }
}
