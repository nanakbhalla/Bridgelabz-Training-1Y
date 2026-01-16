import java.util.Scanner;

public class Handshake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

       
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        
        System.out.println("Max number of possible handshakes: " + handshakes);

        
    }
}
