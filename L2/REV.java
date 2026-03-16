import java.util.Scanner;

public class REV {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = new int[20];
        int index = 0;

        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        System.out.print("Reversed Number = ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }
    }
}
