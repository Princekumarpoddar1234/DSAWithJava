public class OOP3 {
    public static void main(String args[]) {
        Fish fi =  new Fish();
        fi.eat();
        fi.fin();
    }
}


class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
}

class Fish extends Animal{
    void fin(){
        System.out.println("Fish have fins");
    }
}