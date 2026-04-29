public class Recursion1{
    public static void RecursiveReturn(int n) {
        if (n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        RecursiveReturn(n-1);
    }
    public static void main(String args[]) {
        RecursiveReturn(10);
    }
}