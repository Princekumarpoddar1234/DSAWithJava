public class bitManipulation1 {
    public static void oddOrEven(int number) {
        int bitMask = 1;
        if ((number & bitMask)==0){
            System.out.println("Number is Even");
        }
        //even
        else{
            System.out.println("Number  is Odd");
        }
        //odd
    }

    public static void main(String args[]) {
        oddOrEven(5);
        oddOrEven(10);
        oddOrEven(99);
    }
}
