import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
    //    public T[] items=(T[]) new Object[10];
    public T[] items = (T[]) new Object[10];
    private int count;

    // generic lists doesn't allow us to  user iterators by default, however, when we implement iterator class there, we can use it
    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T> {
        private GenericList<T> list;
        private int index;

//        this inner class defines how to iterate over the genericList,
//        so, if we change GenericList to ArrayList or LinkedList, we have to change this inner class methods ony, nothing else

//        since we have used an array in GenericList we will implement iterable on Array for this

        public ListIterator(GenericList<T> list) {
//            constructor
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index<list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }


}
