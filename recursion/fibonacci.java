package recursion;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter value of n ");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            s.close();
            // System.out.print("0 1 ");
            if(n==0){
                System.out.println("0");
            }
            else{
                int t1=0,t2=1;
                for (int i = 1; i <= n; i++) {
                    
                    System.out.print(t1+" ");
                    int t3 = t1+t2;
                    t1=t2;
                    t2=t3;
                }

            }


    }
}
