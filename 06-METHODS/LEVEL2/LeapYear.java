import java.util.Scanner;
class LeapYear{
public static boolean isLeapYear(int year){
if(year<1582) return false;
return (year%4==0 && year%100!=0) || (year%400==0);
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER YEAR-");
int y=sc.nextInt();
if(isLeapYear(y)) System.out.println("LEAP YEAR!");
else System.out.println("NOT LEAP YEAR!");
sc.close();
}
}
