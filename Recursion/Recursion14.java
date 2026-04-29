public class Recursion14 {
    public static void main(String args[]) {
        System.out.println(friendsPairing(2));
    }

    public static int friendsPairing(int n) {
        if (n==1 || n==2){
            return n;
        }
        // single
        // int f_n_minus_1 = friendsPairing(n-1);

        // pair
        // int f_n_minus_2 = friendsPairing(n-2);
        // int pairWays = (n-1) * f_n_minus_2;

        // int totalWays = f_n_minus_1 + pairWays;
        // return totalWays;

        return friendsPairing(n-1) + (n-1)* friendsPairing(n-2);
    }
}
