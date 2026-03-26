import java.util.Scanner;

public class monitoringsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int hour = 1; hour <= 4; hour++) {
            System.out.println("Enter temperature for hour " + hour + ":");
            int temperature = scanner.nextInt();
            
            if (temperature > 80) {
                System.out.println("CRITICAL");
            } else if (temperature >= 51 && temperature <= 80) {
                System.out.println("NORMAL");
            } else {
                System.out.println("IDLE");
            }
        }
        
        scanner.close();
        System.out.println("Shift monitoring complete.");
    }
}

