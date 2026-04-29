# 💥 LeetCode - `Leetcode1`: Power of Four 💥

## 📁 File: `Leetcode/Leetcode1.java`

## 🎯 Problem Statement
Given an integer `n`, return `true` if it is a power of four. Otherwise, return `false`.

**LeetCode Link:** [LeetCode 342. Power of Four](https://leetcode.com/problems/power-of-four/)

## 🤔 Intuition
Powers of four (`4^0, 4^1, 4^2, ...`) are also powers of two. So, first, check if `n` is a power of two (`n > 0` and `(n & (n-1)) == 0`). Among powers of two, only those where the single '1' bit is at an even position (0-indexed from right) are powers of four. A bitmask like `0x55555555` helps verify this. This is like **Iron Man's advanced scanner**: first, check for basic power signature (power of 2), then a specific energy pattern (correct bit position).

## 🛠️ Approach
* Check `n <= 0` or `(n & (n-1)) != 0` (standard power of two check); if true, return `false`.
* Then, check `(n & 0x55555555) != 0`. This bitmask (`01010101010101010101010101010101` in binary) has 1s only at even bit positions. If `n` is a power of four, its single set bit will align with one of these 1s, resulting in a non-zero `AND`.

## 🚀 Complexity Analysis
* **Time:** `O(1)` - Constant time bitwise operations.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
`n <= 0` and `(n & (n-1)) != 0` collectively verify `n` is a positive power of two. The `(n & 0x55555555) != 0` check filters these: `0x55555555` ensures the single set bit in a power-of-two `n` is at an even position (0, 2, 4,...). If it's at an odd position (power of 2 but not 4, like `2`, `8`, `32`), `AND`ing with this mask will yield `0`.





# 💥 LeetCode - `Leetcode2`: Integer to Roman 💥

## 📁 File: `Leetcode/Leetcode2.java`

## 🎯 Problem Statement
Convert an integer to its Roman numeral representation.

**LeetCode Link:** [LeetCode 12. Integer to Roman](https://leetcode.com/problems/integer-to-roman/)

## 🤔 Intuition
Roman numerals are formed by combining specific symbols. The greedy approach works best: define pairs of (value, symbol) in descending order of value. Repeatedly subtract the largest possible value from the number and append its symbol until the number becomes zero. This is like **Doctor Strange conjuring a complex spell by assembling its components from largest to smallest mystical sigils**.

## 🛠️ Approach
* Define arrays `value[]` (e.g., 1000, 900, 500...) and `number[]` (e.g., "M", "CM", "D"...) mapping values to Roman symbols, sorted descending.
* Use a `StringBuilder` for efficient string building.
* Iterate through the `value` array:
    * While `n` is greater than or equal to the current `value[i]`:
        * Append `number[i]` to `roman`.
        * Subtract `value[i]` from `n`.
* Return `roman.toString()`.

## 🚀 Complexity Analysis
* **Time:** `O(1)` - Max 13 iterations, each loop runs a small constant number of times. Max 39 appends.
* **Space:** `O(1)` - Fixed-size arrays and `StringBuilder` proportional to output length (max 15 chars for 3999).

### Code Explanation:
`value` and `number` arrays store the Roman numeral mappings. The `for` loop iterates through these pre-defined values. The inner `while` loop greedily subtracts the largest possible Roman numeral value from `n` and appends its symbol, repeating until `n` is exhausted.





# 💥 LeetCode - `Leetcode3`: Remove Element 💥

## 📁 File: `Leetcode/Leetcode3.java`

## 🎯 Problem Statement
Remove all occurrences of a specific value `val` from an integer array `nums` in-place, returning the new length of the array after removal.

**LeetCode Link:** [LeetCode 27. Remove Element](https://leetcode.com/problems/remove-element/)

## 🤔 Intuition
We want to keep elements that are *not* `val`. A two-pointer approach is efficient: one pointer reads through the original array, and another writes valid elements to the front of the array. This is like **Captain America reorganizing his team**: moving only the essential members to the front line.

## 🛠️ Approach
* Initialize a `write_index` (or `index`) to 0.
* Iterate with a `read_index` (`i`) from the beginning of the array.
* If `nums[read_index]` is not equal to `val`, copy `nums[read_index]` to `nums[write_index]` and increment `write_index`.
* Return `write_index` as the new length.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Single pass through the array.
* **Space:** `O(1)` - In-place modification.

### Code Explanation:
`index` acts as the `write_index`. The `for` loop iterates with `i` as the `read_index`. If `nums[i]` is not `val`, it's copied to `nums[index]`, and `index` is incremented. This effectively shuffles all elements to be kept to the beginning of the array.





# 💥 LeetCode - `Leetcode5`: Count Primes (Sieve of Eratosthenes) 💥

## 📁 File: `Leetcode/Leetcode5.java`

## 🎯 Problem Statement
Count the number of prime numbers less than a given non-negative integer `n`.

**LeetCode Link:** [LeetCode 204. Count Primes](https://leetcode.com/problems/count-primes/)

## 🤔 Intuition
The Sieve of Eratosthenes efficiently finds primes. Start with all numbers as potentially prime. Then, for each prime found, mark all its multiples as non-prime. Numbers remaining unmarked are prime. This is like **S.H.I.E.L.D. filtering out all non-threats** by systematically eliminating multiples of known threats.

## 🛠️ Approach
* Create a boolean array `isPrime` (or `arr`) of size `n`, initialized to `true` (assuming all are prime).
* Mark `0` and `1` as non-prime (optional, as loop starts from 2).
* Iterate `i` from 2 up to `sqrt(n)`:
    * If `isPrime[i]` is true (i is prime):
        * Mark all multiples of `i` (`j = i*i` up to `n`, increment by `i`) as non-prime (`isPrime[j] = false`).
* Count all `true` values in `isPrime` array.

## 🚀 Complexity Analysis
* **Time:** `O(N log log N)` - Highly efficient for prime counting.
* **Space:** `O(N)` - For the boolean array.

### Code Explanation:
`arr` acts as `isPrime`, initialized to `true` for all numbers. The outer loop iterates through potential primes. The inner loop `for(int j=i*i; j<n; j+=i)` **marks all multiples as false**. This ensures only true primes remain `true`. The final loop simply counts these remaining `true` values.





# 💥 LeetCode - `Leetcode6`: Rotate Array (Naive) 💥

## 📁 File: `Leetcode/Leetcode6.java`

## 🎯 Problem Statement
Rotate an array to the right by `k` steps.

**LeetCode Link:** [LeetCode 189. Rotate Array](https://leetcode.com/problems/rotate-array/)

## 🤔 Intuition
Rotating by `k` steps means moving the last `k` elements to the front, and shifting the rest right. A simple approach is to repeatedly move the last element to the front, one step at a time, `k` times. This is like **Captain America repeatedly adjusting his shield** to block incoming attacks from the right.

## 🛠️ Approach
* Loop `k` times (for `k` rotations).
* In each rotation:
    * Store the last element in a `value` variable.
    * Shift all other elements one position to the right.
    * Place the stored `value` at the beginning of the array.
* Use a `print` helper to display the array.

## 🚀 Complexity Analysis
* **Time:** `O(N * K)` - `K` rotations, each shifting `N` elements.
* **Space:** `O(1)` - In-place modification.

### Code Explanation:
The outer `for` loop runs `k` times for each rotation. Inside, `value = nums[nums.length-1]` saves the last element. The inner `for` loop `j = nums.length-1; j>=i; j--` performs the shifting, moving elements one by one. `nums[i] = value` places the saved element at the front.





# 💥 LeetCode - `Leetcode7`: Add Strings 💥

## 📁 File: `Leetcode/Leetcode7.java`

## 🎯 Problem Statement
Given two non-negative integers represented as strings, return their sum as a string.

**LeetCode Link:** [LeetCode 415. Add Strings](https://leetcode.com/problems/add-strings/)

## 🤔 Intuition
Adding numbers as strings is like manual column addition. We iterate from right to left (LSB to MSB), summing digits and carrying over. A `StringBuilder` efficiently builds the result. This is like **Jarvis performing a precise multi-column calculation** for Tony.

## 🛠️ Approach
* Initialize two pointers (`l1`, `l2`) to the end of `nums1` and `nums2`.
* Initialize `carry = 0` and `StringBuilder result`.
* Loop while either pointer is valid OR `carry > 0`:
    * Get digit values, convert from char to int.
    * Calculate `sum = digit1 + digit2 + carry`.
    * Append `sum % 10` to `result`.
    * Update `carry = sum / 10`.
    * Move pointers left.
* Reverse `result` and convert to `String`.

## 🚀 Complexity Analysis
* **Time:** `O(max(L1, L2))` - Linear pass based on length of longer string.
* **Space:** `O(max(L1, L2))` - For `StringBuilder`.

### Code Explanation:
`l1` and `l2` point to current digits. The `while` loop continues until all digits and carry are processed. `nums1.charAt(l1) - '0'` converts char to int. `result.append(sum%10)` adds the current digit. `carry = sum/10` updates the carry. `result.reverse().toString()` gives the final sum in correct order.