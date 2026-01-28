import java.util.Scanner;
class multiplesw{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter no");
int a=sc.nextInt();
int i=1;
System.out.println("multiples of" + a + "under 100 are");
while(i<=100){
if(i%a==0){
System.out.println(i);
}
i++;
}
}}