import java.util.Scanner;
class powerw{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter no");
int a=sc.nextInt();
System.out.println("Enter power");
int b=sc.nextInt();
int result=1;
int i=1;
while(i<=b){
result=result*a;
i++;
}
System.out.println(result);
}}