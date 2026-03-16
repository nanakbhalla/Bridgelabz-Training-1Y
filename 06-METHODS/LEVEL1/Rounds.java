import java.util.Scanner;
class Rounds{
public static int NoOfRound(int s1,int s2,int s3){
return 5000/(s1+s2+s3);
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter first side in m: ");
        int a = sc.nextInt();

System.out.print("Enter second side in m: ");
        int b = sc.nextInt();


System.out.print("Enter third side in m: ");
        int c = sc.nextInt();

int r=NoOfRound(a,b,c);
System.out.println(r);
}
}