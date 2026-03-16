import java.util.Scanner;
class Table{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter no");
int a=sc.nextInt();
int arr[]=new int[10];
for(int i=0;i<10;i++){
arr[i]=a*(i+1);}
for(int i=0;i<10;i++){
System.out.println(a + "*" + (i+1) + "=" +arr[i]);}
}}