import java.util.Scanner;

public class profit {
    public static double calculateInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100.0;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter Rate (%): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter Time (years): ");
        double time = scanner.nextDouble();
        
        double interest = calculateInterest(principal, rate, time);
        
        System.out.printf("Simple Interest: %.2f%n", interest);
        
        scanner.close();
    }
}
