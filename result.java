import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for student " + i + ": ");
            int marks = input.nextInt();
            
            if (marks >= 50) {
                System.out.println("Student " + i + " Passed");
            } else {
                System.out.println("Student " + i + " Failed");
            }
        }
        
        input.close();
    }
}
