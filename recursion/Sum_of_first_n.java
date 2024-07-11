package recursion;

import java.util.*;

public class Sum_of_first_n {

    static int print( int n) {
        if(n==0){
            return 0;
        }
        else{
            return n + print(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();

        System.out.println( print( n));
    }
}
