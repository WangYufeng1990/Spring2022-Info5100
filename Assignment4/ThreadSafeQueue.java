package Assignment4;



import java.util.LinkedList;


public class ThreadSafeQueue<E> {
    private static Object locker = new Object();
    private LinkedList<E> list = new LinkedList<>();

    public void add(E e) {
        synchronized (locker) {
            String name = Thread.currentThread().getName();
            System.out.println(name + ":add begin");
            list.add(e);
            System.out.println(name + ":add done");
        }
    }

    public E remove() {
        synchronized (locker) {
            String name = Thread.currentThread().getName();
            System.out.println(name + ":remove begin");
            return list.remove();
        }
    }

    public E peek() {
        synchronized (locker) {
            String name = Thread.currentThread().getName();
            System.out.println(name + ":peek begin");
            return list.peek();
        }
    }

    public boolean isEmpty() {
        synchronized (locker) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " is empty: " + list.isEmpty());
            return list.isEmpty();
        }
    }
}
