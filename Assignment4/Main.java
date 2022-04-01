package Assignment4;

public class Main {
    public static void main(String[] args) {
        Thread[] threads = new Thread[10000];
        ThreadSafeQueue tsq = new ThreadSafeQueue();

        for (int i = 0; i < 10; i++) {
            new Thread(() -> tsq.add(1)).start();
        }

        for (int i = 0; i < 10; i++) {
            new Thread(() -> tsq.isEmpty()).start();
        }

        for (int i = 0; i < 10; i++) {
            new Thread(() -> tsq.peek()).start();
        }

        for (int i = 0; i < 10; i++) {
            new Thread(() -> tsq.remove()).start();
        }

        for (int i = 0; i < 10; i++) {
            new Thread(() -> tsq.isEmpty()).start();
        }

    }
}
