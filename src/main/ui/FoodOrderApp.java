package ui;

import model.Customer;
import model.FoodItem;

import java.util.Locale;
import java.util.Scanner;


//Source: Mainly from the Teller application posted on course edx site
public class FoodOrderApp {

    private Customer customer;
    private Scanner input;


    //EFFECTS: run the Food Order application
    public FoodOrderApp() {
        runFoodOrder();
    }

    //MODIFIES: this
    //EFFECTS: process user input
    private void runFoodOrder() {
        boolean keepGoing = true;
        String command = null;

        init();

        while (keepGoing) {
            displayMenu();
            command = input.next();
            command = command.toLowerCase();

            if (command.equals("f")) {
                keepGoing = false;
            } else {
                processCommand(command);
            }
        }

        System.out.println("\nPlease visit again!");
    }

    //MODIFIES: this
    //EFFECTS: process user command
    private void processCommand(String command) {
        if (command.equals("d")) {
            processDrink();
        } else if (command.equals("b")) {
            processBurger();
        } else if (command.equals("c")) {
            processCancel();
        } else {
            System.out.println("Selection not valid ...");
        }
    }


    //MODIFIES: this
    //EFFECTS: initializes Customer
    private void init() {
        customer = new Customer("Customer");
        input = new Scanner(System.in);
    }

    //EFFECTS: display menu of options to user
    private void displayMenu() {
        System.out.println("\nSelect from:");
        System.out.println("\td -> drinks");
        System.out.println("\tb -> burgers");
        System.out.println("\tc -> Cancel items");
        System.out.println("\tf -> finished ordering!");
    }

    //MODIFIES: this
    //EFFECTS: add drink to the order list
    private void processDrink() {
        int coke = 0;
        int pep = 0;
        FoodItem fd1 = new FoodItem(1);
        FoodItem fd2 = new FoodItem(2);

        System.out.println("How many cokes? (Coke is $1 each)");
        coke = input.nextInt();
        if (coke > 0) {
            for (int i = 0; i < coke; i++) {
                customer.addFood(fd1);
            }
        }
        System.out.println("How many pepsi? (Pepsi is $2 each)");
        pep = input.nextInt();
        if (pep > 0) {
            for (int i = 0; i < pep; i++) {
                customer.addFood(fd2);
            }
        }

        printBalanceAndFood();
    }


    //MODIFIES: this
    //EFFECTS: add burgers to the order list
    private void processBurger() {
        int chicken = 0;
        int beef = 0;
        FoodItem fd3 = new FoodItem(3);
        FoodItem fd4 = new FoodItem(4);

        System.out.println("How many chickens sandwiches? (Chicken is $3 each)");
        chicken = input.nextInt();
        if (chicken > 0) {
            for (int i = 0; i < chicken; i++) {
                customer.addFood(fd3);
            }
        }
        System.out.println("How many beef sandwiches? (Beef is $4 each)");
        beef = input.nextInt();
        if (beef > 0) {
            for (int i = 0; i < beef; i++) {
                customer.addFood(fd4);
            }
        }

        printBalanceAndFood();
    }


    //Effects: cancel (or remove) food items from ordered lists
    private void processCancel() {
        int itemId;
        int numbCancel;
        System.out.println("Please enter Item to cancel");
        System.out.println("Please type 1 for Coke");
        System.out.println("Please type 2 for Pepsi");
        System.out.println("Please type 3 for Chicken");
        System.out.println("Please type 4 for Beef");
        itemId = input.nextInt();

        System.out.println("How many to cancel?");
        numbCancel = input.nextInt();

        //for (int i = 0; i < numbCancel; i++) {
        customer.removeFood(itemId, numbCancel);
        //}

        printBalanceAndFood();

    }

    //Effects: prints current balance and food ordered
    private void printBalanceAndFood() {
        System.out.println("Your current orders are following:"
                + "\tCoke " + customer.countIndividiualItems(1));
        System.out.println(
                 "\tPepsi " + customer.countIndividiualItems(2));
        System.out.println(
                "\tChicken " + customer.countIndividiualItems(3));
        System.out.println(
                "\tBeef " + customer.countIndividiualItems(4));

        System.out.println("Your current"
                + "total is: " + customer.totalCost());
    }
}





