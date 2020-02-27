import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class listaFactoryTest {

    @Test
    void getList(){
        assertTrue(new listaFactory().getList(1) instanceof SinglyLinkedList);

        assertTrue(new listaFactory().getList(2) instanceof DoublyLinkedList);

        assertTrue(new listaFactory().getList(3) instanceof CircularList);
    }

}