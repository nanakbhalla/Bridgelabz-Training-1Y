import java.util.Scanner;
class vote{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter age");
int a=sc.nextInt();
if(a>=18){System.out.println("Person can vote");}
else{System.out.println("Person cannot vote");}
}}