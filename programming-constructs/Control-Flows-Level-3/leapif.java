import java.util.Scanner;
class leapif{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter year");
int a=sc.nextInt();
if(a >= 1582 && ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))){
System.out.println("leap year");
}
else{System.out.println("not a leap year");
}
}}