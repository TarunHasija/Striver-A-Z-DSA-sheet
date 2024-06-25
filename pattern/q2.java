package pattern;

import java.util.Scanner;

public class q2 {
 public static void main(String[] args) {
    System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <=i; j++) {
            System.out.print("*");
        }
        System.out.println();
        
    }
 }   
}
