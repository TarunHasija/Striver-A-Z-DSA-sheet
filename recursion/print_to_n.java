package recursion;
import java.util.*;
public class print_to_n {

    static void print(int n){
        if(n<1){
            return;
        }
        else{
            print(n-1);
            System.out.println(n);
        }
        

        //------Stack--------//
        //  print(1)
        //  print(2)
        //  print(3)
        //  print(4)
        //  print(5)


        // for this code when n =0 then its returns ,
        //  after that it will start executing the function 
        //  and start printing the number from 1 to n 

    }
    public static void main(String[] args) {
        System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        print(n);

        

    }   
}
