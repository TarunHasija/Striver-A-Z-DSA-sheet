package recursion;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        System.out.println("Enter value of n ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str = str.toLowerCase();
        s.close();
    
        if (isPalindrome(str)) {
            System.out.println("Is Palindrome");
        }
        else{

            System.out.println("Not a palindrome");
        }

        
    
    
    
    
    
    }

         static boolean isPalindrome(String str){

            int left = 0;
            int right = str.length()-1;
            
            while(left<right){
                if (str.charAt(left)!=str.charAt(right)) {
                    return false;
                }
                else{
                    left++;
                    right--;
                }
            }
            return true;
            
        
    }
       
}
