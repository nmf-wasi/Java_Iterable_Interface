public class Main {
    public static void main(String[] args) {
        var list=new GenericList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
//        System.out.println(list.items.length); // when we have a generic Array, we can use this
//        however, if we use an ArrayList or LinkedList, we can't do this anymoree
//        becasue ArrayList do not have .length function and it doesnt support [] for accessing elements

        var iterator=list.iterator();
        while(iterator.hasNext()){ // generic lists doesnt allow us to  user iterators by default, hhowever, when we implement iterator class there, we can use it
            var current=iterator.next();
            System.out.println(current);
        }

        for (var item:list){ //another way to iterate over something
            System.out.println(item);
        }

    }
}


