import java.util.Scanner;
class factorial{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int fact=1;
System.out.println("Enter no");
int a=sc.nextInt();
int i=a;
while(i>0){
fact=fact*i;
i--;}
System.out.println(fact);
}}