import java.util.Scanner;
public class smartwarehouse {
    //----------methodtofillinventory--------------
    public static int[][] fillinventory(int[][] stock) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.println("enter the stock for categories " + i + " item " + j + ": ");
                stock[i][j] = sc.nextInt();
                if (stock[i][j] < 0) {
                    stock[i][j] = 0;
                }
            }
        }
        sc.close();
        return stock;
    }
    //==========method==to==check==Restock=====
    public static String checkRestock(int itemstock) {
        if (itemstock > 10) {
            return "healthy";  
        } else if (itemstock >= 5 && itemstock <= 10) {
            return "Warning"; 
        } else if (itemstock >= 1 && itemstock <= 4) {
            return "Critical";
        } else {
            return "out of stock";
        }
    }
    //=-=-==-==-=-=method-=-=---=calculate=-=-=-total-=-=-stock=-=-
    public static int calculatetotalstock(int[][] stock) {
        int total = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 5; j++) {
                total += stock[i][j];
            }
        }
        return total;  
    }
    public static void main(String[] args) {
        int[][] stock = new int[4][6];
        fillinventory(stock);
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.println(stock[i][j] + " " + checkRestock(stock[i][j]));
            }
        }
        int total = calculatetotalstock(stock);
        System.out.println("total stock " + total);
    }
}

