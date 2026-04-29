public class function8 {              //functionn overloading using differen data types
    public static int sum(int a, int b) {
        return a+b;
    }
    public static float sum(float a, float b) {
        return a+b;
    }
    public static void main(String args []) {
        System.out.println("sum of two integer numbers = "+sum(4,8));
        System.out.println("sum of two float numbers = "+sum(4f,2f));
    }
}
