package mathsproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class print_all_divisor {
    public static void main(String[] args) {
         System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();


        // * using ArrayList for adding value of divisor in the array
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <=n; i++) {
            if (n%i==0) {
                arrayList.add(i);
            }
        }
        System.out.println(arrayList);
    }
}
