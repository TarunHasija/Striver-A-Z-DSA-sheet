package recursion;

public class print_name_n_times {
   static void print(int i, int n){
        if(i>n){
            return;
        }
        System.out.println("Tarun");
        print(i+1, n);
    }
    public static void main(String[] args) {
        print(1,10);
    }
}
