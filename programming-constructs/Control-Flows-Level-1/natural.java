import java.util.Scanner;
class natural{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int sum=0;
System.out.println("Enter no");
int a=sc.nextInt();
int i=a;
int ns=a*(a+1)/2;
while(i!=0){
sum=sum+i;
i--;}
System.out.println(sum);
System.out.println(ns);
}}