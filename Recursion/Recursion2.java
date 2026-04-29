public class Recursion2 {
    public static void RecursiveFunction(int n){
        if (n==1){
            System.out.print(1+" ");
            return;
        }
        RecursiveFunction(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]) {
        RecursiveFunction(7);
    }
}
