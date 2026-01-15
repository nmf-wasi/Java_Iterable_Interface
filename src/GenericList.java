import java.util.ArrayList;

public class GenericList<T> {
//    public T[] items=(T[]) new Object[10];
    public ArrayList<T> items= (T[]) new ArrayList<T>();
    private  int count;

    public void add(T item){
        items[count++]=item;
    }
    public T get(int index){
        return items[index];
    }
}
