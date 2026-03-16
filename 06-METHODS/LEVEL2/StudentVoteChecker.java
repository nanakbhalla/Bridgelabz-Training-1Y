import java.util.Scanner;

public class StudentVoteChecker {
    
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;         }
        return age >= 18;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];
        
        System.out.println("Enter age of 10 students:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            studentAges[i] = scanner.nextInt();
            
            boolean canVote = canStudentVote(studentAges[i]);
            System.out.println("Student " + (i + 1) + " (" + studentAges[i] + "): " 
                             + (canVote ? "Can Vote" : "Cannot Vote"));
            System.out.println();
        }
        
        scanner.close();
    }
}
