import java.util.Scanner;
class factormaxf{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter no");
int a=sc.nextInt();
int max=0;
for(int i=1;i<a;i++){if(a%i==0){max=i;}}
System.out.println(max);}}