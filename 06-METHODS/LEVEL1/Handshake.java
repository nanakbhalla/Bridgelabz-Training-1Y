import java.util.Scanner;
class Interest{
public static int Handshake(int n){
return (n*(n-1))/2;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter no of Students: ");
        int a = sc.nextInt();
int h=Handshake(a);
System.out.println(h);
}
}