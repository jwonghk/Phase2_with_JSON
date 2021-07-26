package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FoodOrderAppTest {

    private Customer testCustomer;

    @BeforeEach
    void runBefore() {
        testCustomer = new Customer("Peter");
    }

    @Test
    void testConstructor() {
        assertEquals("Peter", testCustomer.getName());
        assertTrue(testCustomer.getId() > 0);
        assertEquals(testCustomer.getBalance(),0);
        assertEquals(testCustomer.getFoodItemList(),null);
    }

    @Test
    void testAddFood(){

    }







}
