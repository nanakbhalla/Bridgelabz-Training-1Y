import java.util.Scanner;
class factormax{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter no");
int a=sc.nextInt();
int i=1;
int max=0;
while(i<a){if(a%i==0){max=i;}
i++;}
System.out.println(max);}}