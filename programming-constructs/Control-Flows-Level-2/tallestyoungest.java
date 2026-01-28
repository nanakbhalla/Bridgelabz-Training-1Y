import java.util.Scanner;
class tallestyoungest{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter height of Amar");
double a=sc.nextDouble();
System.out.println("Enter age of Amar");
int d=sc.nextInt();
System.out.println("Enter height of Akbar");
double b=sc.nextDouble();
System.out.println("Enter age of Akbar");
int e=sc.nextInt();
System.out.println("Enter height of Anthony");
double c=sc.nextDouble();
System.out.println("Enter age of Anthony");
int f=sc.nextInt();
if(a>=b){
if(a>=c){System.out.println("Amar is tallest");}
else{System.out.println("Anthony is tallest");}}
else{
if(b>=c){System.out.println("Akbar is tallest");}
else{System.out.println("Anthony is tallest");}}
if(d<=e){
if(d<=f){System.out.println("Amar is youngest");}
else{System.out.println("Anthony is youngest");}}
else{
if(e<=f){System.out.println("Akbar is youngest");}
else{System.out.println("Anthony is youngest");}}

}}