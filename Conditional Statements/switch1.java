import java.util.*;
public class switch1 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice from 1 to 3:");
        int choice = sc.nextInt();
        switch (choice){
            case 1:System.out.println("Samosa");
            break;
            case 2:System.out.println("Burger");
            break;
            case 3:System.out.println("Mango Shake");
            break;
            default :System.out.println("We Wake Up");
        }
        sc.close();
    }
}
