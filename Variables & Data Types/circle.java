import java.util.*;
public class circle {
    public static void main(String args[]) {
        System.out.println("Enter radius of circle:");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        float area = 3.14f * radius * radius;
        System.out.println("Area of circle is: "+area);
        sc.close();
    }
}

