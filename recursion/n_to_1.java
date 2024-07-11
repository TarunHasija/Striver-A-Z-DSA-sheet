package recursion;
import java.util.*;
public class n_to_1 {
    static void print(int n ){
        if(n>=1){
            System.out.println(n);
            print(n-1);
        }
        return;
    }

    public static void main(String[] args) {
        System.out.println("Enter value of n ");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            s.close();

        print(n);
    }
}
