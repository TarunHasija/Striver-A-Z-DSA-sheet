package pattern;
import java.util.*;
public class q13 {
    public static void main(String[] args) {
        System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num =1;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(num+" ");
                num = num+1;
            }
            System.out.println();
        }
    }
}
