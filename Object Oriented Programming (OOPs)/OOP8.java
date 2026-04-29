public class OOP8 {
    public static void main(String asrgs[]) {
        Bear b = new Bear();
        b.VegEat();
        b.NonVegEat();
    }
}

interface Herbivore{
    void VegEat();
}

interface Carnivore{
    void NonVegEat();
}

class Bear implements Herbivore, Carnivore{
    public void VegEat(){
        System.out.println("It eats vegitarian");
    }

    public void NonVegEat() {
        System.out.println("It eats Non-vegitarian food");
    }
}
