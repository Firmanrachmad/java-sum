import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Declare Variables
        int num[];
        int total = 0;
        num = new int [4];
        Scanner sc = new Scanner(System.in);
        
        // Input Numbers
        for (int i=0; i < 4; i++) {
            System.out.print("Input Numbers: ");
            num[i] = sc.nextInt();
        }
        
        // Sum Numbers
        
        for (int i=0; i < 4; i++) {
            total += num[i];
        }
        
        // View Inputted Numbers
        for (int i=0; i < 4; i++) {
            System.out.println(num[i]);
        }
        System.out.print("Total = " + total);
    }
}
