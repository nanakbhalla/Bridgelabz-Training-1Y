import java.util.Scanner;
class Convui
{
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter kilometer");
		int km=sc.nextInt();
		double miles=km*0.621371;
		
		System.out.println("Average :- " +miles);
		
		}
}