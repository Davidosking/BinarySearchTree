package Queue;


import java.util.ArrayList;
import java.util.Queue;


/**
 *
 * @author David Jennings
 * This class represents a queue data structure.
 */
public class DataQueue<T> {

    private ArrayList<T> data;

    public DataQueue() {
        data = new ArrayList<T>();
    }

    public void enqueue(T add) {
        data.add(add);
    }

    public T dequeue() {
        if (!data.isEmpty()) {
            T temp = data.get(0);
            data.remove(0);
            return temp;
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public T valueAtTop(int i) {
        if (!data.isEmpty()) {
            return data.get(0);
        } else {
            return null;
        }
    }

    public T valueAtBottom() {
        if (!data.isEmpty()) {
            return (data.get(data.size()));
        } else {
            return null;
        }
    }
    
   
}
