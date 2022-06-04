import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Deque{

    // construct an empty deque
    public Deque(){
        // TODO

    }

    // is the deque empty?
    public boolean isEmpty(){
        // TODO
        return false;
    }

    // return the number of items on the deque
    public int size(){
        // TODO
        return 0;
    }

    // add the item to the front
    public void addFirst(int item){
        // TODO
    }

    // add the item to the back
    public void addLast(int item){
        // TODO
    }

    // remove and return the item from the front
    public int removeFirst(){
        // TODO
        return 0;
    }

    // remove and return the item from the back
    public int removeLast(){
        // TODO
        return 0;
    }

    // unit testing (required)
    public static void main(String[] args){
        Deque d = new Deque();
        d.addFirst(1);
        d.addLast(2);
        d.addLast(3);
        StdOut.println(d.removeFirst());
        StdOut.println(d.removeLast());
        StdOut.println(d.removeFirst());
    }

}
