import java.util.Scanner;

public class BMITWOD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));

            System.out.print("Enter height in meters: ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter weight in kg: ");
            personData[i][1] = sc.nextDouble();

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input! Enter positive values.");
                i--;
            }
        }
		
        for (int i = 0; i < number; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];

            personData[i][2] = weight / (height * height); 

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.println(personData[i][0] + "\t" +
                               personData[i][1] + "\t" +
                               personData[i][2] + "\t" +
                               weightStatus[i]);
        }
    }
}
