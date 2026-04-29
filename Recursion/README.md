# 💥 Recursion - `Recursion1`: Print N to 1 💥

## 📁 File: `Recursion/Recursion1.java`

## 🎯 Problem Statement
Print natural numbers from `N` down to 1 using recursion.

**LeetCode Link:** Not applicable (basic recursion exercise).

## 🤔 Intuition
Recursion solves problems by breaking them into smaller, identical subproblems until a base case is met. To print `N` down to 1, we print `N`, then recursively call the function for `N-1`. The base case is when `N` becomes 1. This is like **Doctor Strange iterating through dimensions, each one a smaller version of the previous, until he reaches the core.**

## 🛠️ Approach
* Define a `RecursiveReturn` function that takes an integer `n`.
* **Base Case:** If `n == 1`, print `1` and `return`.
* **Recursive Step:** Print `n`, then recursively call `RecursiveReturn(n-1)`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Function is called `N` times.
* **Space:** `O(N)` - For the recursion stack depth.

### Code Explanation:
The `RecursiveReturn` function prints `n`. Then, `RecursiveReturn(n-1)` makes a recursive call. The `if (n==1)` block serves as the **base case**, stopping the recursion. The calls unwind, printing numbers in decreasing order.





# 💥 Recursion - `Recursion2`: Print 1 to N 💥

## 📁 File: `Recursion/Recursion2.java`

## 🎯 Problem Statement
Print natural numbers from 1 up to `N` using recursion.

**LeetCode Link:** Not applicable (basic recursion exercise).

## 🤔 Intuition
To print 1 to `N` recursively, we first ensure `N-1` is printed, and *then* print `N`. This means the print statement comes *after* the recursive call. The base case is when `N` becomes 1. This is like **Iron Man building a structure**: he ensures all lower-level components are in place before adding the current layer.

## 🛠️ Approach
* Define a `RecursiveFunction` that takes an integer `n`.
* **Base Case:** If `n == 1`, print `1` and `return`.
* **Recursive Step:** Call `RecursiveFunction(n-1)`, then print `n`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Function is called `N` times.
* **Space:** `O(N)` - For the recursion stack depth.

### Code Explanation:
The `RecursiveFunction(n-1)` call occurs first, pushing new frames onto the stack. The print statement `System.out.print(n + " ")` executes only **after the recursive call returns**, ensuring numbers are printed in increasing order as the stack unwinds.





# 💥 Recursion - `Recursion3`: Factorial Calculation 💥

## 📁 File: `Recursion/Recursion3.java`

## 🎯 Problem Statement
Calculate the factorial of a given non-negative integer `n` using recursion.

**LeetCode Link:** Not applicable (basic recursion exercise).

## 🤔 Intuition
Factorial (`n!`) is defined as `n * (n-1)!` with `0! = 1` and `1! = 1`. This definition is inherently recursive: a problem is defined in terms of a smaller version of itself. We use the recursive call for `(n-1)!` and multiply by `n`. This is like **Doctor Strange splitting a complex magical formula into simpler, repeating components.**

## 🛠️ Approach
* Define a `fact` function that takes an integer `n`.
* **Base Case:** If `n == 0` or `n == 1`, return `1`.
* **Recursive Step:** Return `n * fact(n-1)`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Function is called `N` times.
* **Space:** `O(N)` - For the recursion stack depth.

### Code Explanation:
The `fact` function directly implements the recursive definition of factorial. The `if (n==1 || n==0)` block serves as the **base case**, preventing infinite recursion. The `return n * fact(n-1)` is the **recursive step**, breaking down the problem into smaller factorials.





# 💥 Recursion - `Recursion4`: Sum of First N Natural Numbers 💥

## 📁 File: `Recursion/Recursion4.java`

## 🎯 Problem Statement
Calculate the sum of the first `N` natural numbers using recursion.

**LeetCode Link:** Not applicable (basic recursion exercise).

## 🤔 Intuition
The sum of `N` natural numbers can be defined as `N + sum(N-1)`. This recursive relationship allows us to define the problem in terms of a smaller version of itself. The base case is when `N` is 1, where the sum is simply 1. This is like **Captain America assembling his team's total strength**: each new member adds their power to the previous sum.

## 🛠️ Approach
* Define a `sum` function that takes an integer `n`.
* **Base Case:** If `n == 1`, return `1`.
* **Recursive Step:** Return `n + sum(n-1)`. (The code shows an expanded version of this for clarity.)

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Function is called `N` times.
* **Space:** `O(N)` - For the recursion stack depth.

### Code Explanation:
The `sum` function uses `if (n==1)` as its **base case**. The core recursive step `int sumN_1 = sum(n-1); int sumN = n + sumN_1; return sumN;` effectively calculates `N + sum(N-1)`. This demonstrates how to break down a summation problem into a smaller, recursive call plus current value.





# 💥 Recursion - `Recursion5`: Fibonacci Number 💥

## 📁 File: `Recursion/Recursion5.java`

## 🎯 Problem Statement
Calculate the Nth Fibonacci number using recursion.

**LeetCode Link:** [LeetCode 509. Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)

<h2>🤔 Intuition</h2>
The Fibonacci sequence is defined recursively: `F(n) = F(n-1) + F(n-2)`, with `F(0)=0` and `F(1)=1`. This direct recursive definition can be translated into code. It's like **Doctor Strange splitting a timeline into two preceding realities** to understand the current one.

<h2>🛠️ Approach</h2>
* Define a `fibo` function taking an integer `n`.
* **Base Cases:** If `n == 0`, return `0`. If `n == 1`, return `1`.
* **Recursive Step:** Calculate `fibo(n-1)` and `fibo(n-2)`, then return their sum.

<h2>🚀 Complexity Analysis</h2>
* **Time:** `O(2^N)` - Exponential due to redundant calculations (e.g., `fibo(5)` calls `fibo(3)` twice).
* **Space:** `O(N)` - For the recursion stack depth.

<h3>Code Explanation:</h3>
The `fibo` function implements the recursive definition directly. The `if (n==0 || n==1)` block serves as the **base cases**, stopping the recursion. The calls `fibo(n-1)` and `fibo(n-2)` branch, leading to a tree of recursive calls.




# 💥 Recursion - `Recursion6`: Check if Array is Sorted 💥

## 📁 File: `Recursion/Recursion6.java`

## 🎯 Problem Statement
Determine recursively if a given array of integers is sorted in non-decreasing order.

**LeetCode Link:** Not applicable (basic recursion exercise).

## 🤔 Intuition
An array is sorted if the current element is less than or equal to the next, AND the rest of the array (from the next element onwards) is also sorted. This self-referential property makes it perfect for recursion. The base case is reaching the end of the array. This is like **Captain America inspecting a line of soldiers**: he checks if the current one is in place relative to the next, then trusts the next one to check their subsequent.

## 🛠️ Approach
* Define an `isSorted` function taking an `int[] arr` and a starting `index i`.
* **Base Case:** If `i` reaches the last element (`arr.length-1`), return `true`.
* **Recursive Step:**
    * If `arr[i] > arr[i+1]`, return `false` (unsorted).
    * Else, recursively call `isSorted(arr, i+1)`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Each element is visited once.
* **Space:** `O(N)` - For the recursion stack depth.

### Code Explanation:
The `isSorted` function checks `arr[i]` against `arr[i+1]`. If `arr[i] > arr[i+1]`, it immediately returns `false`. If the current pair is sorted, `isSorted(arr, i+1)` is called, recursively checking the rest of the array. The **base case** `i == arr.length-1` signals success when all pairs have been checked.





# 💥 Recursion - `Recursion7`: First Occurrence of Element 💥

## 📁 File: `Recursion/Recursion7.java`

## 🎯 Problem Statement
Find the first index at which a given `key` appears in an array, using recursion.

**LeetCode Link:** Not applicable (basic recursion exercise).

## 🤔 Intuition
To find the first occurrence recursively, we check the current element. If it's the `key`, we've found it. Otherwise, we recursively search in the rest of the array. The base case is reaching the end without finding the `key`. This is like **Hawkeye searching for a specific target**: he checks his immediate vicinity, then moves on to the next area if it's not there.

## 🛠️ Approach
* Define `firstOccurence(arr, key, i)`:
* **Base Case:** If `i` reaches `arr.length`, return `-1` (key not found).
* **Recursive Step:**
    * If `arr[i] == key`, return `i` (found!).
    * Else, recursively call `firstOccurence(arr, key, i+1)`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - In worst case, visits all `N` elements.
* **Space:** `O(N)` - For the recursion stack depth.

### Code Explanation:
The `firstOccurence` function first checks if `i` is out of bounds. If `arr[i]` matches `key`, it returns `i`. Otherwise, it makes a recursive call to `firstOccurence` for the next index (`i+1`), continuing the search.





# 💥 Recursion - `Recursion8`: Last Occurrence of Element 💥

## 📁 File: `Recursion/Recursion8.java`

## 🎯 Problem Statement
Find the last index at which a given `key` appears in an array, using recursion.

**LeetCode Link:** Not applicable (basic recursion exercise).

## 🤔 Intuition
To find the *last* occurrence recursively, we first ask the rest of the array (from `i+1` onwards) if they contain the `key`. If they do, that's our answer. If not, *then* we check if the current element `arr[i]` is the `key`. This approach processes from right-to-left conceptually during the stack unwind, like **Jarvis searching for the most recent log entry** containing specific keywords.

## 🛠️ Approach
* Define `lastOccurence(arr, key, i)`:
* **Base Case:** If `i` reaches `arr.length`, return `-1` (key not found).
* **Recursive Step:**
    * Call `lastOccur = lastOccurence(arr, key, i+1)` (recursively find last occurrence in rest of array).
    * If `lastOccur == -1` (key not found in rest) AND `arr[i] == key` (current element is the key), return `i`.
    * Else, return `lastOccur` (the one found further right, or -1 if not found anywhere).

## 🚀 Complexity Analysis
* **Time:** `O(N)` - In worst case, visits all `N` elements.
* **Space:** `O(N)` - For the recursion stack depth.

### Code Explanation:
The `lastOccurence` function first makes a recursive call `lastOccurence(arr, key, i+1)` to find the last occurrence in the `arr[i+1...end]` subarray. If that call returns `-1` (meaning `key` wasn't found to the right of `i`), *and* `arr[i]` matches `key`, then `i` is the last occurrence. Otherwise, `lastOccur` (the index from the rightward search) is returned.





# 💥 Recursion - `Recursion9`: Power Calculation (x^n) 💥

## 📁 File: `Recursion/Recursion9.java`

## 🎯 Problem Statement
Calculate `x` raised to the power of `n` (`x^n`) using recursion.

**LeetCode Link:** [LeetCode 50. Pow(x, n)](https://leetcode.com/problems/powx-n/) (This is the basic recursive approach).

## 🤔 Intuition
Exponentiation `x^n` can be defined recursively as `x * x^(n-1)`. The base case is `x^0 = 1`. This simple recursive definition allows us to break down the power calculation into smaller, identical subproblems. It's like **Thor charging Mjolnir**: each swing builds on the power of the previous one.

## 🛠️ Approach
* Define a `power` function that takes an integer base `x` and an integer exponent `n`.
* **Base Case:** If `n == 0`, return `1`.
* **Recursive Step:** Return `x * power(x, n-1)`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Function is called `N+1` times.
* **Space:** `O(N)` - For the recursion stack depth.

### Code Explanation:
The `power` function directly implements the recursive definition. The `if (n==0)` block serves as the **base case**, stopping the recursion. The `return x * power(x, n-1)` is the **recursive step**, continuously multiplying `x` with the result of a smaller power calculation.





# 💥 Recursion - `Recursion11`: Optimized Power Calculation (x^n) 💥

## 📁 File: `Recursion/Recursion11.java`

## 🎯 Problem Statement
Calculate `x` raised to the power of `n` (`x^n`) efficiently using an optimized recursive approach (exponentiation by squaring).

**LeetCode Link:** [LeetCode 50. Pow(x, n)](https://leetcode.com/problems/powx-n/)

## 🤔 Intuition
Instead of `x * x^(n-1)`, we can use `x^n = (x^(n/2)) * (x^(n/2))`. If `n` is odd, we also multiply by an extra `x`. This significantly reduces recursive calls. For `x^10`, it's `(x^5)^2`. For `x^5`, it's `x * (x^2)^2`. This is like **Doctor Strange opening portals** to jump directly to intermediate results, vastly speeding up a journey.

## 🛠️ Approach
* Define `optimizedPower(x, n)`:
* **Base Case:** If `n == 0`, return `1`.
* **Recursive Step:**
    * Calculate `half = optimizedPower(x, n/2)`.
    * Square `half` to get `halfPower = half * half`.
    * If `n` is odd (`n % 2 != 0`), multiply `halfPower` by `x` (`halfPower = x * halfPower`).
    * Return `halfPower`.

## 🚀 Complexity Analysis
* **Time:** `O(log N)` - Number of recursive calls reduces logarithmically with `N`.
* **Space:** `O(log N)` - For the recursion stack depth.

### Code Explanation:
The `optimizedPower` function first handles the **base case** (`n=0`). The recursive step `half = optimizedPower(x, n/2)` divides the problem in half. `halfPower = half * half` squares the result. The `if (n%2!=0)` condition handles odd exponents by multiplying an extra `x`. This recursive strategy is **highly efficient for large exponents**.





# 💥 Recursion - `Recursion12`: Tiling Problem 💥

## 📁 File: `Recursion/Recursion12.java`

## 🎯 Problem Statement
Given a `2 x n` floor, find the number of ways to tile it using `2 x 1` tiles. Tiles can be placed vertically or horizontally.

**LeetCode Link:** This is a classic combinatorial problem often related to Fibonacci numbers.

## 🤔 Intuition
This problem has a clear recursive structure, similar to Fibonacci. For a `2 x n` floor:
1.  **Place vertically:** If you place a `2 x 1` tile vertically, the remaining problem is to tile a `2 x (n-1)` floor.
2.  **Place horizontally:** If you place a `2 x 1` tile horizontally, you *must* place another one next to it horizontally (since the floor is `2` units high). The remaining problem is to tile a `2 x (n-2)` floor.
The total ways are the sum of ways from these two choices. This is like **Iron Man designing a modular floor**: each new section can be covered by one vertical piece or two horizontal pieces.

## 🛠️ Approach
* Define a `tilingProblem` function taking an integer `n` (the length of the floor).
* **Base Cases:**
    * If `n == 0`, return `1` (one way to tile an empty floor).
    * If `n == 1`, return `1` (one way to tile a `2x1` floor: one vertical tile).
* **Recursive Step:**
    * `f_n_minus_1 = tilingProblem(n-1)`: Ways to tile by placing one vertical tile first.
    * `f_n_minus_2 = tilingProblem(n-2)`: Ways to tile by placing two horizontal tiles first.
    * `totalWays = f_n_minus_1 + f_n_minus_2`. Return `totalWays`.

## 🚀 Complexity Analysis
* **Time:** `O(2^N)` - Exponential due to redundant calculations, similar to naive Fibonacci.
* **Space:** `O(N)` - For the recursion stack depth.

### Code Explanation:
The `tilingProblem` function directly implements the recursive choices. The `if (n==0 || n==1)` block serves as the **base cases**. `f_n_minus_1` represents adding a vertical tile, and `f_n_minus_2` represents adding a pair of horizontal tiles. Their sum gives the `totalWays`, reflecting the two distinct tiling strategies.





# 💥 Recursion - `Recursion13`: Remove Duplicates in String 💥

## 📁 File: `Recursion/Recursion13.java`

## 🎯 Problem Statement
Remove all duplicate characters from a given string, maintaining the order of the first occurrence of each character.

**LeetCode Link:** Not a direct LeetCode problem, but a common string manipulation exercise.

## 🤔 Intuition
We can traverse the string recursively. For each character, we check if we've seen it before using a frequency map (or a boolean array for alphabet). If seen, we skip it. If not seen, we append it to our new string and mark it as seen. This ensures only the first occurrence is kept, like **S.H.I.E.L.D. filtering a comms stream to log only unique contacts**.

## 🛠️ Approach
* Define `removeDuplicate(str, index, newStr, map)`:
    * `str`: Original string.
    * `index`: Current character index to process.
    * `newStr`: `StringBuilder` to build unique string.
    * `map`: `boolean[]` to track seen characters (index `ch - 'a'`).
* **Base Case:** If `index` reaches `str.length()`, print `newStr` and return.
* **Recursive Step:**
    * Get `currChar = str.charAt(index)`.
    * If `map[currChar - 'a']` is `true` (already seen): Recurse `removeDuplicate(str, index+1, newStr, map)`.
    * Else (not seen): Mark `map[currChar - 'a'] = true`, append `currChar` to `newStr`, then recurse `removeDuplicate(str, index+1, newStr.append(currChar), map)`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Each character is visited once.
* **Space:** `O(N)` for `StringBuilder` + `O(1)` for `boolean[] map` (alphabet size) + `O(N)` for recursion stack.

### Code Explanation:
The `removeDuplicate` function processes `str` character by character. `currChar = str.charAt(index)` gets the current character. `if (map[currChar - 'a'] == true)` checks for duplicates. If it's a duplicate, it's skipped. Otherwise, `map[currChar - 'a'] = true` marks it seen, and `newStr.append(currChar)` adds it. The recursion continues to `index+1`.





# 💥 Recursion - `Recursion14`: Friends Pairing Problem 💥

## 📁 File: `Recursion/Recursion14.java`

## 🎯 Problem Statement
Given `n` friends, find the number of ways that friends can remain single or pair up.

**LeetCode Link:** Not a direct LeetCode problem, but a classic combinatorial recursion problem.

## 🤔 Intuition
Consider friend `n`. They have two choices:
1.  **Remain single:** The remaining `n-1` friends can then pair up or remain single in `friendsPairing(n-1)` ways.
2.  **Pair up:** Friend `n` can pair with any of the `n-1` other friends. Once paired, the remaining `n-2` friends can arrange themselves in `friendsPairing(n-2)` ways. Since `n` has `(n-1)` choices for a partner, this option contributes `(n-1) * friendsPairing(n-2)` ways.
The total ways are the sum of these two choices. This is like **S.H.I.E.L.D. organizing its agents**: each agent can go solo or team up with any other available agent.

## 🛠️ Approach
* Define `friendsPairing` function taking integer `n`.
* **Base Cases:**
    * If `n == 1`, return `1` (one friend can only remain single).
    * If `n == 2`, return `2` (two friends can be single or form one pair).
* **Recursive Step:**
    * `singleWays = friendsPairing(n-1)`: Ways if friend `n` remains single.
    * `pairWays = (n-1) * friendsPairing(n-2)`: Ways if friend `n` pairs up (chooses 1 from `n-1` and then others arrange).
    * Return `singleWays + pairWays`.

## 🚀 Complexity Analysis
* **Time:** `O(2^N)` - Exponential due to redundant calculations, similar to naive Fibonacci.
* **Space:** `O(N)` - For the recursion stack depth.

### Code Explanation:
The `friendsPairing` function directly implements the two choices for friend `n`. The `if (n==1 || n==2)` block serves as the **base cases**. The return statement `friendsPairing(n-1) + (n-1)* friendsPairing(n-2)` calculates the sum of ways for friend `n` being single and friend `n` pairing up, respectively.





# 💥 Recursion - `Recursion14`: Friends Pairing Problem 💥

## 📁 File: `Recursion/Recursion14.java`

## 🎯 Problem Statement
Given `n` friends, find the number of ways that friends can remain single or pair up.

**LeetCode Link:** Not a direct LeetCode problem, but a classic combinatorial recursion problem.

## 🤔 Intuition
Consider friend `n`. They have two choices:
1.  **Remain single:** The remaining `n-1` friends can then pair up or remain single in `friendsPairing(n-1)` ways.
2.  **Pair up:** Friend `n` can pair with any of the `n-1` other friends. Once paired, the remaining `n-2` friends can arrange themselves in `friendsPairing(n-2)` ways. Since `n` has `(n-1)` choices for a partner, this option contributes `(n-1) * friendsPairing(n-2)` ways.
The total ways are the sum of these two choices. This is like **S.H.I.E.L.D. organizing its agents**: each agent can go solo or team up with any other available agent.

## 🛠️ Approach
* Define `friendsPairing` function taking integer `n`.
* **Base Cases:**
    * If `n == 1`, return `1` (one friend can only remain single).
    * If `n == 2`, return `2` (two friends can be single or form one pair).
* **Recursive Step:**
    * `singleWays = friendsPairing(n-1)`: Ways if friend `n` remains single.
    * `pairWays = (n-1) * friendsPairing(n-2)`: Ways if friend `n` pairs up (chooses 1 from `n-1` and then others arrange).
    * Return `singleWays + pairWays`.

## 🚀 Complexity Analysis
* **Time:** `O(2^N)` - Exponential due to redundant calculations, similar to naive Fibonacci.
* **Space:** `O(N)` - For the recursion stack depth.

### Code Explanation:
The `friendsPairing` function directly implements the two choices for friend `n`. The `if (n==1 || n==2)` block serves as the **base cases**. The return statement `friendsPairing(n-1) + (n-1)* friendsPairing(n-2)` calculates the sum of ways for friend `n` being single and friend `n` pairing up, respectively.





# 💥 Recursion - `Recursion15`: Print Binary Strings without Consecutive Ones 💥

## 📁 File: `Recursion/Recursion15.java`

## 🎯 Problem Statement
Print all binary strings of length `n` that do not contain consecutive ones.

**LeetCode Link:** [LeetCode 600. Non-negative Integers without Consecutive Ones](https://leetcode.com/problems/non-negative-integers-without-consecutive-ones/) (related concept).

## 🤔 Intuition
This is a backtracking problem. We build the binary string digit by digit. If the last placed digit was `0`, we can append either `0` or `1`. If the last placed digit was `1`, we can only append `0` to avoid consecutive ones. The recursion continues until the string reaches length `n`. This is like **Iron Man designing a secure binary code**: if the last bit was high, the next must be low to avoid overload.

## 🛠️ Approach
* Define `printBinaryString(n, lastPlace, str)`:
    * `n`: Remaining length to build.
    * `lastPlace`: The last digit placed (0 or 1).
    * `str`: The string built so far.
* **Base Case:** If `n == 0`, print `str` and return.
* **Recursive Step:**
    * Always append `0`: `printBinaryString(n-1, 0, str+"0")`.
    * If `lastPlace == 0` (previous digit was `0`): Append `1`: `printBinaryString(n-1, 1, str+"1")`.

## 🚀 Complexity Analysis
* **Time:** `O(Fib(N))` (specifically `O(1.618^N)`) - Related to Fibonacci sequence as choices are similar.
* **Space:** `O(N)` - For recursion stack and string concatenation overhead.

### Code Explanation:
The `printBinaryString` function recursively builds the binary string. The `if (n==0)` is the **base case**, printing the completed string. The first recursive call `str+"0"` always appends `0`. The `if (lastPlace==0)` condition ensures that `1` is appended only if the previous digit was `0`, preventing consecutive ones.





# 💥 Recursion - `RecursionQ1`: Convert Number to English Words 💥

## 📁 File: `Recursion/RecursionQ1.java`

## 🎯 Problem Statement
Convert a given non-negative integer into its English word representation, digit by digit.

**LeetCode Link:** [LeetCode 273. Integer to English Words](https://leetcode.com/problems/integer-to-english-words/) (more complex, but this is a simplified version).

## 🤔 Intuition
To print digits from left to right (most significant to least significant), recursion is effective. We recursively call the function for `number / 10` (the prefix of the number) first, and *then* print the word for `number % 10` (the last digit). This ensures the digits are printed in the correct order as the recursion unwinds. This is like **Jarvis processing a number**: he handles the magnitude first, then precisely articulates each digit.

## 🛠️ Approach
* Define a `static String[] value` array mapping digits 0-9 to their English words.
* Define `englishConversion(int number)`:
    * **Base Case:** If `number == 0`, return (stops recursion).
    * **Recursive Step:**
        * Call `englishConversion(number / 10)` to process digits from left.
        * Print `value[number % 10]` (the last digit of current number).
* Handle the `number == 0` case in `main` if the input is exactly zero, as the recursive function's base case is for numbers *becoming* zero, not for an initial zero.

## 🚀 Complexity Analysis
* **Time:** `O(log10(N))` - Proportional to the number of digits in `N`.
* **Space:** `O(log10(N))` - For the recursion stack depth.

### Code Explanation:
The `englishConversion` function uses recursion. `if (number == 0)` is the **base case**. The recursive call `englishConversion(number / 10)` happens *before* printing. This pushes contexts onto the stack. `System.out.print(value[number % 10] + " ")` then prints the last digit's word as the stack unwinds, effectively printing from most significant to least significant digit.





# 💥 Recursion - `RecursionQ2`: Calculate String Length 💥

## 📁 File: `Recursion/RecursionQ2.java`

## 🎯 Problem Statement
Calculate the length of a given string using recursion.

**LeetCode Link:** Not applicable (basic string manipulation recursion).

## 🤔 Intuition
The length of a string can be defined recursively: it's 1 plus the length of the string without its first character. The base case is an empty string, which has length 0. This is like **Captain America counting enemies**: he counts one in front of him, then delegates the rest of the line to a subordinate.

## 🛠️ Approach
* Define a `length` function that takes a `String str`.
* **Base Case:** If `str.length()` is 0 (empty string), return `0`.
* **Recursive Step:** Return `1 + length(str.substring(1))`. (This removes the first character and recursively finds the length of the rest).

## 🚀 Complexity Analysis
* **Time:** `O(N^2)` - `substring(1)` creates a new string in `O(N)` time in each of `N` recursive calls.
* **Space:** `O(N^2)` - Due to new string creations on heap, plus `O(N)` for recursion stack.

### Code Explanation:
The `length` function's `if (str.length()==0)` is the **base case**. The recursive step `return 1 + length(str.substring(1))` adds 1 for the current character and recursively calls for the rest of the string (`str.substring(1)` creates a new string without the first character).





# 💥 Recursion - `RecursionQ3`: Count Substrings with Same First/Last Char 💥

## 📁 File: `Recursion/RecursionQ3.java`

## 🎯 Problem Statement
Count the number of substrings in a given string that start and end with the same character.

**LeetCode Link:** Not a direct LeetCode problem, but related to substring counting.

## 🤔 Intuition
This recursive solution explores all possible substrings. For each substring starting at `start` and ending at `end`, it checks if `str[start]` equals `str[end]`. It then recursively moves to either the next `end` position (to extend current substring start) or the next `start` position (to begin a new set of substrings). This is like **Doctor Strange exploring combinations**: checking if a sequence of events begins and ends with the same mystical signature.

## 🛠️ Approach
* Define `countSubstrings(str, start, end)`:
* **Base Case:** If `start` reaches `str.length()`, return `0` (no more substrings).
* **Current Substring Check:** `int count = (str.charAt(start) == str.charAt(end)) ? 1 : 0;` (1 if current substring `str[start...end]` satisfies condition).
* **Recursive Step:**
    * If `end` reaches `str.length()-1` (end of current `start` series): `return count + countSubstrings(str, start + 1, start + 1)`. Move to next `start` with `end` reset.
    * Else (`end` not at string end): `return count + countSubstrings(str, start, end + 1)`. Extend current `start`'s substring to `end+1`.

## 🚀 Complexity Analysis
* **Time:** `O(N^2)` - Each possible substring (N^2 total) is conceptually visited and checked.
* **Space:** `O(N)` - For the recursion stack depth.

### Code Explanation:
The `countSubstrings` function explores substrings recursively. `(str.charAt(start) == str.charAt(end)) ? 1 : 0` increments count if the current substring meets the condition. The two recursive calls handle **moving the `end` pointer for current `start`** (`countSubstrings(str, start, end + 1)`) and **moving to the `next start` pointer** (`countSubstrings(str, start + 1, start + 1)`) after all substrings from current `start` are exhausted.





# 💥 Recursion - `RecursionQ4`: Print All Occurrences of Key 💥

## 📁 File: `Recursion/RecursionQ4.java`

## 🎯 Problem Statement
Print all indices where a given `key` appears in an array, using recursion.

**LeetCode Link:** Not applicable (basic recursion exercise).

## 🤔 Intuition
To find all occurrences, we recursively traverse the array. At each position, we check if the current element matches the `key`. If it does, we print its index. The recursion then proceeds to the next element. The base case is reaching the end of the array. This is like **S.H.I.E.L.D. scanning a database for all instances of a specific code**: each entry is checked, and its location logged if it matches.

## 🛠️ Approach
* Define `occurrenceKey(arr, index, key)`:
* **Base Case:** If `index` reaches `arr.length`, return.
* **Recursive Step:**
    * If `arr[index] == key`, print `index`.
    * Recursively call `occurrenceKey(arr, index+1, key)`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Visits each element once.
* **Space:** `O(N)` - For the recursion stack depth.

### Code Explanation:
The `occurrenceKey` function recursively checks elements. The `if (index == arr.length)` is the **base case**. `if(arr[index]==key)` prints the index if a match is found. The recursive call `occurrenceKey(arr, index+1, key)` proceeds to the next element, ensuring all indices are checked.