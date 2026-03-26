import java.util.Scanner;
public class overloading {
    
    public static double area(double radius) {
        return 3.14* radius * radius;
    }
    
    public static double area(double length, double width) {
        return length * width;
    }
    public static double areasquare(double side) {
        return side * side;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Geometric Area Calculator  ===");
        
        System.out.print("Enter radius for Circle: ");
        double radius = sc.nextDouble();
        System.out.printf("Circle area: %.2f%n", area(radius));
        
        System.out.print("Enter length for Rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width for Rectangle: ");
        double width = sc.nextDouble();
        System.out.printf("Rectangle area: %.2f%n", area(length, width));
        System.out.print("Enter side for Square: ");
        double side = sc.nextDouble();
        System.out.printf("Square area: %.2f%n", area(side));
        
        sc.close();
        System.out.println("Calculations complete.");
    }
}

