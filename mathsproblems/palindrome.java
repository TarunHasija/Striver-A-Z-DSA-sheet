package mathsproblems;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();s.close();
        int revnum = 0;
        int temp = n;
        while(n>0){
            int num = n%10;
            revnum = (revnum*10)+num;
            n=n/10;
        }
        System.out.println(revnum);
        if(revnum == temp ){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
