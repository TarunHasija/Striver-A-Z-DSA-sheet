package pattern;

import java.util.*;

public class q9 {

    public static void main(String[] args) {
        System.out.println("Enter value of n ");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    s.close();
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n-1-i ; j++) {
            System.out.print(" ");
        }

        for (int j = 0; j < 2*i+1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j <2*n - 1 - (2*i) ; j++) {
            System.out.print("*");
        }
        System.out.println();
    }


    }
    
    
    
}
