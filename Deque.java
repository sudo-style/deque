import java.util.Iterator;
import java.util.NoSuchElementException;
//import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Deque<Item> implements Iterable<Item>{
    int size = 0;
    Node first = null;
    Node last = null;
    
    public class Node{
        Item item;
        Node next = null;
        Node prev = null;
        public Node(Item item){
            this.item = item;
        }
    }

    private class DequeIterator implements Iterator<Item>{
        private Node current = first;
        public boolean hasNext(){
            return current != null;
        }
        public void remove(){
            throw new UnsupportedOperationException();
        }
        public Item next(){
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public Iterator<Item> iterator(){
        return new DequeIterator();
    }
    // construct an empty deque
    public Deque(){
    }

    // is the deque empty?
    public boolean isEmpty(){
        return size == 0;
    }

    // return the number of items on the deque
    public int size(){
        return size;
    }

    // add the item to the front
    public void addFirst(Item item){
        Node oldFirst = first;
        first = new Node(item);
        if(oldFirst != null) oldFirst.prev = first;
        first.next = oldFirst;
        first.prev = null;
        size++;
    }

    // add the item to the back
    public void addLast(Item item){
        Node oldLast = last;
        last = new Node(item);
        if(oldLast != null) oldLast.next = last;
        last.prev = oldLast;
        last.next = null;
        size++;
    }

    // remove and return the item from the front
    public Item removeFirst(){
        Item item = first.item;
        Node oldFirst = first;
        first = first.next;
        if (oldFirst != null) oldFirst.next = null;
        size--;
        return item;
    }

    // remove and return the item from the back
    public Item removeLast(){
        Item item = last.item;
        Node oldLast = last;
        last = last.prev;
        if (oldLast != null) oldLast.prev = null;
        size--;
        return item;
    }



    // unit testing (required)
    public static void main(String[] args){
        Deque<Integer> d = new Deque<Integer>();
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        d.addLast(4);
        d.addLast(5);
        d.addLast(6);
        StdOut.println(d.removeFirst());
        StdOut.println(d.removeLast());
        StdOut.println(d.removeFirst());
        StdOut.println(d.removeLast());
        StdOut.println(d.removeFirst());
        StdOut.println(d.removeLast());
    }

}
