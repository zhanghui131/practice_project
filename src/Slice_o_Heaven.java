public class Slice_o_Heaven {
    // Variables
    String storeName;
    String storeAddress;
    String storeEmail;
    long storePhone;
    String storeMenu;
    String pizzaIngredients;
    double pizzaPrice;
    String sides;
    String drinks;
    String orderID;
    double orderTotal;

    // Method to take an order
    public void takeOrder(String id, String ingredients, String sideItems, String drinkChoices) {
        orderID = id;
        pizzaIngredients = ingredients;
        sides = sideItems;
        drinks = drinkChoices;

        orderTotal = pizzaPrice;
        // You can add more complex logic here to calculate total based on sides and drinks later

        System.out.println("Order " + orderID + " has been taken.");
        makePizza();
    }

    // Method to make the pizza
    public void makePizza() {
        System.out.println("Preparing pizza with " + pizzaIngredients + ".");
        try {
            // Simulating time to make pizza
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Pizza is ready!");
        printReceipt();
    }

    // Method to print the receipt
    public void printReceipt() {
        System.out.println("********** Receipt **********");
        System.out.println("Order ID: " + orderID);
        System.out.println("Pizza Ingredients: " + pizzaIngredients);
        System.out.println("Sides: " + sides);
        System.out.println("Drinks: " + drinks);
        System.out.println("Total: $" + orderTotal);
        System.out.println("Thank you for ordering from " + storeName + "!");
    }

    public static void main(String[] args) {
        Slice_o_Heaven pizzeria = new Slice_o_Heaven();
        pizzeria.storeName = "Slice - o - Heaven";
        pizzeria.storeAddress = "123 Pizza Lane";
        pizzeria.storeEmail = "info@sliceoheaven.com";
        pizzeria.storePhone = 1234567890;
        pizzeria.storeMenu = "Pizzas, Sides, Drinks";
        pizzeria.pizzaPrice = 12.99;

        pizzeria.takeOrder("001", "Pepperoni, Mushrooms", "Garlic Bread", "Cola");
    }
}