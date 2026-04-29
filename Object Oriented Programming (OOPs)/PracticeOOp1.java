import java.util.Scanner;

public class PracticeOOp1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Real part of number 1: ");
        int r1 = sc.nextInt();
        System.out.println("Enter Imaginary part of number 1: ");
        int i1 = sc.nextInt();
        System.out.println("Enter Real part of number 2: ");
        int r2 = sc.nextInt();
        System.out.println("Enter Imaginary part of number 2: ");
        int i2 = sc.nextInt();

        Complex c = new Complex();
        c.sum(r1, i1, r2, i2);
        c.difference(r1, i1, r2, i2);
        c.product(r1, i1, r2, i2);
        sc.close();
    }
}
class Complex{
    void sum(int r1, int i1, int r2, int i2){
        int rSum = r1+r2;
        int iSum = i1+i2;
        if (iSum>=0) {
            System.out.println("Addition: "+ rSum+"+"+iSum+"i");
        }
        else{
            System.out.println("Addition: "+ rSum+" "+iSum+"i");
        }
    }

    void difference(int r1, int i1, int r2, int i2) {
        int rDiff = r1-r2;
        int iDiff = i1-i2;
        if (iDiff>=0) {
            System.out.println("Difference: "+ rDiff+"+"+iDiff+"i");
        }
        else{
            System.out.println("Difference: "+ rDiff+" "+iDiff+"i");
        }
    }

    void product(int r1, int i1, int r2, int i2) {
        int rPro = r1*r2 - i1*i2;
        int iPro = r1*i2 +r2*i1;
        if (iPro>=0) {
            System.out.println("Product: "+ rPro+"+"+iPro+"i");
        }
        else{
            System.out.println("Product: "+ rPro+""+iPro+"i");
        }
    }
}