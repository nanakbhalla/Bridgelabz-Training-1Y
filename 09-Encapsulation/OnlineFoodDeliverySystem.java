import java.util.ArrayList;

interface Discountable {
    double applyDiscount();
    void getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    public void getDiscountDetails() {
        System.out.println("Discount: " + applyDiscount());
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50;
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    public void getDiscountDetails() {
        System.out.println("Discount: " + applyDiscount());
    }
}

public class OnlineFoodDeliverySystem {
    public static void processOrder(ArrayList<FoodItem> items) {
        for (FoodItem item : items) {
            item.getItemDetails();

            double totalPrice = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                discount = d.applyDiscount();
                d.getDiscountDetails();
            }

            double finalPrice = totalPrice - discount;
            System.out.println("Total Price: " + totalPrice);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        ArrayList<FoodItem> order = new ArrayList<FoodItem>();

        order.add(new VegItem("Paneer Pizza", 200, 2));
        order.add(new NonVegItem("Chicken Burger", 150, 3));
        order.add(new VegItem("Veg Sandwich", 100, 1));

        processOrder(order);
    }
}