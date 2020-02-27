/**
 * @author men19195
 * @author mon19169
 * @version 26/02/2020
 */
public interface Stack<E>
{
    /**
     * pre:
     * post: item is added to stack
     * will be popped next if no intervening push
     * @param item valor del objeto que estara en la ultima posicion
     */
    public void push(E item);

    /**
     * pre: stack is not empty
     * post: most recently pushed item is removed and returned
     * @return Ultimo objeto en el array
     */
    public E pop();

    /**
     * pre: stack is not empty
     * post: top value (next to be popped) is returned
     * @return Ultimo objeto en el array
     */
    public E peek();

    /**
     * @return returns true if and only if the stack is empty
     */
    public boolean empty();

    /**
     * @return returns the number of elements in the stack
     */
    public int size();

}
