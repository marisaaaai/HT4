/**
 * @author men19195
 * @author mon19169
 * @date 23/02/2020
 */

public class StackArray<E> extends abstractStack<E> {
    private Object[] stack;
    private int size;

    public StackArray() {
        stack = new Object[50];
        size = 0;
    }

    public void push(E item) {
        stack[size++] = item;
    }

    public E pop() {
        E temp = (E) stack[--size];
        stack[size] = null;
        return temp;
    }

    public E peek() {
        return (E) stack[size - 1];
    }

    public int size() {
        return size;
    }
}
