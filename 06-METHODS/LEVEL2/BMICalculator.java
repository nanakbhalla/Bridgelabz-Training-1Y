import java.util.Scanner;

public class BMICalculator {
    
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }
    
    public static String getBMIStatus(double bmi) {
        if(bmi < 18.5) return "Underweight";
        if(bmi < 25) return "Normal";
        if(bmi < 30) return "Overweight";
        return "Obese";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 1; i <= 10; i++) {
            System.out.print("Member " + i + " - Weight(kg): ");
            double weight = sc.nextDouble();
            System.out.print("Height(cm): ");
            double height = sc.nextDouble();
            
            double bmi = calculateBMI(weight, height);
            String status = getBMIStatus(bmi);
            
            System.out.printf("Weight: %.1fkg, Height: %.1fcm, BMI: %.2f - %s%n%n", 
                            weight, height, bmi, status);
        }
        
        sc.close();
    }
}
