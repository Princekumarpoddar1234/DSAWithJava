public class bitManipulation5 {
    public static int clearBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n&bitMask;
    }

    public static int setBit(int n, int i) {
        int bitMask = (1<<i);
        return n|bitMask;
    }

    public static void bitManipulate(int n, int i, int set) {
        if (set==1) {
            System.out.println(setBit(10,2));
        }
        else {
            System.out.println(clearBit(10,2));
        }
    }
    public static void main(String args[]) {
        bitManipulate(10,2,1);
    }
}
