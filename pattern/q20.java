package pattern;

import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // for (int i = 0; i <= 2*n-1; i++) {
        // int stars=i;
        // if(i>n){
        // stars=2*n-i;
        // }
        // for (int j = 1; j <=stars; j++) {
        // System.out.print(i);

        // System.out.print('*'+" ");

        // }
        // System.out.println();
        // }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++) {
            for (int j = n; j > i; j--) {

                System.out.print('*');
            }

            for (int j = 0; j < 2 * (i); j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {

                System.out.print('*');
            }

            System.out.println();
        }

    }

}
