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
public class CircularListTest {
    
    public CircularListTest() {
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
     * Test of getFirst method, of class CircularList.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        CircularList<Integer> instance = new CircularList<Integer>();
        instance.addFirst(5);
        int expResult = 5;
        int result = instance.getFirst();
        assertEquals(expResult, result);
    }

    /**
     * Test of addFirst method, of class CircularList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        int value = 5;
        CircularList<Integer> instance = new CircularList<Integer>();
        instance.addFirst(value);
        int expResult=5;
        int result=instance.getFirst();
        assertEquals(expResult, result);
    }

    /**
     * Test of addLast method, of class CircularList.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        int value = 5;
        CircularList<Integer> instance = new CircularList<Integer>();
        instance.addLast(value);
        int expResult=value;
        int result = instance.getFirst();
        assertEquals(expResult, result);

    }

    /**
     * Test of remove method, of class CircularList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        CircularList<Integer> instance = new CircularList<Integer>();
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class CircularList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        CircularList instance = new CircularList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
