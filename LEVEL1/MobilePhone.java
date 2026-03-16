import java.util.Scanner;

public class MobilePhone {
    String brand;
    String model;
    double price;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobilePhone m1 = new MobilePhone();

        System.out.print("Enter brand: ");
        m1.brand = sc.nextLine();

        System.out.print("Enter model: ");
        m1.model = sc.nextLine();

        System.out.print("Enter price: ");
        m1.price = sc.nextDouble();

        m1.display();
    }
}
