import java.util.LinkedList;

public class GenericQueuecollection<T> {
    private LinkedList<T> queue;

    public GenericQueuecollection() {
        queue = new LinkedList<T>();
    }

    public void offer(T item) {
        queue.addLast(item);
    }

    public T poll() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue.getFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void display() {
        System.out.println("stack elements:");
        for (T item : queue) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        GenericQueuecollection<Integer> queue = new GenericQueuecollection<Integer>();

        System.out.println("Queue is empty? " + queue.isEmpty());

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.display();
        System.out.println("Queue size: " + queue.size());
        System.out.println("Front element: " + queue.peek());

        queue.poll();
        queue.display();
        System.out.println("Queue size after poll operation: " + queue.size());
        System.out.println("Front element after poll operation: " + queue.peek());
    }
}