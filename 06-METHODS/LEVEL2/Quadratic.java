import java.util.Scanner;

public class Quadratic {
    
    public static String findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        if(delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "Root1: " + root1 + ", Root2: " + root2;
        }
        else if(delta == 0) {
            double root = -b / (2 * a);
            return "Root: " + root;
        }
        else {
            return "No real roots";
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        
        String roots = findRoots(a, b, c);
        System.out.println("Roots: " + roots);
        
        sc.close();
    }
}
