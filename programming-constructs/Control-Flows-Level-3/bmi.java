import java.util.Scanner;
class bmi{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Weight in kg");
double a=sc.nextInt();
System.out.println("Enter height in cm");
double b=sc.nextInt();
double c=b/100;
double bmi=a/(c*c);
if(bmi<=18.4){System.out.println("BMI is="+bmi);
System.out.println("Underweight");
}
else if(bmi>=18.5 && bmi<=24.9){System.out.println("BMI is="+bmi);
System.out.println("Normal");
}
else if(bmi>=25.0 && bmi<=39.9){System.out.println("BMI IS="+bmi);
System.out.println("Overweight");
}
else{System.out.println("Bmi is="+bmi);
System.out.println("Obese");
}
}}