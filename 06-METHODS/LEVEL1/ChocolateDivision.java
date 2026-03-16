import java.util.Scanner;
class ChocolateDivision{
public static int[] findRemainderAndQuotient(int N,int M){
int Q=N/M;
int R=N%M;
return new int[]{Q,R};
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER NO OF CHOCOLATES-");
int N=sc.nextInt();
System.out.println("ENTER NO OF CHILDREN-");
int M=sc.nextInt();
int[] result=findRemainderAndQuotient(N,M);
System.out.println("EACH CHILD GETS-"+result[0]);
System.out.println("REMAINING-"+result[1]);
sc.close();
}
}
