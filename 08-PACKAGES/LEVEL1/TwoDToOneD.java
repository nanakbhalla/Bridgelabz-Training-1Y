import java.util.Scanner;

class TwoDToOneD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr2D = new int[rows][cols];

        System.out.println("Enter elements of 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("arr2D[" + i + "][" + j + "] = ");
                arr2D[i][j] = sc.nextInt();
            }
        }

        int[] arr1D = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1D[index] = arr2D[i][j];
                index++;
            }
        }

        System.out.println("\n2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n1D Array (flattened):");
        for (int i = 0; i < arr1D.length; i++) {
            System.out.print(arr1D[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
