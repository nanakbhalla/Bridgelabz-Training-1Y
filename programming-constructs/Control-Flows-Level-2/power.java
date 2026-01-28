import java.util.Scanner;
class power{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter no");
int a=sc.nextInt();
System.out.println("Enter power");
int b=sc.nextInt();
int result=1;
for(int i=1;i<=b;i++){
result=result*a;
}
System.out.println(result);
}}