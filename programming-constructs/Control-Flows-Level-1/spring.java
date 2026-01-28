import java.util.Scanner;
class spring{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter month");
int a=sc.nextInt();
System.out.println("Enter date");
int b=sc.nextInt();
if((a==3 && b>=20 && b<=31) || (a==4 && b>=1 && b<=31) || (a==5 && b>=1 && b<=31) || (a==6 && b>=1 && b<=20)){System.out.println("spring season");}
else{System.out.println("not spring season");}
}}