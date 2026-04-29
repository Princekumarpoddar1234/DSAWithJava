public class OOP6 {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);
    }
}

abstract class Animal{
    String color;
    Animal(){
        color="Brown";
        System.out.println("Color="+ color);
    }
    void eat(){
        System.out.println("Eat");
    }

    abstract void walk();
}

class Horse extends Animal{
    void changeColor(){
        color="white";
    }
    void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}
