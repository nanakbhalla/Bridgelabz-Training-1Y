import java.util.Scanner;
class harshadno{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter no");
int a=sc.nextInt();
int rem=0;
int sum=0;
int temp=a;
while(a!=0){
rem=a%10;
a=a/10;
sum=sum+rem;}
if(temp%sum==0){System.out.println("Harshad no");}
else{System.out.println("not Harshad no");}
}}