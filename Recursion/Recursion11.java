public class Recursion11 {
    public static void main(String args[]) {
        System.out.println(optimizedPower(2,10));
    }

    public static int optimizedPower(int x, int n){
        if (n==0){
            return 1;
        }
        int half = optimizedPower(x,n/2);
        int halfPower = half*half;

        if (n%2!=0){
            halfPower = x*halfPower;
        }

        return halfPower;
    }
}
