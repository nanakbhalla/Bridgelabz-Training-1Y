import java.util.Scanner;

public class MARKS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] phy = new double[n];
        double[] chem = new double[n];
        double[] math = new double[n];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            do {
                System.out.print("Physics: ");
                phy[i] = sc.nextDouble();
            } while (phy[i] < 0);

            do {
                System.out.print("Chemistry: ");
                chem[i] = sc.nextDouble();
            } while (chem[i] < 0);

            do {
                System.out.print("Maths: ");
                math[i] = sc.nextDouble();
            } while (math[i] < 0);

            percent[i] = (phy[i] + chem[i] + math[i]) / 3;

            if (percent[i] >= 80) grade[i] = 'A';
            else if (percent[i] >= 70) grade[i] = 'B';
            else if (percent[i] >= 60) grade[i] = 'C';
            else if (percent[i] >= 50) grade[i] = 'D';
            else if (percent[i] >= 40) grade[i] = 'E';
            else grade[i] = 'F';
        }

        System.out.println("\nPhy\tChem\tMath\tPercent\ tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%.2f\t%c", phy[i], chem[i], math[i], percent[i], grade[i]);
        }
    }
}
