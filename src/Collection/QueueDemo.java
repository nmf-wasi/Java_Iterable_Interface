package Collection;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show(){
        Queue<String>queue=new ArrayDeque<>();
        queue.add("c");
        queue.add("d");
        queue.add("a"); //b->a->d->c
        queue.add("b");// if full, add method raise exception
        queue.offer("q"); // if full, offer returns false
        System.out.println(queue.peek()); // peek returns null
        System.out.println(queue.element()); //element throws exception
        queue.remove(); // raise exception if empty
        System.out.println(queue);
        queue.poll(); // returns null if empty
        System.out.println(queue);
    }
}
