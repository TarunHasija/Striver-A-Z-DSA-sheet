package pattern;
import java.util.*;
public class q7 {
  public static void main(String[] args) {
    System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
  }  
}
