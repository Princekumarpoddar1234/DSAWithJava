public class operator {
    public static void main(String args []) {
        System.out.println("=== 1. Arithmetic Operators ===");
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        System.out.println("\n=== 2. Unary Operators ===");
        int x = 5;
        System.out.println("x = " + x);
        System.out.println("++x = " + (++x)); // Pre-increment
        System.out.println("x++ = " + (x++)); // Post-increment
        System.out.println("--x = " + (--x)); // Pre-decrement
        System.out.println("x-- = " + (x--)); // Post-decrement
        System.out.println("Final x = " + x);
        System.out.println("-x = " + (-x));    // Unary minus
        System.out.println("+x = " + (+x));    // Unary plus

        System.out.println("\n=== 3. Relational (Comparison) Operators ===");
        System.out.println("a == b : " + (a == b));  // Equal to
        System.out.println("a != b : " + (a != b));  // Not equal to
        System.out.println("a > b  : " + (a > b));   // Greater than
        System.out.println("a < b  : " + (a < b));   // Less than
        System.out.println("a >= b : " + (a >= b));  // Greater than or equal to
        System.out.println("a <= b : " + (a <= b));  // Less than or equal to

        System.out.println("\n=== 4. Logical Operators ===");
        boolean p = true, q = false;
        System.out.println("p && q : " + (p && q)); // Logical AND
        System.out.println("p || q : " + (p || q)); // Logical OR
        System.out.println("!p     : " + (!p));     // Logical NOT

        System.out.println("\n=== 5. Bitwise Operators ===");
        int m = 5, n = 3; // 0101 & 0011
        System.out.println("m & n  : " + (m & n));  // Bitwise AND
        System.out.println("m | n  : " + (m | n));  // Bitwise OR
        System.out.println("m ^ n  : " + (m ^ n));  // Bitwise XOR
        System.out.println("~m     : " + (~m));     // Bitwise NOT
        System.out.println("m << 1 : " + (m << 1)); // Left shift
        System.out.println("m >> 1 : " + (m >> 1)); // Right shift

        System.out.println("\n=== 6. Assignment Operators ===");
        int z = 10;
        System.out.println("z = " + z);
        z += 5;
        System.out.println("z += 5 -> " + z);
        z -= 3;
        System.out.println("z -= 3 -> " + z);
        z *= 2;
        System.out.println("z *= 2 -> " + z);
        z /= 4;
        System.out.println("z /= 4 -> " + z);
        z %= 3;
        System.out.println("z %= 3 -> " + z);

        System.out.println("\n=== 7. Ternary Operator ===");
        int age = 20;
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible";
        System.out.println("Age = " + age + " -> " + eligibility);

        System.out.println("\n=== 8. instanceof Operator ===");
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));
        }
}