import java.util.Scanner;
class Integer{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
for(int i=0;i<5;i++){
System.out.println("Enter number");
arr[i]=sc.nextInt();
}
for(int i=0;i<5;i++){
if(arr[i]>0){
System.out.println("the no" + arr[i] + "is positive");}
else if(arr[i]<0){System.out.println("the no" + arr[i] + "is negative");}
else{System.out.println("the no" + arr[i] + "is zero");}
}
}}
