import java.util.Scanner;
public class MultipleValue {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter no");
            arr[i]=sc.nextInt();
            if (arr[i]<=0){
                break;

            }

        }
for(int i=0;i<10;i++){
System.out.println(arr[i]);}

    }
}
