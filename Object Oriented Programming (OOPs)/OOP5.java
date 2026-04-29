public class OOP5 {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken ch = new Chicken();
        ch.eat();
        ch.walk();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("Eat");
    }
    abstract void walk();
}


class Horse extends Animal{
    void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Chicken walks on 2 legs");
    }
}