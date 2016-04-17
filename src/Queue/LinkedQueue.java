package Queue;

import LinkedList.LinkedNode;

/**
 *
 * @author David Jennings This class implements a queue using linkedList.
 */
public class LinkedQueue {

    private static LinkedNode qFront;
    private static LinkedNode qRear;
    private static int numItems;

    public LinkedQueue() {
        numItems = 0;
        qFront = null;
        qRear = null;

    }

    public LinkedQueue(LinkedNode first) {
        numItems = 0;
        this.qFront = first;
        this.qRear = first;
        numItems++;

    }

    public void enqueue(LinkedNode add) {
        if (qFront == null && qRear == null) {
            qFront = add;
            qRear = add;
            numItems++;
            return;
        }
        if (qFront == qRear) {
            qRear = add;
            qRear.setNext(qFront);
            numItems++;
            return;
        }
        LinkedNode temp = qRear;
        add.setNext(temp);
        qRear = add;
        numItems++;

    }

    public LinkedNode dequeue() {
        if (numItems == 0) {
            return null;
        }
        if (numItems == 1) {
            LinkedNode temp = qFront;
            qFront = null;
            qRear = null;
            temp.setNext(null);
            numItems--;
            return temp;
        }

        qFront.setNext(null);
        LinkedNode temp = qFront;
        qFront = null;
        qFront = getNext(qRear);
        numItems--;
        return temp;

    }

    public LinkedNode getNext(LinkedNode node) {
        LinkedNode temp = node;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
            
        }

        return temp;
    }

    public boolean isEmpty() {
        if (numItems == 0) {
            return true;
        } else {
            return false;
        }

    }

    public LinkedNode valueAtTop() {
        return qFront;
    }

    public LinkedNode valueAtBottom() {
        return qRear;
    }

    public int size() {
        return numItems;
    }

//    public static void main(String args[]) {
//        LinkedQueue queue = new LinkedQueue();
//     System.out.println(queue.isEmpty());
//     System.out.println(queue.size());
//        LinkedNode nod1 = new LinkedNode<>(1);
//        LinkedNode nod2 = new LinkedNode<>(2);
//        LinkedNode nod3 = new LinkedNode<>(3);
//        LinkedNode nod4 = new LinkedNode<>(4);
//        LinkedNode nod5 = new LinkedNode<>(5);
//        queue.enqueue(nod1);
//        queue.enqueue(nod2);
//        queue.enqueue(nod3);
//        queue.enqueue(nod4);
//        queue.enqueue(nod5);
//        System.out.println(queue.qFront.getData());
//        System.out.println(queue.qRear.getData());
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.size());
//        System.out.println(queue.dequeue().getData());
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.size());
//        System.out.println(queue.valueAtBottom().getData());
//        System.out.println(queue.valueAtTop().getData());
//        System.out.println(queue.dequeue().getData());
//        System.out.println(queue.dequeue().getData());
//        System.out.println(queue.dequeue().getData());
//        System.out.println(queue.dequeue().getData());
//        System.out.println(queue.valueAtBottom());
//        System.out.println(queue.valueAtTop());
//    }

}
