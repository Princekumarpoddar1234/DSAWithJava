public class bitManipulation4 {
    public static int clearBit(int n, int i) {
        int bitMask = ~(i<<i);
        return n&bitMask; 
    }
    public static void main(String args[]) {
        System.out.println(clearBit(10,1));
    }
}
