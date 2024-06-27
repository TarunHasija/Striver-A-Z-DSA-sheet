package pattern;
import java.util.*;
public class q11 {
    public static void main(String[] args) {
        System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                if(j%2==0){

                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }

    }
}
