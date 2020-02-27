import java.util.Vector;

/**
 * @author men19195
 * @author mon19169
 * @date 23/02/2020
 */

public class StackVector<E> extends abstractStack<E>{

    private Vector<E> stack;

    public StackVector() {
        stack = new Vector<E>();
    }

    public void push(E nuevo) {
        stack.add(nuevo);
    }

    public E pop() {
        return stack.remove(stack.size() - 1);
    }

    public E peek() {
        return stack.lastElement();
    }

    public int size() {
        return stack.size();
    }
}
