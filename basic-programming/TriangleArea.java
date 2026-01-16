import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter base of the triangle (in inches): ");
        double base = sc.nextDouble();

        System.out.print("Enter height of the triangle (in inches): ");
        double height = sc.nextDouble();

        
        double areaInSqInches = 0.5 * base * height;

        
        double areaInSqCm = areaInSqInches * 6.4516;

    
        System.out.println("\nArea of Triangle:");
        System.out.println("In Square Inches: " + areaInSqInches);
        System.out.println("In Square Centimeters: " + areaInSqCm);

    
    }
}
