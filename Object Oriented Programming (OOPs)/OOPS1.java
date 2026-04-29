public class OOPS1{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Red");
        p1.setTip(3);
        System.out.println("Output for pen1:");
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

        Pen p2 = new Pen();
        p2.setColor("Pink");
        p2.setTip(9);
        System.out.println("Output for pen2:");
        System.out.println(p2.getColor());
        System.out.println(p2.getTip());
    }
}
class Pen{
    private String color;
    private int tip;
    void setColor(String newColor){
        this.color = newColor;
    }
    String getColor(){
        return this.color;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
    int getTip(){
        return tip;
    }
}