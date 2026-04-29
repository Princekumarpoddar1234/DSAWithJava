import java.util.*;
public class function12 {                              //binary to decimmal conversion using function
    public static void Bintodec(int n) {
        int power=0,r,dec=0,i;
        i=n;
        while(i!=0) {
            r=i%10;
            dec= dec + r * (int)Math.pow(2,power);
            power++;
            i/=10;
        }
        System.out.println("decimal value= "+dec);
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number:");
        int n = sc.nextInt();
        Bintodec(n);
        sc.close();
    }
}
