public class Recursion12 {
    public static void main(String args[]) {
        System.out.println(tilingProblem(4));
    }

    public static int tilingProblem(int n) {
        if (n==0 || n==1){
            return 1;
        }

        //vertical tiling
        int f_n_minus_1 = tilingProblem(n-1);

        //horizontal tiling
        int f_n_minus_2 = tilingProblem(n-2);

        int totalWays = f_n_minus_1 + f_n_minus_2;
        return totalWays;
    }
}
