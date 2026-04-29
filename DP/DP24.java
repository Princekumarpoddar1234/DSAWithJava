import java.util.*;
public class DP24 {
    static int lip(int[][] dp, int[][] mat, int n, int m, int x, int y) {
        if (dp[x][y] != -1) return dp[x][y];

        int result = 1; // Minimum path is 1 (the cell itself)

        // Move Down
        if (x + 1 < n && mat[x][y] < mat[x + 1][y]) {
            result = Math.max(result, 1 + lip(dp, mat, n, m, x + 1, y));
        }

        // Move Right
        if (y + 1 < m && mat[x][y] < mat[x][y + 1]) {
            result = Math.max(result, 1 + lip(dp, mat, n, m, x, y + 1));
        }

        return dp[x][y] = result;
    }

    static int wrapper(int[][] mat, int n, int m) {
        int[][] dp = new int[n][m];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return lip(dp, mat, n, m, 0, 0);
    }

    public static void main(String[] args) {
        int[][] mat = {
            { 1, 2, 3, 4 },
            { 2, 2, 3, 4 },
            { 3, 2, 3, 4 },
            { 4, 5, 6, 7 },
        };
        int n = 4, m = 4;
        System.out.println("Longest Increasing Path Length from (0,0): " + wrapper(mat, n, m));
    }
}
