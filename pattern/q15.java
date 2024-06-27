package pattern;
import java.util.*;

public class q15 {
    public static void main(String[] args) {
        System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A'+(n-1-i); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
