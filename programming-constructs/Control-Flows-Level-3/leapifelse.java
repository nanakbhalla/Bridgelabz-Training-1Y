import java.util.Scanner;
class leapifelse{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter year");
int a=sc.nextInt();
if(a<1582){
System.out.println("not valid");
}
else if(a%4!=0){
System.out.println("not leap year");
}
else if(a%100==0){
if(a%400==0){System.out.println("leap year");}
else{System.out.println(" not a leap year");}
}
else{System.out.println("leap year");}
}}