import java.util.Scanner;
class evenodd{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter no");
int a=sc.nextInt();
for(int i=1;i<=a;i++){
if(i%2==0){System.out.println("even"+i);}
else{System.out.println("odd"+i);}}
}}