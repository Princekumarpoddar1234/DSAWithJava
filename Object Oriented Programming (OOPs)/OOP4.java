public class OOP4 {
    public static void main(String args[]) {
        Dear d = new Dear();
        d.eat();
    }
}


class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Dear extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}