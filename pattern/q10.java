package pattern;
import java.util.*;
public class q10 {
    
    public static void main(String[] args) {
        
        System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i <= 2*n-1; i++) {
         int stars = i;
         if(i>n) {
            stars = 2*n-i;   
        }

        for (int j = 1; j <= stars; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
      
        
    }
}
