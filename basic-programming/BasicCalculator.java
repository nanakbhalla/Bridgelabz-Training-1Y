import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
       double number1 = sc.nextFloat();

        System.out.print("Enter the second number: ");
        double number2 = sc.nextFloat();

        
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;

        
         
        double division = number1 / number2;
          
 
           
     
            System.out.println(
             "The addition, subtraction, multiplication and division value of 2 numbers "
               + addition + ", "
               + subtraction + ", "
               + multiplication + ", and "
               + division
                          );

       
       

        
        
    }
}
