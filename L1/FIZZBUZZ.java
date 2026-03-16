import java.util.Scanner;
class FIZZBUZZ
{
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		if(num<0){
					System.out.println("Invalid");
					return ;
		}
		String []result=new String[num];
		for(int i=1 ; i<num ; i++)
		{
			if(i%3==0 && i%5==0){
				result[i-1]="FIZZBUZZ";
				System.out.println("FIZZBUZZ");
		
		}
		else if(i%3==0){
			result[i-1]="FIZZ";
			System.out.println("FIZZ");
		}
		else if(i%5==0){
			result[i-1]="BUZZ";
			System.out.println("BUZZ");
		}
		else {
			result[i]=String.valueOf(i);
			System.out.println(i);
			
		
		}
}
	}
}