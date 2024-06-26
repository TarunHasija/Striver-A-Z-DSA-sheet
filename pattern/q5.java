package pattern;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        
        System.out.println("Enter value of n ");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();

            for (int i = 0; i < n; i++) {
                for (int j = n; j < 0; j--) {
                    System.out.print('*');
                }
                System.out.println();
            }
    }
}
