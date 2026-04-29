public class OOP$ {
    public static void main(String args[]) {
        Calculator c = new Calculator();
        c.sum(5,7);
        c.sum(10.5f,14.8f);
        c.sum(5,8,7);
    }
}

class Calculator{
    void sum(int a, int b) {
        System.out.println("Sum="+ (a+b));
    }

    void sum(float a, float b) {
        System.out.println("Sum="+ (a+b));
    }

    void sum(int a, int b, int c) {
        System.out.println("Sum="+ (a+b+c));
    }
}
