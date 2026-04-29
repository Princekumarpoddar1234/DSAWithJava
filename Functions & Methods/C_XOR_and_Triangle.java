import java.util.Scanner;
public class C_XOR_and_Triangle {
    // Function to check if a number is a power of 2
    private static boolean isPowerOfTwo(int num) {
        return (num & (num - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt(); // Number of test cases
        
        while (testCases-- > 0) {
            int inputX = scanner.nextInt();
            
            if (isPowerOfTwo(inputX) || isPowerOfTwo(inputX + 1)) {
                System.out.println("-1");
                continue;
            }
            int power = 1;
                while (power * 2 < inputX) {
                    power *= 2;
                }
                 // y has all lower bits set
                System.out.println(--power);
        }
        
        scanner.close();
    }
}