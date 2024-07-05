package recursion;

public class print_n_times {

    static void f(){
        System.out.println("Hello");
        f();
    }
    public static void main(String[] args) {
        f();
    }
}
