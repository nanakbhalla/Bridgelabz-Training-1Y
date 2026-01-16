import java.util.Scanner;
class Profit
{
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter cost price");
		int a=sc.nextInt();
		System.out.println("enter selling price");
		int b=sc.nextInt();
		int profit=b-a;
		System.out.println("benifit :- " +profit);
		int profitpercentage=+profit*100/a;
		System.out.println("percent :- " +profitpercentage);
		
		
		}
}
