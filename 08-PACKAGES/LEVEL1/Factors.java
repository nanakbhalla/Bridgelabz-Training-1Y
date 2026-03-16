import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        
                int[] factors = new int[n];
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[count] = i;
                count++;
            }
        }
        
        
        System.out.print("Factors: ");
        for (int i = 0; i < count; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
