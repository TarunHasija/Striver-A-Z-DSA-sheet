package pattern;
import java.util.*;

public class q17 {
    public static void main(String[] args) {


        System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 1; j < n-i; j++) {
             System.out.print(' ');   
            }
            for (char j = 'A'; j <= 'A'+i; j++) {
                System.out.print(j);
            }
            for (char j = (char)('A'+i-1); j >='A'; j--) {
                System.out.print((char)(j));
            }
            System.out.println();
        }

    }
}
