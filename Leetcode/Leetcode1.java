package Leetcode;
public class Leetcode1 {
    public static boolean isPowerOfFour(int n) {
        if (n<=0 || (n & (n-1))!=0)
        {
            return false;
        }
        return (n & 0x55555555)!=0;
    }
    public static void main(String args[]) {
        int x=256;
        boolean result = isPowerOfFour(x);
        System.out.print(result);
    }
}