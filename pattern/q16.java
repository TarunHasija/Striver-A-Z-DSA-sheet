package pattern;

import java.util.*;

public class q16 {
    public static void main(String[] args) {
        System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();s.close();
        for (int i = 0; i < n; i++) {
            for (char j = 0; j <=i ; j++) {
                System.out.print((char)('A'+i));
            }
            System.out.println();
        }
    }
}
