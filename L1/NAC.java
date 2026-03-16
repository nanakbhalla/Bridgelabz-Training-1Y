import java.util.Scanner;

public class NAC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1));
            arr[i] = sc.nextInt();
        }

        System.out.println("\n Number Check ");

       
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is Positive and Even");
                } else {
                    System.out.println(arr[i] + " is Positive and Odd");
                }
            }
            else if (arr[i] < 0) {
                System.out.println(arr[i] + " is Negative");
            }
            else {
                System.out.println(arr[i] + " is Zero");
            }
        }

        System.out.println("\n First and Last Element Comparison ");

        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("First and last elements are Equal");
        }
        else if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First element is Greater than Last element");
        }
        else {
            System.out.println("First element is Less than Last element");
        }

    }
}
