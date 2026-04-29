public class OOP1 {
    public static void main(String args[]) {
        info obj1 = new info("Harshit", 20);
        System.out.println("Your name is "+ obj1.name +" and your age is " + obj1.age);
    }
}

class info{
    String name;
    int age;
    info(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
