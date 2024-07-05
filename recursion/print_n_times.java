package recursion;

public class print_n_times {
    
    public static void print(int n){
        printNos(1,n);
    }

    static void printNos(int count, int n){
        if(count > n){
            return;
        }
        else{
            System.out.println(count+" ");
            printNos(count+1, n);
        }
    }
    public static void main(String[] args) {
        print(10);
    }
}
