import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack<T> {

    private LinkedList<T> stack;

    public LinkedStack() {
        stack = new LinkedList<>();
    }

    public void push(T item) {
        stack.push(item);
    }

    public T pop() {
        return stack.pop();
    }

    public T peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public void printStack() {
        ListIterator<T> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.nextIndex());
        }
    }

}
