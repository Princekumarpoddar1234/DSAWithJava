import java.util.*;
public class array1 {               //array imput marks 
    public static void main(String args []) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of enlish, maths,physics respectively");
        marks[0]= sc.nextInt(); //English
        marks[1]= sc.nextInt(); //Maths
        marks[2]= sc.nextInt(); //Physics
        System.out.println("English marks="+marks[0]);
        System.out.println("Maths marks="+marks[1]);
        System.out.println("Physics marks="+marks[2]);
        sc.close();
    }
}
