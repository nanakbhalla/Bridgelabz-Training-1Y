import java.util.Scanner;
public class Circle{
public static double Area(int radius){
return Math.PI*radius*radius;}
public static double Circ(int radius){
return Math.PI*2*radius;}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter Radius-");
int r=sc.nextInt();
System.out.println("Area ="+Area(r));
System.out.println("Circumferemce ="+Circ(r));



}

}