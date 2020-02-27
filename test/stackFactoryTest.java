import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class stackFactoryTest {

    @Test
    void getStack() {
        assertTrue(new stackFactory().getStack(1) instanceof StackArrayList);

        assertTrue(new stackFactory().getStack(2) instanceof StackVector);

        assertTrue(new stackFactory().getStack(3) instanceof StackArray);

    }
}