package mathsproblems;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();s.close();
        n= Math.abs(n);
        int digit;
        int temp = n;
        int sum = 0;
        while (n>0) {
            digit = n%10;
            sum = sum + (digit*digit*digit);
            n = n/10;
        }
        System.out.println(sum);
        if (temp==sum) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
