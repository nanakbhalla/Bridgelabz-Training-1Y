import java.util.Scanner;
class TRANSPOSE
{
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		int arr1[][]={{1,2,3} ,{4,5,6} ,{7,8,9}};
		int arr2[][]={{9,8,7} ,{6,5,4} ,{3,2,1}};		
		int row=arr1.length;
		int col=arr1[0].length;
		for(int i=0 ;i<row;i++)
		{
		 for(int j=0 ;j<col;j++)
		 {
			 System.out.print(arr1[j][i]+" ");
		 }
			
		    System.out.println();
		
	}
	}
}
		
	
		