
package LinkedList;

/**
 *
 * @author David Jennings
 * This class implements a linked list node.
 */
public class LinkedNode<T> {
    private LinkedNode next;
    private T data;
    
    public LinkedNode(LinkedNode next){
        this.next = next;
    }
    public LinkedNode(T data){
        this.data = data;
        this.next = null;
    }
    
    public LinkedNode(){
        this.next = null;
        this.data = null;
    }

    /**
     * @return the next
     */
    public LinkedNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(LinkedNode next) {
        this.next = next;
    }

    /**
     * @return the data
     */
    public T getData() {
        return this.data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }
}
