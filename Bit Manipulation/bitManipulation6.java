public class bitManipulation6 {
    public static int bitclear(int n, int i) {
        int bitMask = ((~0)<<i);
        return n & bitMask;
    }

    public static void main(String args[]) {
        System.out.println(bitclear(10,2));
    }
}
