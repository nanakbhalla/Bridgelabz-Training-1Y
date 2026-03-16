import java.util.Scanner;

class NumberSignChecker {  
    public static char checkSign(int a) {          if (a > 0) {
            return 'P';
        } else if (a < 0) {
            return 'N';
        } else {
            return 'Z';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: "); 
        int num = sc.nextInt();  
        char result = checkSign(num);  
        System.out.println(result);
        sc.close();  
    }
}
