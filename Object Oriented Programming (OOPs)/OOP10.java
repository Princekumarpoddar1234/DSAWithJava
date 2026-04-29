public class OOP10 {
    public static void main(String args[]) {
        Horse h = new Horse();
        System.out.println("Color of horse is "+h.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal class construtor is called");
    }
}

class Horse extends Animal{
    Horse() {
        super.color = "Brown";
        System.out.println("Horse class constructor is called");
    }
}