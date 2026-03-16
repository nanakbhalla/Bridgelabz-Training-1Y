import java.util.Scanner;
class Natural{
public static int sum(int n){
int s=0;
for(int i=1;i<=n;i++){
s=s+i;}
return s;}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter n: ");
int a=sc.nextInt();
int total=sum(a);
System.out.println(total);
}
}
