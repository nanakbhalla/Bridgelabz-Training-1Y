import java.util.Scanner;
class count{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter no");
int a=sc.nextInt();
int count=0;
while(a!=0){
a=a/10;
count++;}
System.out.println(count);
}}