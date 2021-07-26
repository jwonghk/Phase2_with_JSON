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
        assertEquals(testCustomer.fdList.foodItemsOrdered.size(),0);
        assertTrue(testCustomer.fdList.foodItemsOrdered.isEmpty());
    }

    @Test
    void testAddFood(){
        FoodItem foodItem = new FoodItem(3);
        FoodItem foodItem2 = new FoodItem(2);
        FoodItem foodItem3 = new FoodItem(1);

        testCustomer.addFood(foodItem);
        assertEquals(1,testCustomer.fdList.foodItemsOrdered.size());
        testCustomer.addFood(foodItem2);
        testCustomer.addFood(foodItem3);
        assertEquals(3,testCustomer.fdList.foodItemsOrdered.size());
    }

    @Test
    void testRemoveFood(){
        FoodItem foodItem = new FoodItem(3); // 3 stands for Chicken
        FoodItem foodItem2 = new FoodItem(2); // 2 stands for Pepsi
        FoodItem foodItem3 = new FoodItem(1); // 1 stands for Coke
        testCustomer.addFood(foodItem);
        testCustomer.addFood(foodItem2);
        testCustomer.addFood(foodItem2);
        testCustomer.addFood(foodItem2);
        testCustomer.addFood(foodItem3);
        assertEquals(5,testCustomer.fdList.foodItemsOrdered.size());
        testCustomer.removeFood(2,2);
        assertEquals(3,testCustomer.fdList.foodItemsOrdered.size());
    }

    @Test
    void testTotalCost(){
        FoodItem foodItem = new FoodItem(3); // 3 stands for Chicken
        FoodItem foodItem2 = new FoodItem(2); // 2 stands for Pepsi
        FoodItem foodItem3 = new FoodItem(1); // 1 stands for Coke
        testCustomer.addFood(foodItem);   // Chicken is $6 each
        testCustomer.addFood(foodItem2);  // Pepsi is $2 each
        testCustomer.addFood(foodItem2);
        testCustomer.addFood(foodItem2);
        testCustomer.addFood(foodItem3);  // Coke is $1 each
        assertEquals(13,testCustomer.totalCost());
    }

    @Test
    void testcountIndividiualItems(){
        FoodItem foodItem = new FoodItem(3); // 3 stands for Chicken
        FoodItem foodItem2 = new FoodItem(2); // 2 stands for Pepsi
        FoodItem foodItem3 = new FoodItem(1); // 1 stands for Coke
        testCustomer.addFood(foodItem);   // Chicken is $6 each
        testCustomer.addFood(foodItem2);  // Pepsi is $2 each
        testCustomer.addFood(foodItem2);
        testCustomer.addFood(foodItem2);
        testCustomer.addFood(foodItem3);  // Coke is $1 each

        assertEquals(3,testCustomer.countIndividiualItems(2));
        assertEquals(0,testCustomer.countIndividiualItems(4));
        assertEquals(1,testCustomer.countIndividiualItems(1));
        assertEquals(1,testCustomer.countIndividiualItems(3));
    }

    @Test
    void testToString() {
        assertTrue(testCustomer.toString().contains("Your total items' cost is: $"));
    }





}
