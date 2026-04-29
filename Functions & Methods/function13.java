import java.util.*;                            //decimal to binary conversion using function
public class function13 {
    public static void DecToBin(int n) {
        int pow=0,i,rem,bin=0;
        i=n;
        while(i!=0) {
            rem = i%2;
            bin+=rem*(int)Math.pow(10,pow);
            i/=2;
            pow++;
        }
        System.out.println("Binary value of given number = "+bin);
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number to convert it into binary:");
        int n = sc.nextInt();
        DecToBin(n);
        sc.close();
    }
}
