import java.util.Scanner;
class factorsw{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter no");
int a=sc.nextInt();
int i=1;
System.out.println("factors are");
while(i<=a){if(a%i==0){System.out.println(i);}
i++;}}}