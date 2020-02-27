import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackArrayTest {

    @Test
    void pushPeekTest() {
        Stack<Integer> stack = new StackArray<>();
        //Le agrego muchos valores a la lista
        for(int i = 0; i <= 20; i++) {
            stack.push(i);
            //Confirmo que peek me devuelve el ultimo valor en devolver
            assertEquals(i, stack.peek());
            //Lo confirmo otra vez para asegurarme que no haya cambiado el valor
            assertEquals(i, stack.peek());
        }
    }

    @Test
    void pushPopTest() {
        Stack<Character> stack = new StackArray<>();
        String abecedario = "abcdefghijklmnopqrstuvwxyz";

        //Le agrego un valor inicial para evitar un IndexOutOfBounds
        stack.push('a');
        for(int i = 1; i <= abecedario.length() - 1; i++) {
            //Le agrego una letra al stack
            stack.push(abecedario.charAt(i));

            //Confirmo que me devuelve la letra correcta
            assertEquals(abecedario.charAt(i), stack.pop());
            //Si elimin� el valor, la siguiente vez que lo llamo deber�a darme el valor anterior
            assertEquals(abecedario.charAt(i - 1), stack.pop());

            //Vuelvo todo a la normalidad
            stack.push(abecedario.charAt(i - 1));
            stack.push(abecedario.charAt(i));
        }
    }

    @Test
    void pushSize() {
        Stack<Integer> stack = new StackArray<>();
        for(int i = 0; i < 20; i++) {
            //Le agrego muchos valores al Stack
            stack.push(i);
            //Como empece en 0, confirmo que sean del tama�o correcto agregandole 1 a i
            assertEquals(i + 1, stack.size());
        }
    }

    @Test
    void empty() {
        //Pruebo si esta vacio
        Stack<String> stack = new StackArray<>();
        assertEquals(true, stack.empty());
        //Pruebo si no esta vacio
        stack.push("nobody expects the spanish inquisition");
        assertEquals(false, stack.empty());
    }
}