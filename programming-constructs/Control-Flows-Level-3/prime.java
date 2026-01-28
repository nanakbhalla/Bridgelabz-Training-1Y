import java.util.Scanner;
class prime{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter no");
int a=sc.nextInt();
int count=0;
for(int i=1;i<=a;i++){if(a%i==0){count++;}}
if(count==2){System.out.println("Prime no");}
else{System.out.println("not a Prime no");}

}}