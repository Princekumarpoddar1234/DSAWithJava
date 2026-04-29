public class bitManipulation8 {
    public static boolean checkPower(int n) {
        if ((n & (n-1))==0) {
            return true;
        }

        else {
            return false;
        }
    }
    public static void main(String args[]) {
        System.out.println(checkPower(10));
    }
}
