import java.util.Scanner;
class Interest{
public static double SI(double p ,double r ,double t){
return (p*r*t)/100;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter principal: ");
        double a = sc.nextDouble();

        System.out.print("Enter rate (% per year): ");
        double  b= sc.nextDouble();

        System.out.print("Enter time (in years): ");
        double c = sc.nextDouble();

double si=SI(a,b,c);
System.out.println(si);
}
}