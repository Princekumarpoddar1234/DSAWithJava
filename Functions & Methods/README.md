# 💥 Functions 
- `C_XOR_and_Triangle`: Bitwise Triangle Problem 💥

## 📁 File: `Functions/C_XOR_and_Triangle.java`

## 🎯 Problem Statement
This code addresses a competitive programming problem that likely involves finding specific properties or constructing numbers related to XOR operations and triangle inequalities. The goal is to determine a specific value (`y`) based on an input `x`, often optimizing for certain bitwise conditions.

## 🤔 Intuition
The problem leverages properties of powers of two and bitwise XOR. The key is understanding that numbers that are powers of two (or one less than a power of two) behave predictably in bitwise operations. By finding the largest power of two just below `x`, we can construct a number that fulfills specific conditions, often related to maximizing XOR or satisfying geometric constraints. This is akin to **Iron Man reverse-engineering alien tech**: breaking down complex properties to find a simple, powerful pattern.

## 🛠️ Functions Explained
This code primarily uses a helper function and the `main` method for its logic.

### `isPowerOfTwo(int num)`
* **Purpose:** Checks if a given integer `num` is a power of 2.
* **Logic:**
    * `return (num & (num - 1)) == 0;`
    * This is a classic bitwise trick. A number `N` is a power of 2 if and only if `N > 0` and `(N & (N - 1))` equals `0`. For example, `8` (binary `1000`) and `7` (`0111`) have no common set bits, so `8 & 7 = 0`. Any non-power-of-two number will have at least two set bits, and `N-1` will retain some overlap.
* **Analogy:** This function is like **Vision's internal diagnostic scan**, instantly confirming if a number has the precise, singular "power-of-two" energy signature.

### `main(String[] args)`
* **Purpose:** Reads test cases and for each `inputX`, determines and prints a calculated value based on bitwise properties.
* **Core Logic:**
    1.  **Initial Checks:**
        * `if (isPowerOfTwo(inputX) || isPowerOfTwo(inputX + 1)) { System.out.println("-1"); continue; }`
        * This early exit condition likely handles edge cases where `inputX` or `inputX + 1` are powers of two. For these specific values, the problem's constraints might not be satisfiable, or a trivial/unsolvable state is reached. This is like **Nick Fury immediately dismissing a mission brief** if the core parameters indicate guaranteed failure.
    2.  **Finding `power`:**
        * `int power = 1; while (power * 2 < inputX) { power *= 2; }`
        * This loop finds the largest power of 2 (`power`) that is strictly less than `inputX`. It repeatedly multiplies `power` by `2` until `power * 2` would exceed or equal `inputX`.
        * Example: If `inputX = 10`, `power` goes `1 -> 2 -> 4`. `power * 2 = 8` (`< 10`), so `power` becomes `8`. Next, `power * 2 = 16` (`not < 10`), so the loop stops.
        * This is like **Doctor Strange precisely narrowing down a magical threshold**, finding the largest power of two that doesn't overstep `inputX`.
    3.  **Outputting `--power`:**
        * `System.out.println(--power);`
        * After the loop, `power` holds the largest power of 2 less than `inputX`. Decrementing `power` by one (`--power`) effectively turns `100...00` (binary) into `011...11`. This number, which has all bits below its most significant bit set to `1`, often plays a role in maximizing XOR values or satisfying certain bitwise conditions in competitive programming problems.
        * Example: If `power` was `8` (`1000`), `--power` becomes `7` (`0111`).
        * This final step is the **precise calculation and deployment** of the derived value, much like **Rocket Raccoon tweaking a gadget for its ultimate, targeted effect.**





# 💥 Functions - `function1`: Basic Function Usage (Hello World & Sum) 💥

## 📁 File: `Functions/function1.java`

## 🎯 Problem Statement
Demonstrate the creation and calling of basic functions (`printHelloWorld` and `sum`) to encapsulate reusable code.

**LeetCode Link:** Not applicable (fundamental programming concept).

## 🤔 Intuition
Functions break down complex tasks into smaller, reusable modules, like **assembling an Avenger team** where each hero has a specific, repeatable power.

## 🛠️ Approach
* Define a `printHelloWorld` function to print a greeting.
* Define a `sum` function to take two integers and print their sum.
* In `main`, call `printHelloWorld`, get user input, then call `sum` with inputs.

## 🚀 Complexity Analysis
* **Time:** `O(1)` - Constant time operations.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
`printHelloWorld()` outputs a fixed message. `sum(int num1, int num2)` calculates and prints the sum of its arguments. The `main` method orchestrates these calls, showing modularity.





# 💥 Functions - `function2`: Sum of Two Numbers (Returning Value) 💥

## 📁 File: `Functions/function2.java`

## 🎯 Problem Statement
Calculate the sum of two user-provided numbers using a function that returns the result.

**LeetCode Link:** Not applicable (fundamental programming concept).

## 🤔 Intuition
Functions can process inputs and explicitly `return` a value, making them versatile tools. This allows the calling code to use the result, much like **Jarvis computing a trajectory and providing the precise coordinates to Iron Man**.

## 🛠️ Approach
* Define a `sum` function that takes two integers and `returns` their sum.
* In `main`, get user input, call `sum`, store the returned value, and print it.

## 🚀 Complexity Analysis
* **Time:** `O(1)`
* **Space:** `O(1)`

### Code Explanation:
The `sum` function performs addition and `return`s the integer result. `main` captures this `result` and prints it, demonstrating how returned values are handled.





# 💥 Functions - `function3`: Swapping (Call by Value) 💥

## 📁 File: `Functions/function3.java`

## 🎯 Problem Statement
Illustrate "call by value" in Java functions by attempting to swap two integer variables.

**LeetCode Link:** Not applicable (fundamental language concept).

## 🤔 Intuition
In Java, primitive types are passed by **call by value**. This means the function receives a *copy* of the variable's value, not the variable itself. Any changes to the copies inside the function don't affect the original variables outside, like **Hulk changing his shirt; the original shirt remains unchanged elsewhere**.

## 🛠️ Approach
* Define a `swap` function taking two integers.
* Inside `swap`, use a temporary variable to exchange the values of its *parameters*.
* In `main`, get user inputs, call `swap`, then print the original variables to show no change.

## 🚀 Complexity Analysis
* **Time:** `O(1)`
* **Space:** `O(1)`

### Code Explanation:
The `swap` function successfully swaps its *local parameters* `a` and `b`. However, `main`'s `a` and `b` remain unchanged because `swap` received copies, demonstrating Java's **call-by-value mechanism** for primitives.





# 💥 Functions - `function4`: Product of Two Numbers 💥

## 📁 File: `Functions/function4.java`

## 🎯 Problem Statement
Calculate and display the product of two user-provided numbers using a dedicated function.

**LeetCode Link:** Not applicable (basic arithmetic function).

## 🤔 Intuition
Functions are great for encapsulating specific operations. A `multiply` function clearly separates the multiplication logic, making the main program cleaner and the functionality reusable, like **Iron Man delegating complex calculations to Jarvis**.

## 🛠️ Approach
* Define a `multiply` function that takes two integers and returns their product.
* In `main`, get user input for two numbers.
* Call the `multiply` function with these numbers.
* Print the returned product.

## 🚀 Complexity Analysis
* **Time:** `O(1)`
* **Space:** `O(1)`

### Code Explanation:
The `multiply` function performs the multiplication and `return`s the result. The `main` method calls `multiply`, then prints the `prod` variable, demonstrating simple functional use.





# 💥 Functions - `function5`: Factorial Calculation 💥

## 📁 File: `Functions/function5.java`

## 🎯 Problem Statement
Calculate the factorial of a user-provided non-negative integer.

**LeetCode Link:** Not applicable (basic mathematical function).

## 🤔 Intuition
Factorial is a product of all positive integers up to `n`. A loop provides a straightforward way to iteratively compute this product. Encapsulating this in a function makes it reusable, like **Thor summoning a powerful, repeatable lightning strike**.

## 🛠️ Approach
* Define a `factorial` function:
    * Initialize `fac` to 1.
    * Loop from 1 to `n`, multiplying `fac` by each `i`.
    * Return `fac`.
* In `main`, get user input `n`, call `factorial(n)`, and print the result.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Linear with the input number `N`.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The `factorial` function iterates, accumulating the product in `fac`. `main` obtains `N` and directly prints the result of `factorial(N)`.





# 💥 Functions - `function6`: Binomial Coefficient (nCr) 💥

## 📁 File: `Functions/function6.java`

## 🎯 Problem Statement
Calculate the binomial coefficient "n choose r" (nCr) using functions to compute factorials.

**LeetCode Link:** Not applicable (basic combinatorial calculation).

## 🤔 Intuition
The binomial coefficient (nCr) is defined as `n! / (r! * (n-r)!)`. By using a `factorial` helper function, we can break down this calculation into smaller, manageable, and reusable steps. This modularity is like **Captain America assembling his team, knowing each hero can perform a distinct, critical task**.

## 🛠️ Approach
* Define a `factorial` function (as in `function5`).
* Define a `binCoeff` function:
    * It calls `factorial` three times to get `n!`, `r!`, and `(n-r)!`.
    * It then computes `n! / (r! * (n-r)!)`.
    * It returns the result.
* In `main`, get `n` and `r` from the user, call `binCoeff(n,r)`, and print the result.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Dominated by factorial calls.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The `factorial` function calculates factorials. The `binCoeff` function **recycles this factorial logic** for `n`, `r`, and `n-r`. It then applies the binomial coefficient formula, `n_fac / (r_fac * nr_fac)`, to get the result. `main` drives the input and output.





# 💥 Functions - `function8`: Function Overloading (Data Types) 💥

## 📁 File: `Functions/function8.java`

## 🎯 Problem Statement
Demonstrate function overloading by creating multiple `sum` functions that accept different data types (integers and floats).

**LeetCode Link:** Not applicable (fundamental language concept).

## 🤔 Intuition
Function overloading allows a class to have multiple methods with the same name but different parameters (number, type, or order). The compiler automatically picks the correct version based on the arguments provided. It's like **Iron Man's suit having multiple "Repulsor Blast" modes**: same name, but different power outputs depending on the energy type.

## 🛠️ Approach
* Define two `sum` functions:
    * One taking two `int` parameters and returning an `int` sum.
    * Another taking two `float` parameters and returning a `float` sum.
* In `main`, call `sum` with integer arguments, and then call `sum` again with float arguments, observing which version is invoked.

## 🚀 Complexity Analysis
* **Time:** `O(1)`
* **Space:** `O(1)`

### Code Explanation:
The two `sum` methods have identical names but different parameter types (`int` vs. `float`). When `sum(4,8)` is called, the `int` version is chosen. When `sum(4f,2f)` is called, the `float` version is automatically selected by the Java compiler. This showcases **polymorphism at compile-time**, making code flexible.





# 💥 Functions - `function9`: Prime Number Check (Non-Optimized) 💥

## 📁 File: `Functions/function9.java`

## 🎯 Problem Statement
Check if a given integer is a prime number, using a function and a basic (non-optimized) loop.

**LeetCode Link:** Not applicable (basic number theory).

## 🤔 Intuition
A prime number is only divisible by 1 and itself. We can test every number from 2 up to `n-1`. If any divides `n` evenly, it's not prime. This is a direct test, like **Captain America checking every single Hydra agent** in a room.

## 🛠️ Approach
* Define an `isprime` function taking an integer `n`.
* Handle `n=2` as a special case (it's prime).
* For other `n`, loop from `i=2` to `n-1`:
    * If `n % i == 0`, set a flag to `false` and `break` early.
* Return the flag's value.
* In `main`, get input, call `isprime`, and print result.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Loop runs up to `N` times in the worst case.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The `isprime` function checks divisibility. It handles `n=2` separately. The `for` loop checks divisors from 2 up to `n-1`. If a divisor is found, `isprime` becomes `false`, and the `break` statement halts the loop.





# 💥 Functions - `function10`: Optimized Prime Number Check 💥

## 📁 File: `Functions/function10.java`

## 🎯 Problem Statement
Efficiently determine if a given integer is a prime number using an optimized function.

**LeetCode Link:** Not applicable (fundamental number theory).

## 🤔 Intuition
To check for primality, we only need to test for divisibility by numbers up to its square root. If `n` has a divisor larger than `sqrt(n)`, it must also have one smaller than `sqrt(n)`. This optimization drastically reduces checks, like **Doctor Strange narrowing down possibilities to find the single truth!**

## 🛠️ Approach
* Define an `isprime` function taking `n`.
* Handle `n=2` (returns `true`).
* Loop from `i=2` up to `Math.sqrt(n)`:
    * If `n % i == 0`, immediately `return false`.
* If the loop completes, `return true`.
* In `main`, get input, call `isprime`, and print the boolean result.

## 🚀 Complexity Analysis
* **Time:** `O(sqrt(N))` - Loop runs up to square root of `N`.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The `isprime` function uses `Math.sqrt(n)` as the loop limit for optimization. If any divisor is found, it immediately `return false`. If no divisors are found up to the square root, it `return true`, efficiently determining primality.





# 💥 Functions - `function11`: Primes in Range (Optimized) 💥

## 📁 File: `Functions/function11.java`

## 🎯 Problem Statement
Print all prime numbers within a given range (from 2 up to `n`), using an optimized primality test.

**LeetCode Link:** Not applicable (number theory application).

## 🤔 Intuition
To find primes in a range, we can simply iterate through each number in that range and apply an efficient `isprime` check to it. Reusing the optimized `isprime` function makes the code modular and performant, like **S.H.I.E.L.D. scanning a list of potential recruits with a perfected algorithm**.

## 🛠️ Approach
* Define an optimized `isprime` helper function (checks up to `sqrt(n)`).
* Define a `primesInRange` function that takes an integer `n`:
    * Loop `i` from 2 to `n`.
    * For each `i`, call `isprime(i)`. If true, print `i`.
* In `main`, get the range `n` from user, then call `primesInRange(n)`.

## 🚀 Complexity Analysis
* **Time:** `O(N * sqrt(N))` - `N` iterations, each calling `sqrt(N)` primality test.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The `isprime` function efficiently checks if a single number is prime. The `primesInRange` function then **iterates through the given range**, using this `isprime` function as a **filter**. It prints numbers that pass the prime test, effectively revealing all primes within the specified range.





# 💥 Functions - `function12`: Binary to Decimal Conversion 💥

## 📁 File: `Functions/function12.java`

## 🎯 Problem Statement
Convert a binary number (represented as an integer) to its decimal equivalent.

**LeetCode Link:** Not applicable (basic number system conversion).

## 🤔 Intuition
Binary numbers are base-2. Each digit (bit) contributes a value of `2^position` if it's a `1`. By iterating through the binary number's digits from right to left (LSB to MSB), we sum `digit * 2^power` for each digit. This is like **deciphering an alien code**: breaking it down digit by digit, each with its own specific weight.

## 🛠️ Approach
* Define a `Bintodec` function taking an integer `n` (the binary number).
* Initialize `dec = 0` (decimal equivalent) and `power = 0` (power of 2).
* Loop while `n` is not 0:
    * Get the last digit (`n % 10`).
    * Add `last_digit * 2^power` to `dec`.
    * Increment `power`.
    * Remove the last digit from `n` (`n /= 10`).
* Print the `dec` value.

## 🚀 Complexity Analysis
* **Time:** `O(log10(N))` - Proportional to the number of digits in the binary number (base 10 representation).
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The `Bintodec` function extracts digits (`r`) from the input binary number. `dec` accumulates the sum of each digit multiplied by its corresponding power of 2 (`Math.pow(2,power)`). The loop continues until all digits are processed.





# 💥 Functions - `function13`: Decimal to Binary Conversion 💥

## 📁 File: `Functions/function13.java`

## 🎯 Problem Statement
Convert a decimal number to its binary equivalent.

**LeetCode Link:** Not applicable (basic number system conversion).

## 🤔 Intuition
Decimal to binary conversion involves repeatedly dividing the decimal number by 2 and recording the remainders. The binary representation is formed by these remainders read from bottom to top. We build the binary number by placing these remainders at increasing powers of 10. This is like **encoding a secret message**: breaking it down into binary components.

## 🛠️ Approach
* Define a `DecToBin` function taking an integer `n` (the decimal number).
* Initialize `bin = 0` (binary equivalent) and `pow = 0` (power of 10 for placing binary digits).
* Loop while `n` is not 0:
    * Get the remainder when `n` is divided by 2 (`n % 2`). This is the current binary digit.
    * Add `remainder * 10^pow` to `bin`.
    * Divide `n` by 2 (`n /= 2`).
    * Increment `pow`.
* Print the `bin` value.

## 🚀 Complexity Analysis
* **Time:** `O(log2(N))` - Proportional to the number of bits in `N`.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The `DecToBin` function iteratively takes the remainder of `n/2` (the binary digit). It then multiplies this digit by increasing powers of 10 (`Math.pow(10, pow)`) to correctly position it in the `bin` result.





# 💥 Functions - `function14`: Average of Three Numbers 💥

## 📁 File: `Functions/function14.java`

## 🎯 Problem Statement
Calculate and display the average of three user-provided numbers using a dedicated function.

**LeetCode Link:** Not applicable (basic arithmetic function).

## 🤔 Intuition
Calculating an average is a common task. Encapsulating this logic in a function promotes code reusability and clarity, much like **Jarvis having a specific subroutine for 'arithmetic calculations'**.

## 🛠️ Approach
* Define an `avg` function that takes three integers.
* Inside `avg`, sum the numbers, divide by 3 (using `float` casting for accurate division), and print the result.
* In `main`, get three numbers from the user, then call `avg` with these inputs.

## 🚀 Complexity Analysis
* **Time:** `O(1)`
* **Space:** `O(1)`

### Code Explanation:
The `avg` function performs the summation and division. Casting to `float` ensures floating-point division for an accurate average, preventing integer truncation. `main` handles input and function invocation.





# 💥 Functions - `function15`: Even/Odd Check (Boolean Return) 💥

## 📁 File: `Functions/function15.java`

## 🎯 Problem Statement
Determine if a given integer is even or odd, returning a boolean `true` for even and `false` for odd.

**LeetCode Link:** Not applicable (basic arithmetic function).

## 🤔 Intuition
The modulo operator (`%`) quickly reveals parity. Returning a boolean is a clean way to signify a true/false condition, like **Vision's internal sensors reporting a clear 'threat detected' or 'all clear' state**.

## 🛠️ Approach
* Define an `isEven` function that takes an integer `n`.
* Use `n % 2 == 0` to check for evenness.
* Return `true` if even, `false` otherwise.
* In `main`, get input, call `isEven`, and print the boolean result.

## 🚀 Complexity Analysis
* **Time:** `O(1)`
* **Space:** `O(1)`

### Code Explanation:
The `isEven` function uses the modulo operator to test divisibility by 2. It directly returns `true` or `false` based on the result, providing a concise boolean output for parity.





# 💥 Functions - `function16`: Palindrome Number Check 💥

## 📁 File: `Functions/function16.java`

## 🎯 Problem Statement
Determine if a given integer is a palindrome (reads the same forwards and backwards).

**LeetCode Link:** Not applicable (basic number property check).

## 🤔 Intuition
To check if a number is a palindrome, we need to reverse it and then compare the reversed version with the original. If they match, it's a palindrome. This is like **Doctor Strange reversing time** on a small object to see its original state.

## 🛠️ Approach
* Define a `palindrome` function taking an integer `n`.
* Reverse the number `n` digit by digit using a `while` loop, storing it in `rev`.
* Compare `rev` with the original `n`.
* Print whether it's a "Palindrome" or "non-Palindrome."

## 🚀 Complexity Analysis
* **Time:** `O(log10(N))` - Proportional to the number of digits in `N`.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The `palindrome` function extracts digits from `n` (`rem = i % 10`), builds the reversed number (`rev = rev * 10 + rem`), and then compares `rev` with the original `n` to determine if it's a palindrome.





# 💥 Functions - `function17`: Sum of Digits 💥

## 📁 File: `Functions/function17.java`

## 🎯 Problem Statement
Calculate and display the sum of the digits of a given integer.

**LeetCode Link:** Not applicable (basic arithmetic function).

## 🤔 Intuition
To sum digits, we repeatedly extract the last digit using the modulo operator (`% 10`) and then remove it by integer division (`/ 10`). This process continues until the number becomes zero, like **Hawkeye precisely picking off each individual target from a group**.

## 🛠️ Approach
* Define a `sumOfDigits` function taking an integer `n`.
* Initialize `sum = 0`.
* Loop while `n` is not 0:
    * Get the last digit (`n % 10`).
    * Add it to `sum`.
    * Remove the last digit (`n /= 10`).
* Print the `sum`.

## 🚀 Complexity Analysis
* **Time:** `O(log10(N))` - Proportional to the number of digits.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The `sumOfDigits` function iteratively extracts each digit (`rem`) from `n` using the modulo operator. It adds `rem` to `sum` and updates `n` by integer division until `n` is 0, thus summing all digits.





# 💥 Functions - `function19`: Inverted & Rotated Half-Pyramid 💥

## 📁 File: `Functions/function19.java`

## 🎯 Problem Statement
Print an inverted and rotated half-pyramid pattern of asterisks (`*`) given a number `n` for its size.

**LeetCode Link:** Not applicable (basic pattern printing).

## 🤔 Intuition
This pattern requires printing leading spaces followed by asterisks. For `n` rows, row `i` needs `n-i` spaces and `i` asterisks. Nested loops handle this row by row, building the shape from the top down, like **Captain America assembling his shield from perfectly spaced vibranium panels.**

## 🛠️ Approach
* Define `inverted_rotated_pyramid` function taking `n`.
* Outer loop `i` from 1 to `n` (for rows).
* Inner loop `j` from 1 to `n-i` to print leading spaces.
* Another inner loop `j` from 1 to `i` to print asterisks.
* Print a newline after each row.

## 🚀 Complexity Analysis
* **Time:** `O(N^2)` - Nested loops, each potentially running `N` times.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The outer loop controls rows. The first inner loop prints `n-i` spaces, pushing the `*`s to the right. The second inner loop prints `i` asterisks. This creates the **inverted and rotated triangular shape**, layer by layer.





# 💥 Functions - `function20`: Inverted Half-Pyramid (Numbers) 💥

## 📁 File: `Functions/function20.java`

## 🎯 Problem Statement
Print an inverted half-pyramid pattern where each row consists of sequential numbers.

**LeetCode Link:** Not applicable (basic pattern printing).

## 🤔 Intuition
Each row starts from 1 and counts up, but the number of elements in each row decreases. The outer loop controls the rows, and the inner loop prints numbers up to `(total_lines - current_row + 1)`. This is like **Jarvis counting down the launch sequence**: each line gets shorter, but the numbers count up sequentially.

## 🛠️ Approach
* Define `halfPyramidNumber` function taking `line` (total lines).
* Outer loop `i` from 1 to `line` (for rows).
* Inner loop `pattern` from 1 to `(line - i + 1)`: print `pattern`.
* Print a newline after each row.

## 🚀 Complexity Analysis
* **Time:** `O(N^2)` - Nested loops, where `N` is `line`.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The outer loop iterates for each row. The inner loop's condition `(line - i + 1)` dynamically adjusts the number of elements printed per row, creating the inverted pyramid shape. The inner loop prints the current `pattern` number.





# 💥 Functions - `function21`: Floyd's Triangle Pattern 💥

## 📁 File: `Functions/function21.java`

## 🎯 Problem Statement
Print Floyd's Triangle, a right-angled triangular array of natural numbers, given the number of rows.

**LeetCode Link:** Not applicable (basic pattern printing).

## 🤔 Intuition
Floyd's Triangle involves printing sequentially increasing numbers. Nested loops control the rows and columns, with a single counter variable incrementing for each number printed. Each row prints `i` numbers, where `i` is the row number, like **Jarvis sequentially numbering each new system brought online**.

## 🛠️ Approach
* Define `floyd_triangle` function taking `line` (number of rows).
* Initialize `pattern = 1`.
* Outer loop `i` from 1 to `line` (for rows).
* Inner loop `j` from 1 to `i` (for numbers in current row).
    * Print `pattern` followed by a space.
    * Increment `pattern`.
* Print a newline after each row.

## 🚀 Complexity Analysis
* **Time:** `O(N^2)` - Nested loops, where `N` is `line`.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The `pattern` variable acts as a **global counter**, ensuring numbers increment continuously across rows. The outer loop controls the number of rows, and the inner loop ensures each row `i` prints exactly `i` numbers, creating the distinct triangular shape.





# 💥 Functions - `function22`: 0-1 Triangle Pattern 💥

## 📁 File: `Functions/function22.java`

## 🎯 Problem Statement
Print a triangle pattern where each element is a `0` or `1` based on the sum of its row and column indices.

**LeetCode Link:** Not applicable (basic pattern printing).

## 🤔 Intuition
The pattern alternates `0`s and `1`s. The key observation is that `(row_index + column_index)` determines this: if the sum is even, it's `1`; if odd, it's `0`. Nested loops iterate through the triangle, applying this parity rule. This is like **Vision's binary analysis**: a simple sum reveals the core state (0 or 1) of each point.

## 🛠️ Approach
* Define `triangle_0_1` function taking `line` (number of rows).
* Outer loop `i` from 1 to `line` (for rows).
* Inner loop `j` from 1 to `i` (for elements in current row).
    * If `(i + j)` is even, print `1`.
    * Else, print `0`.
* Print a newline after each row.

## 🚀 Complexity Analysis
* **Time:** `O(N^2)` - Nested loops, where `N` is `line`.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The outer loop manages rows, the inner loop handles elements per row. The condition `(i + j) % 2 == 0` determines whether a `1` or `0` is printed, creating the alternating binary pattern based on cell position.





# 💥 Functions - `function24`: Solid Rhombus Star Pattern 💥

## 📁 File: `Functions/function24.java`

## 🎯 Problem Statement
Print a solid rhombus pattern of asterisks (`*`) given a number `line` for its side length.

**LeetCode Link:** Not applicable (basic pattern printing).

## 🤔 Intuition
A solid rhombus pattern involves printing leading spaces that decrease with each row, followed by a fixed number of asterisks. This creates a parallelogram shape. Nested loops control the rows and columns, like **Captain America assembling a shield with perfect diagonal alignment.**

## 🛠️ Approach
* Define `solid_rhombus` function taking `line`.
* Outer loop `i` from 1 to `line` (for rows).
* Inner loop `j` from 1 to `(line - i)` to print leading spaces.
* Another inner loop `j` from 1 to `line` to print asterisks.
* Print a newline after each row.

## 🚀 Complexity Analysis
* **Time:** `O(N^2)` - Nested loops, where `N` is `line`.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The outer loop iterates through each row. The first inner loop prints `line-i` leading spaces, shifting the stars to the right. The second inner loop prints a fixed `line` number of asterisks. This combination forms the **distinct parallelogram shape** of a solid rhombus.





# 💥 Functions - `function25`: Hollow Rhombus Star Pattern 💥

## 📁 File: `Functions/function25.java`

## 🎯 Problem Statement
Print a hollow rhombus pattern of asterisks (`*`) and spaces, given its side length.

**LeetCode Link:** Not applicable (basic pattern printing).

## 🤔 Intuition
A hollow rhombus combines the leading spaces of a solid rhombus with the border-checking logic of a hollow rectangle. We print spaces for interior cells and asterisks for the perimeter, maintaining the diagonal offset, like **Iron Man projecting a force field with precise, visible edges.**

## 🛠️ Approach
* Define `hollow_rhombus` function taking `line`.
* Outer loop `i` from 1 to `line` (for rows).
* First inner loop `j` from 1 to `(line - i)` to print leading spaces.
* Second inner loop `j` from 1 to `line` for characters in the rhombus body:
    * If `i` is first/last row OR `j` is first/last column, print `*`.
    * Else, print ` `.
* Print a newline after each row.

## 🚀 Complexity Analysis
* **Time:** `O(N^2)` - Nested loops, where `N` is `line`.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The outer loop iterates rows. The first inner loop adds leading spaces for the diagonal effect. The second inner loop determines if `*` (for border cells) or ` ` (for interior) should be printed, forming the hollow rhombus.





# 💥 Functions - `function26`: Diamond Pattern 💥

## 📁 File: `Functions/function26.java`

## 🎯 Problem Statement
Print a symmetric diamond pattern of asterisks (`*`) given a number `line` for its half-height.

**LeetCode Link:** Not applicable (basic pattern printing).

## 🤔 Intuition
A diamond pattern is formed by combining an upward-pointing pyramid and a downward-pointing pyramid. The key is controlling the leading spaces and the number of stars per row for both halves, creating the symmetric shape. This is like **Doctor Strange conjuring a perfectly balanced magical artifact**.

## 🛠️ Approach
* Define a `diamond` function taking `line`.
* **First half (top pyramid):** Loop `i` from 1 to `line`.
    * Print `(line - i)` leading spaces.
    * Print `(2*i - 1)` asterisks.
* **Second half (bottom pyramid):** Loop `i` from `line` down to 1.
    * Print `(line - i)` leading spaces.
    * Print `(2*i - 1)` asterisks.
* Print a newline after each row.

## 🚀 Complexity Analysis
* **Time:** `O(N^2)` - Two sets of nested loops, each `O(N^2)`.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The pattern is split into two `for` loops. The first constructs the expanding top half (increasing stars, decreasing spaces). The second constructs the contracting bottom half (decreasing stars, increasing spaces). The `(2*i - 1)` formula ensures the correct odd number of stars for symmetry.





# 💥 Functions - `function27`: Number Pyramid Pattern 💥

## 📁 File: `Functions/function27.java`

## 🎯 Problem Statement
Print a pyramid pattern where each row consists of the row number repeated, centered by leading spaces.

**LeetCode Link:** Not applicable (basic pattern printing).

## 🤔 Intuition
This pattern combines leading spaces to center numbers with printing the row number multiple times. The number of spaces decreases, and the number of repetitions of the row number increases, creating a numerical pyramid. This is like **Doctor Strange's portal opening sequence**: each layer of the spell precisely expanding and revealing the next.

## 🛠️ Approach
* Define `number_pyramid` function taking `line`.
* Outer loop `i` from 1 to `line` (for rows).
* First inner loop `j` from 1 to `(line - i)` to print leading spaces.
* Second inner loop `j` from 1 to `i` to print the current row number `i` followed by a space.
* Print a newline after each row.

## 🚀 Complexity Analysis
* **Time:** `O(N^2)` - Nested loops, where `N` is `line`.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The outer loop iterates through each row. The first inner loop handles the decreasing number of leading spaces. The second inner loop prints the current row number (`i`) repeatedly for `i` times, forming the expanding numerical pyramid structure.





# 💥 Functions - `function28`: Palindromic Number Pattern 💥

## 📁 File: `Functions/function28.java`

## 🎯 Problem Statement
Print a palindromic number pattern where each row is centered and reads the same forwards and backwards.

**LeetCode Link:** Not applicable (basic pattern printing).

## 🤔 Intuition
This pattern combines leading spaces for centering with two sets of numbers for the palindrome effect: one counting down from `i` to 1, and another counting up from 2 to `i`. This creates a symmetric number sequence in each row, like **Vision perfectly aligning his density to form a stable structure.**

## 🛠️ Approach
* Define `palindromic_number_pattern` function taking `line`.
* Outer loop `i` from 1 to `line` (for rows).
* First inner loop `j` from 1 to `(line - i)` to print leading spaces.
* Second inner loop `j` from `i` down to 1 to print descending numbers.
* Third inner loop `j` from 2 to `i` to print ascending numbers (completing the palindrome).
* Print a newline after each row.

## 🚀 Complexity Analysis
* **Time:** `O(N^2)` - Nested loops, where `N` is `line`.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The outer loop iterates through rows. The first inner loop handles leading spaces. The second inner loop prints numbers in decreasing order (`i` down to 1). The third inner loop prints numbers in increasing order (`2` up to `i`), effectively creating the palindromic sequence for each row.