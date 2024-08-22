import java.util.LinkedList;

public class GenericStackcollection<T> {
    private LinkedList<T> stack;

    public GenericStackcollection() {
        stack = new LinkedList<T>();
    }

    public void push(T item) {
        stack.addFirst(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.getFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public void display() {
        System.out.println("stack elements:");
        for (T item : stack) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        GenericStackcollection<Integer> stack = new GenericStackcollection<Integer>();

        System.out.println("Stack is empty? " + stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());
        stack.display();
        stack.pop();
        stack.display();
        System.out.println("Stack size after pop operation: " + stack.size());
        System.out.println("Top element after pop operation: " + stack.peek());
    }
}