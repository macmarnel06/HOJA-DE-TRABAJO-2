import java.util.Vector;

public class VectorStack<T> implements Stack<T> {
    private Vector<T> data = new Vector<>(); // [cite: 9, 38]

    public void push(T value) { data.add(value); }

    public T pop() {
        if (isEmpty()) throw new RuntimeException("Stack vacía");
        return data.remove(data.size() - 1);
    }

    public T peek() { return data.lastElement(); }

    public boolean isEmpty() { return data.isEmpty(); }

    public int size() { return data.size(); }
}
