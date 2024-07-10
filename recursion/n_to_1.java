package recursion;

public class n_to_1 {
    static void print(int i,int n ){
        if(n>=i){
            System.out.println(n);
            print(1, n-1);
        }
        return;
    }

    public static void main(String[] args) {
        int n = 10;

        print(1,n);
    }
}
