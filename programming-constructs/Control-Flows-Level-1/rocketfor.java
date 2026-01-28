import java.util.Scanner;
class rocketfor{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter countdown");
int a=sc.nextInt();
for(int i=a;i>=1;i--){
System.out.println(a);
a--;}
System.out.println("Rocket launched");

}}