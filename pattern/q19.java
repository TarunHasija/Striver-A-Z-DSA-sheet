package pattern;

import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < 2*n; i++) {
            for (int j = n; j >i ; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < 2*(i); j++) {
                System.out.print(" ");
            }
            for (int j = n; j>i; j--) {
                System.out.print("*");
            }
            if(i>n){
                for (int j = 0; j <; j++) {
                    
                }
            }

            System.out.println();

            
        }
    }
}
