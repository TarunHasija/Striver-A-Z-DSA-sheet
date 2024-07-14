package mathsproblems;

import java.util.Scanner;

public class gcd {

    static int min(int n1,int n2){
        return (n1>n2)? n2:n1;

    }
    public static void main(String[] args) {
         System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();s.close();
        n1 = Math.abs(n1);
        int n2 = s.nextInt();
        n2 = Math.abs(n2);
        int gcd =0;


        for (int i = 1; i <=min(n1,n2); i++) {
            if(n1%i==0&&n2%i==0){

                // ?? method 1
                gcd =i;

                // ?? method 2
                // for (int i = min(n1,n2); i >=1; i--)
                // System.out.println(i);
                // break;
            }

        }
        System.out.println(gcd);
        
    }
}
