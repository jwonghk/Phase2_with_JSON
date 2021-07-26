package model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class FoodItemList {
    ArrayList<FoodItem> foodItemsOrdered = new ArrayList<FoodItem>();

    //REQUIRE: at least one item in the list
    //MODIFIES: this
    //EFFECT: remove an item from the foodItemsOrdered list based on the foodId
    public void removeFood(int fdID, int numb) {
//        for (FoodItem foodItem: foodItemsOrdered) {
//            if (foodItem.foodID == fdID) {
//                foodItemsOrdered.remove(foodItem);
//            }
        int i = 0;
        Iterator<FoodItem> itr = foodItemsOrdered.iterator();
        while (itr.hasNext() && i < numb) {
            if (itr.next().foodID == fdID) {
                itr.remove();
                i = i + 1;
            }
        }
    }


    //MODIFIES: this
    //EFFECT: add an item to the FoodItemList
    public void addFood(FoodItem fdItem) {
        foodItemsOrdered.add(fdItem);
    }

}


