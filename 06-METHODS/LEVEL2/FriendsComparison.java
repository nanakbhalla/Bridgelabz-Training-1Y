import java.util.Scanner;

public class FriendsComparison {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Amar age: ");
        int amarAge = sc.nextInt();
        System.out.print("Amar height: ");
        int amarHeight = sc.nextInt();
        
        System.out.print("Akbar age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Akbar height: ");
        int akbarHeight = sc.nextInt();
        
        System.out.print("Anthony age: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Anthony height: ");
        int anthonyHeight = sc.nextInt();
        
        // Find youngest
        String young = "Amar";
        if(akbarAge < amarAge) {
            young = "Akbar";
        }
        if(anthonyAge < akbarAge && anthonyAge < amarAge) {
            young = "Anthony";
        }
        
        // Find tallest
        String tall = "Amar";
        if(akbarHeight > amarHeight) {
            tall = "Akbar";
        }
        if(anthonyHeight > akbarHeight && anthonyHeight > amarHeight) {
            tall = "Anthony";
        }
        
        System.out.println("Youngest: " + young);
        System.out.println("Tallest: " + tall);
        
        sc.close();
    }
}
