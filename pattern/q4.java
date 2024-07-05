package pattern;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
