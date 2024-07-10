package recursion;
import java.util.*;
public class print_to_n {

    static void print(int n){
        if(n<1){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        print(n);

        

    }   
}
