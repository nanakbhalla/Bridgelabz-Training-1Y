import java.util.Scanner;
class QuotientAndRemainder{
public static int Q(int a,int b){
return a/b;}
public static int R(int a,int b){
return a%b;}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER NO-");
int c=sc.nextInt();

System.out.println("ENTER DIVISOR-");
int d=sc.nextInt();

int quo=Q(c,d);
int rem=R(c,d);

System.out.println("QUOTIENT IS-"+quo);
System.out.println("REMAINDER IS-"+rem);

}
}