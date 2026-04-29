public class Recursion5 {
    public static int fibo(int n){
        if (n==0 || n==1){
            return n;
        }
        int fibN_1 = fibo(n-1);
        int fibN_2 = fibo(n-2);
        int FibN = fibN_1 + fibN_2;
        return FibN;
    }

    public static void main(String args[]) {
        System.out.print(fibo(5));
    }
}
