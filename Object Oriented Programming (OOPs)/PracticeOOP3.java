public class PracticeOOP3 extends Car {
    {
        System.out.print("4");
    }

    public PracticeOOP3(){
        super("blue");
        System.out.print("5");
    }

    public static void main(String[] grears) {
        new PracticeOOP3();
    }
}

abstract class Car{
    static {
        System.out.print("1");
    }

    public Car(String name) {
        super();
        System.out.print("2");
    }

    {
        System.out.print("3");
    }
}