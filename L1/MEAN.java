import java.util.Scanner;
class MEAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] m = new double[11];
        double sum = 0;

        for(int i=0;i<11;i++){
             m[i] = sc.nextDouble();
            sum = sum + m[i];
        }

        System.out.println("Mean = " + (sum/11));
    }
}
