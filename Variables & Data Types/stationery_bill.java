import java.util.*;
public class stationery_bill {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of pencil,pen and eraser respectively:");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float cost = pencil + pen + eraser;
        System.out.println("Total cost :"+cost);
        sc.close();
    }
}
