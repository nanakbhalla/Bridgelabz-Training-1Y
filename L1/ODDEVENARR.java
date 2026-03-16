import java.util.Scanner;

public class ODDEVENARR {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
		
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number.");
            return;
        }

        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        int eIndex = 0;
        int oIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[eIndex] = i;
                eIndex++;
            } else {
                odd[oIndex] = i;
                oIndex++;
            }
        }

        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println("\n\nEven Numbers:");
        for (int i = 0; i < eIndex; i++) {
            System.out.print(even[i] + " ");
        }

    }
}
