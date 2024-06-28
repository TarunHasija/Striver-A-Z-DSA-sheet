package pattern;

import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < 2*n-1 ; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
