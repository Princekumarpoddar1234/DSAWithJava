public class OOPpractice2 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print();

        // Vehicle obj1 = new Car();
        // obj1.print1();

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}

class Vehicle{
    void print(){
        System.out.println("Base class is called(Vehicle)");
    }
}

class Car extends Vehicle{
    void print(){
        System.out.println("Derived class is called(Car)");
    }

    // void print1(){
    //     System.out.println("Derived class is called(Car)");
    // }
}

//method of derived class can be only used at the time of overriding of method by the use of reference in creation of objects as shown in above