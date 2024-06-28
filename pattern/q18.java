package pattern;
import java.util.*;
public class q18 {
    public static void main(String[] args) {
        System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (char j = (char)('A'+n-1-i); j <='A'+n-1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
