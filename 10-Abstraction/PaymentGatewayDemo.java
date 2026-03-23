interface PaymentProcessor {
    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Default refund of Rs. " + amount + " initiated.");
    }
}

class PayPal implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Payment of Rs. " + amount + " made through PayPal.");
    }
}

class Stripe implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Payment of Rs. " + amount + " made through Stripe.");
    }
}

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        PaymentProcessor p1 = new PayPal();
        PaymentProcessor p2 = new Stripe();

        p1.pay(2500);
        p1.refund(1000);

        System.out.println();

        p2.pay(4000);
        p2.refund(1500);
    }
}