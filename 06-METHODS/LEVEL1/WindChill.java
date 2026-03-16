import java.util.Scanner;
class WindChill{
public static double calculateWindChill(double temp,double windSpeed){
double windChill=35.74 + 0.6215*temp + (0.4275*temp - 35.75)*Math.pow(windSpeed,0.16);
return windChill;
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER TEMPERATURE-");
double t=sc.nextDouble();
System.out.println("ENTER WIND SPEED-");
double w=sc.nextDouble();
double result=calculateWindChill(t,w);
System.out.println("WIND CHILL-"+result);
sc.close();
}
}
