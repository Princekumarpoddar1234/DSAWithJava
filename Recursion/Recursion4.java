public class Recursion4 {
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        // return n+sum(n-1);   can also be used in place of below three lines of code 
        int sumN_1 = sum(n-1);
        int sumN= n+sumN_1;
        return sumN;
    }
    public static void main(String args[]) {
        System.out.print(sum(10));
    }
}
