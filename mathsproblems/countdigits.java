package mathsproblems;

import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {
        System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        
        while(n>0){
            
            n= n/10;
            count++;
        }
        System.out.println(count);
    }
}
