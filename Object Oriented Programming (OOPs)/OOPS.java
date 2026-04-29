public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTipSize(4);
        System.out.println(p1.color);
        System.out.println(p1.tipSize);
    }
}
class Pen{
    String color;
    int tipSize;

    void setColor(String inputColor){
        color = inputColor;
    }

    void setTipSize(int Size){
        tipSize = Size;
    }
}