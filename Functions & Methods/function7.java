public class function7 {
    public static int sum(int a, int b) {           //function overloading using number of parameters
        return a+b;
    }
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String args []) {
        System.out.println("sum of two numbers = "+sum(5,4));
        System.out.println("Sum of three number = "+sum(4,5,8));
    }
}
