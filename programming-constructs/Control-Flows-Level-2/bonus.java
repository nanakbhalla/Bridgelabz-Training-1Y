import java.util.Scanner;
class bonus{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter years of service");
int a=sc.nextInt();
if(a>=5){
System.out.println("Enter salary");
int b=sc.nextInt();
int c=(b/100)*5;
System.out.println("bonus amt is" +c);}
else{System.out.println("you are not eligible for bonus");}
}}