package model;

// Each FoodItem has a foodID, the price, and food Name
public class FoodItem {

    int foodID;
    int price;
    String foodName;

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
