import java.util.Scanner;
class naturalf{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int sum=0;
System.out.println("Enter no");
int a=sc.nextInt();
int ns=a*(a+1)/2;
for(int i=0;i<=a;i++){
sum=sum+i;}
System.out.println(sum);
System.out.println(ns);
}}