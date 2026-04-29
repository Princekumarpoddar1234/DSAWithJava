import java.util.*;           //using while loop
public class sumof_n {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get sum of first n natural numbers: ");
        int n = sc.nextInt();
        int i = 1, sum = 0;
        while(i<=n)
        {
            sum+=i;
            i++;
        }
        System.out.println("Sum = "+ sum);
        sc.close();
    }
}
