import java.util.Scanner;

public class STORENUMBERS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double sum = 0;
        int index = 0;

        while (true) {

            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            if (index == 10) {
                System.out.println("Array is full. Cannot enter more than 10 numbers.");
                break;
            }

            numbers[index] = num;
            index++;
        }

        System.out.println(" Numbers entered ");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            sum = sum + numbers[i];
        }
        System.out.println(" Total Sum = " + sum);

        
		}
	}	