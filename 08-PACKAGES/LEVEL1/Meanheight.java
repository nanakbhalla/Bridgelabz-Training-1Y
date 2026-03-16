import java.util.Scanner;

class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_PLAYERS = 11;  // Standard football team
        double[] heights = new double[NUM_PLAYERS];  
        
        System.out.println("Enter heights (cm) for " + NUM_PLAYERS + " players:");
        
        
        double sum = 0;
        for (int i = 0; i < NUM_PLAYERS; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        
        // Calculate and print mean
        double mean = sum / NUM_PLAYERS;
        System.out.printf("Mean height: %.2f cm\n", mean);
        
        sc.close();
    }
}
