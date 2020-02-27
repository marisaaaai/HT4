import java.util.ArrayList;

/**
 * @author men19195
 * @author mon19169
 * @date 23/02/2020
 */

public class StackArrayList<E> extends abstractStack<E> {

    private ArrayList<E> stack;

    public StackArrayList(){
        stack = new ArrayList<E>();
    }

    public void push(E item) {
        stack.add(item);
    }

    public E pop() {
        return stack.remove(stack.size() - 1);
    }

    public E peek() {
        return stack.get(stack.size() - 1);
    }

    public int size() {
        return stack.size();
    }
}
