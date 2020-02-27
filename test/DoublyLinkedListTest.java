/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maris
 */
public class DoublyLinkedListTest {
    int count;
    public DoublyLinkedListTest() {
        count=1;
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addFirst method, of class DoublyLinkedList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object value = 5;
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.addFirst(value);
        int expResult =1;
        assertEquals(expResult,count);
        if(expResult!=count){
        
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
            
        }
    }

    /**
     * Test of addLast method, of class DoublyLinkedList.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object value = 5;
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.addLast(value);
        int expResult =1;
        assertEquals(expResult,count);
        if(expResult!=count){
        
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
            
        }
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of remove method, of class DoublyLinkedList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        DoublyLinkedList instance = new DoublyLinkedList();
        int expResult = 1;
        assertEquals(expResult, count);
        if(expResult!=count){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getFirst method, of class DoublyLinkedList.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        DoublyLinkedList instance = new DoublyLinkedList();
        int expResult = 1;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class DoublyLinkedList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        DoublyLinkedList instance = new DoublyLinkedList();
        int expResult = 1;
        assertEquals(expResult, count);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult!=count)fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class DoublyLinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        DoublyLinkedList instance = new DoublyLinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        if(expResult!=result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }
    
}