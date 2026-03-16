import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.print("Enter account holder name: ");
        acc.accountHolder = sc.nextLine();

        System.out.print("Enter account number: ");
        acc.accountNumber = sc.nextInt();

        System.out.print("Enter opening balance: ");
        acc.balance = sc.nextDouble();

        System.out.println("Current balance: " + acc.balance);

        System.out.print("Enter amount to deposit: ");
        double d = sc.nextDouble();
        acc.deposit(d);
        System.out.println("Current balance: " + acc.balance);

        System.out.print("Enter amount to withdraw: ");
        double w = sc.nextDouble();
        acc.withdraw(w);
        System.out.println("Current balance: " + acc.balance);

        sc.close();
    }
}
