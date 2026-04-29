import java.util.*;
public class ternarymarks {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percentage of marks in integer");
        int marks = sc.nextInt();
        String result = (marks>=0 && marks <=100)? ((marks >=33)? "PASS" : "FAIL") : "Invalid";
        System.out.println("Result is "+ result);
        sc.close();
    }
} 