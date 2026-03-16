import java.util.Scanner;
class Largest{
public static int largest(int a,int b,int c){
if(a>=b && a>=c){
return a;}
else if(b>=a && b>=c){
return b;}
else{
return c;}
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter first no: ");
int x=sc.nextInt();
System.out.print("Enter second no: ");
int y=sc.nextInt();
System.out.print("Enter third no: ");
int z=sc.nextInt();
int max=largest(x,y,z);
System.out.println(max);
}
}
