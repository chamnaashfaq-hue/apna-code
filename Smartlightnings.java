
import java.util.Scanner;
public class Smartlightnings {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println ("enter the brightness level");
        int brightness=input.nextInt();
        for(int i=0;i<=5;i++){
        if(brightness>30){
            System.out.println("light ON");
        }
        else if (brightness<=70&&brightness>=30) {
            System.out.println("DiM light");
            
        }
        else{
            System.out.println("light off");
        }
        input.close();
        }    
    }
}
