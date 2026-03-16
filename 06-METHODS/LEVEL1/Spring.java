import java.util.Scanner;
class Spring{
public static String season(int m){
if(m>=3 && m<=5){
return "Spring";}
else if(m>=6 && m<=8){
return "Summer";}
else if(m>=9 && m<=11){
return "Autumn";}
else{
return "Winter";}
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter month: ");
int a=sc.nextInt();
String s=season(a);
System.out.println(s);
}
}
