import java.util.Scanner;

class FACTORS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = new int[n];
        int k = 0;

        for(int i=1;i<=n;i++)
            if(n%i==0) 
				f[k++]=i;

        for(int i=0;i<k;i++)
            System.out.print(f[i]+" ");
    }
}
