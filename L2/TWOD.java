import java.util.Scanner;

public class TWOD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3]; 
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {
                do {
                    if (j == 0) System.out.print("Physics: ");
                    else if (j == 1) System.out.print("Chemistry: ");
                    else System.out.print("Maths: ");
                    marks[i][j] = sc.nextDouble();
                } while (marks[i][j] < 0);
            }

            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (percent[i] >= 80) grade[i] = 'A';
            else if (percent[i] >= 70) grade[i] = 'B';
            else if (percent[i] >= 60) grade[i] = 'C';
            else if (percent[i] >= 50) grade[i] = 'D';
            else if (percent[i] >= 40) grade[i] = 'E';
            else grade[i] = 'F';
        }

        System.out.println("\nPhy\tChem\tMath\tPercent\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%.2f\t%c\n",
                    marks[i][0], marks[i][1], marks[i][2], percent[i], grade[i]);
        }
    }
}
