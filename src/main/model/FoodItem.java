package model;

// Each FoodItem has a foodID, the price, and food Name
public class FoodItem {

    int foodID;
    int price;
    String foodName;

    //Effect: based on the assigned foodNumber, the price and the food ID (for identifying type
    //        of food) can be matched. For example, foodNumber == 1 means Coke which sells
    //        for $1 dollar each. FoodID will be used for the customer to select/cancel the item
    //        in the menu displayed.
    public FoodItem(int foodNumber) {
        if (foodNumber == 1) {
            this.foodName = "Coke";
            this.price = 1;
            this.foodID = 1;

        } else if (foodNumber == 2) {
            this.foodName = "Pepsi";
            this.price = 2;
            this.foodID = 2;

        } else if (foodNumber == 3) {
            this.foodName = "Chicken";
            this.price = 6;
            this.foodID = 3;

        } else if (foodNumber == 4) {
            this.foodName = "Beef";
            this.price = 8;
            this.foodID = 4;
        }
    }
}

