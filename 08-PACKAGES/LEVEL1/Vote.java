import java.util.Scanner;
class Vote{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int arr[]=new int[10];
for(int i=0;i<10;i++){
System.out.println("Enter AGE");
arr[i]=sc.nextInt();
}
for(int i=0;i<10;i++){
if(arr[i]>=18){
System.out.println("STUDENT WITH AGE" + arr[i] + "CAN vote");}
else{System.out.println("STUDENT WITH AGE" + arr[i] + "CANnot vote");}
}


}}
