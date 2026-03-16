import java.util.Scanner;
class NaturalSum{
public static int iterativeSum(int n){
int sum=0;
for(int i=1;i<=n;i++){
sum+=i;
}
return sum;
}

public static int formulaSum(int n){
return n*(n+1)/2;
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER N-");
int n=sc.nextInt();
if(n<1){
System.out.println("NOT NATURAL NUMBER!");
sc.close();
return;
}
int iter=iterativeSum(n);
int form=formulaSum(n);
System.out.println("ITERATIVE SUM-"+iter);
System.out.println("FORMULA SUM-"+form);
if(iter==form) System.out.println("BOTH MATCH!");
else System.out.println("NOT EQUAL!");
sc.close();
}
}
