import java.util.Scanner;
class abundant{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter no");
int a=sc.nextInt();
int sum=0;
for(int i=1;i<a;i++){if(a%i==0){sum=sum+i;}
}
if(sum>a){System.out.println("Abundant no");
}
else{System.out.println("not Abundant no");}
}}