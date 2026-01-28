import java.util.Scanner;
class multiples{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter no");
int a=sc.nextInt();
System.out.println("multiples of" + a + "under 100 are");
for(int i=0;i<=100;i++){
if(i%a==0){
System.out.println(i);
}
}
}}