import java.util.Scanner;

public class maximum {
    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }
    public static double findMax(double a, double b) {
        return Math.max(a, b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Max of " + a + " and " + b + " is: " + findMax(a, b));
        
        System.out.print("Enter two doubles: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Max of " + d1 + " and " + d2 + " is: " + findMax(d1, d2));
        
        sc.close();
    }
}
