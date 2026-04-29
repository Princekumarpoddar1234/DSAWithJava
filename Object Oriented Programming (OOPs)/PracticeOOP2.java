class Automobile{
    private String drive(){
        return "Driving vehicle";
    }
}

class Car extends Automobile {
    protected String drive(){
        return "Driving car";
    }
}

public class PracticeOOP2 extends Car {
    @Override
    public final String drive(){
        return "Driving electric car";
    }

    public static void main(String [] wheels) {
        final Car car = new PracticeOOP2();
        System.out.println(car.drive());
    }
}
// public class PracticeOOP2 {
//     public static void main(String[] wheels) {
//         final Car car = new Electriccar();
//         System.out.println(car.drive());
//     }
// }


