package mathsproblems;

import java.util.Scanner;

public class reverseDigit {
    public static void main(String[] args) {
        System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int revnum =0;
        while (n>0) {
            int num = n%10;

             revnum = (revnum*10)+num;

            n= n/10;
        }
        System.out.println(revnum);
    }
}
