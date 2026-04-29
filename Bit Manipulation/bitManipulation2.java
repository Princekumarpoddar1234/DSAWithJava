public class bitManipulation2 {
    public static void ithIndex(int n, int i) {
        int bitMask=i<<i;
        if ((n & bitMask)==0) {
            System.out.println("0");
        }
        else {
            System.out.println("1");
        }
    }

    public static void main(String args[]) {
        ithIndex(15,3);
    }
}
