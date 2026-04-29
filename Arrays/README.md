# 📁 Arrays in Java

This folder contains Java programs covering fundamental array operations and common algorithms like search, sort, and manipulations.

---

### 📄 `array_binarysearch.java`

> **Topic:** Binary Search on Sorted Array  
> **Intuition:** If the array is sorted, we don’t need to search linearly. We can cut the search space in half at every step — like guessing a number between 1 to 100.  
> **Approach:**
- Take input for array size and elements  
- Ask for the key to be searched  
- Apply iterative binary search (`left`, `right`, and `mid` pointers)  
- If key is found, return index; else, return -1  
> **Summary:**
- Time Complexity: O(log n)  
- Space Complexity: O(1)  
- Uses binary search efficiently on sorted data (ascending or descending — code assumes order correctness)

---

### 📄 `array_largestNum.java`

> **Topic:** Find the Largest Element in an Array  
> **Intuition:** Think of a scoreboard — we keep updating the "current best" as we go through each value.  
> **Approach:**
- Take input array from the user  
- Initialize a variable `lar` with `Integer.MIN_VALUE`  
- Loop through the array and update `lar` whenever a bigger value is found  
- Print the final `lar` as the largest number  
> **Summary:**
- Time Complexity: O(n)  
- Space Complexity: O(1)  
- Uses linear search to track the max value in a single pass

---

### 📄 `array_linearsearch.java`

> **Topic:** Linear Search in an Array  
> **Intuition:** If the data isn’t sorted, we can’t jump or skip — we check each value one by one like scanning a classroom row for a friend.  
> **Approach:**
- Traverse the array from left to right  
- Compare each element with the target `key`  
- Return the index if found, else return -1  
- Uses a small fixed-size array `{1,2,3,4,5}` for demonstration  
> **Summary:**
- Time Complexity: O(n)  
- Space Complexity: O(1)  
- Simple, effective for small or unsorted datasets

---

### 📄 `array1.java`

> **Topic:** Basic Array Creation and Access (Student Marks Example)  
> **Intuition:** Arrays store multiple values in a single variable. Like a shelf with labeled boxes — you can access each subject’s marks by its index.  
> **Approach:**
- Declared an integer array `marks[]` of size 100  
- Took input for 3 subjects: English, Maths, and Physics  
- Stored them at indices 0, 1, and 2 respectively  
- Printed marks using array indexing  
> **Summary:**
- Time Complexity: O(1) per operation  
- Space Complexity: O(n) (though only first 3 used)  
- Demonstrates how arrays can group related data (e.g., student marks)

---

### 📄 `array2.java`

> **Topic:** Arrays are Passed by Reference  
> **Intuition:** When you pass an array to a method in Java, it’s like handing over the *actual basket*, not a copy — so if you change it, it stays changed!  
> **Approach:**
- Declared and initialized an array `marks[] = {97, 95, 93}`  
- Passed it to `update()` method which incremented each value by 1  
- Printed updated marks from the original array  
- Demonstrates in-place modification through method call  
> **Summary:**
- Time Complexity: O(n)  
- Space Complexity: O(1)  
- Shows Java’s reference behavior with arrays

---

### 📄 `array2D.java`

> **Topic:** 2D Array Input and Output  
> **Intuition:** A 2D array is like a grid or chessboard — every element has a row and a column. We loop through rows and columns to fill and display the matrix.  
> **Approach:**
- Declared a 3x3 integer matrix using `int[][] array = new int[3][3]`  
- Used nested loops to take input from the user and fill the matrix  
- Printed the 2D array row-wise after input  
> **Summary:**
- Time Complexity: O(m × n)  
- Space Complexity: O(m × n)  
- Demonstrates handling of 2D arrays using nested loops

---

### 📄 `array2DQuestion1.java`

> **Topic:** Count Occurrences of a Number in 2D Array  
> **Intuition:** Just like checking every seat in a theater for a specific person — we scan each cell in the 2D array to count how many times a number appears.  
> **Approach:**
- Define a `count()` function that accepts a 2D array  
- Loop through every element using nested loops  
- Use a counter (`flag`) to increment each time the number 7 is found  
- Input array is hardcoded with two rows  
> **Summary:**
- Time Complexity: O(m × n)  
- Space Complexity: O(1)  
- Demonstrates scanning and condition-checking over 2D arrays

---

### 📄 `array2DQuestion2.java`

> **Topic:** Sum of Elements in a Specific Row of a 2D Array  
> **Intuition:** Think of rows like shelves — if you want to sum everything on the second shelf (row index 1), you just loop through its columns.  
> **Approach:**
- A 3×3 matrix is initialized in `main()`  
- `arrayNumberSum()` sums all elements in the second row (`row index = 1`)  
- Loop through all columns of row 1 and add to a `sum` variable  
> **Summary:**
- Time Complexity: O(n) (where n = number of columns)  
- Space Complexity: O(1)  
- Great example of accessing specific rows in 2D arrays

---

### 📄 `array2DQuestion3.java`

> **Topic:** Transpose of a 2D Matrix  
> **Intuition:** Transposing a matrix is like rotating the table — rows become columns and columns become rows.  
> **Approach:**
- A 2x3 matrix is given as input  
- A new array of size `[columns][rows]` is created  
- Each element at position `[i][j]` in the original matrix is placed at `[j][i]` in the new one  
- Transposed matrix is then printed row-wise  
> **Summary:**
- Time Complexity: O(m × n)  
- Space Complexity: O(m × n)  
- Demonstrates how to compute and print the transpose of a matrix

---

### 📄 `array2DSample.java`

> **Topic:** Input, Traversal, and Search Template for 2D Arrays  
> **Intuition:** A multi-purpose skeleton for working with 2D arrays — take input, search for a value, and optionally display the matrix.  
> **Approach:**
- Declares a 3x3 matrix  
- Uses nested loops to input values  
- Accepts a key to search (though not used directly in `main`)  
- Includes two helper methods:  
  - `traverse()` to print the matrix  
  - `search()` to find and return the position of a key element  
> **Note:** `search()` method is ready but not called in `main()`  
> **Summary:**
- Time Complexity: O(m × n) for traversal/search  
- Space Complexity: O(m × n)  
- Ideal starter template for most 2D array operations

---

### 📄 `arrayQues1.java`

> **Topic:** Check If Any Element Appears Exactly Twice  
> **Intuition:** Like checking a party guest list — if someone appears exactly two times, we return true.  
> **Approach:**
- Loop through each element `i` in the array  
- For each `i`, loop again to count how many times it appears  
- If any element appears **exactly twice**, return `true`  
- Otherwise, return `false`  
> **Note:** Nested loop leads to O(n²) complexity — works fine for small arrays  
> **Summary:**
- Time Complexity: O(n²)  
- Space Complexity: O(1)  
- Demonstrates frequency checking without using extra space

---

### 📄 `arrayQues3.java`

> **Topic:** Best Time to Buy and Sell Stock (Max Profit)  
> **Intuition:** Imagine buying stock at the lowest price seen so far — at each step, we ask: *"If I sell today, will I make more profit than before?"*  
> **Approach:**
- Track the **minimum buying price** seen so far (`buyPrice`)  
- At each day, if current price is higher, calculate profit  
- Update `maxProfit` if this profit is greater  
- If current price is lower than `buyPrice`, update `buyPrice`  
> **Summary:**
- Time Complexity: O(n)  
- Space Complexity: O(1)  
- Efficient one-pass solution for stock trading problems

---

### 📄 `arrayQues4.java`

> **Topic:** Trapping Rain Water  
> **LeetCode Problem:** [Trapping Rain Water – LeetCode #42](https://leetcode.com/problems/trapping-rain-water)  
> **My Solution & Explanation:** [Click here to view](https://leetcode.com/problems/trapping-rain-water/solutions/6480532/42-trapping-rain-water-using-two-pointer-uyhv)

> **Intuition:**  
Think of each bar as a wall — to trap water on top of a bar, you need a taller wall on its left **and** on its right. The water level above that bar is the **minimum of the tallest wall on each side**, minus the bar's own height.

> **Approach (Prefix-Suffix Max Arrays):**
1. Create two arrays:
   - `start[i]`: the max height from the left up to index `i`
   - `end[i]`: the max height from the right up to index `i`
2. For every bar, compute the water it can hold:  
   `water = min(start[i], end[i]) - height[i]`  
3. Only add water if the result is positive.
4. Sum it up for all indices.

> **Summary:**
- ✅ Time Complexity: `O(n)`  
- ✅ Space Complexity: `O(n)`  
- ✅ Easy to understand and great for interviews.  
- ⚠️ Can be optimized to `O(1)` space using two pointers (see my LeetCode solution above).

---

### 📄 `arrayQues5.java`

> **Topic:** Find All Triplets with Sum = 0 (3Sum Problem)  
> **LeetCode Problem:** [3Sum – LeetCode #15](https://leetcode.com/problems/3sum)

> **Intuition:**  
Imagine choosing every possible group of 3 numbers (triplet) from the array and checking if they form a "peaceful triangle" — i.e., their sum is zero. That’s what we’re doing here using three nested loops.

> **Approach:**
- Loop with three pointers `i`, `j`, `k` such that `i < j < k`
- For every unique combination, check if `num[i] + num[j] + num[k] == 0`
- If yes, print the triplet
- Since we manually enforce distinct indices, it avoids repetition from the same position

> **Limitations:**
- Does not handle duplicate triplets (e.g., it might print `[-1, 0, 1]` multiple times)
- Brute-force — not suitable for large inputs

> **Summary:**
- 🔁 Time Complexity: `O(n³)`  
- 💾 Space Complexity: `O(1)`  
- 📚 Best used to understand the logic behind the 3Sum problem before optimizing

> 💡 Note: Can be optimized to `O(n²)` using sorting and two pointers — see LeetCode’s editorial or optimized discussions.

---

### 📄 `but_sell_stock.java`

> **Topic:** Best Time to Buy and Sell Stock (Max Profit Problem)  
> **LeetCode Problem:** [Best Time to Buy and Sell Stock – LeetCode #121](https://leetcode.com/problems/best-time-to-buy-and-sell-stock)

> **Intuition:**  
Imagine you’re Thanos watching stock prices through the Infinity Gauntlet. The goal? Snap your fingers at the *best* time to **buy at the lowest** and **sell at the highest after buying** to get max profit. But you can only buy **once** and sell **once**.

> **Approach:**
- Initialize `buyPrice` to infinity.
- Traverse the array:
  - If the current price is lower than `buyPrice`, update `buyPrice`.
  - Else calculate the `profit = currentPrice - buyPrice` and update `maxProfit` if this profit is higher than previous.
- Finally return `maxProfit`.

> **Summary:**
- ✅ Time Complexity: `O(n)` — single pass
- ✅ Space Complexity: `O(1)` — only variables used
- ✅ Efficient and easy to understand
- ⚠️ Assumes that profit must be made by buying before selling.

> 💡 Tip: This is one of the most famous and frequently asked interview problems. Know this one well!

---

### 📄 `largest_number.java`

> **Topic:** Find the Largest Number in an Array

> **Intuition:**  
Say Iron Man wants to scan all enemy power levels and shout out the strongest one.  
We do exactly that — traverse the array and track the biggest number so far.

> **Approach:**
- Start with `largest = Integer.MIN_VALUE` (i.e., the smallest possible number).
- Loop through the array:
  - If the current number is greater than `largest`, update it.
- Finally, print the `largest`.

---

### 📄 `max_subarray_Sum_prefix.java`

> **Topic:** Maximum Subarray Sum using Prefix Sum  
> **Related Concept:** Kadane’s Algorithm (more optimized)

> **Intuition:**  
Imagine you’re Thor trying to find the stretch of sky where your lightning strike does *maximum damage*. You scan every subarray and calculate its total power (sum). But doing it from scratch every time is tiring (O(n³)), so we summon the power of **prefix sums** — which helps us find any subarray sum in `O(1)` time!

> **Approach:**
1. Build a prefix sum array:
   - `prefix[i] = prefix[i-1] + array[i]`
2. Use nested loops:
   - Outer loop for subarray start index.
   - Inner loop for end index.
   - Subarray sum is calculated using:
     ```
     sum = (start == 0) ? prefix[end] : prefix[end] - prefix[start-1];
     ```
3. Keep track of the max sum while traversing all pairs.

> **Summary:**
- ⏱️ Time Complexity: `O(n²)` (better than brute force `O(n³)`)
- 🧠 Space Complexity: `O(n)` (for prefix array)
- 🧲 Great stepping stone before learning Kadane’s Algorithm


---

### 📄 `max_subarray_sum.java`

> **Topic:** Maximum Subarray Sum using Brute Force  
> **Related To:** Sliding Window (for optimization), Kadane’s Algorithm

> **Intuition:**  
Imagine you're Hulk — not thinking too much, just smashing through every subarray, calculating their total, and checking which one has the **maximum destruction level** (sum). This brute-force approach literally checks **every possible subarray**. Simple but powerful!

> **Approach:**
1. Use three nested loops:
   - Outer loop `i`: start of the subarray
   - Middle loop `j`: end of the subarray
   - Inner loop `k`: sum elements from `i` to `j-1`
2. After each subarray, compare the current sum with `max`.
3. Print the elements of each subarray too (for clarity during dry run).


> **Summary:**
- ⏱️ Time Complexity: `O(n³)` — not efficient but great for understanding
- 🧠 Space Complexity: `O(1)`
- 📚 Ideal for beginners to visualize how subarrays work before moving to prefix/Kadane’s

> 🔗 For optimized versions, check:
- `max_subarray_Sum_prefix.java` (O(n²))
- *Kadane’s Algorithm* (O(n)) — coming soon? 😉

---
---

### 📄 `max_subarray_sumkadane.java`

> **Topic:** Maximum Subarray Sum using Kadane's Algorithm  
> **Related To:** Dynamic Programming, Sliding Window, Interview Gold Standard

> **Intuition:**  
Think of this as Iron Man’s version of brute-force Hulk smash — *efficient and intelligent*.  
Instead of checking all subarrays, we *carry forward* the useful stuff and *drop the negativity* like Tony drops toxicity.  
We keep a running total (`current`) and if it ever becomes negative, we toss it — because a negative sum only makes things worse!

> **Approach:**
1. Initialize:
   - `max_sum` to track the best subarray sum so far.
   - `current` to keep running sum.
2. Traverse the array:
   - Add each element to `current`.
   - If `current` becomes negative, reset it to 0.
   - At each step, update `max_sum = max(current, max_sum)`.
3. Handle special case:
   - If **all elements are negative**, return the *maximum negative* (least bad number) instead of 0.


> **Summary:**
- 🧠 Time Complexity: `O(n)` — super efficient!
- 🪶 Space Complexity: `O(1)`
- 👑 Best approach for subarray sum problems
- 🔥 Handles negative-only arrays with extra logic

> 🧪 Pro Tip:  
Want the subarray too? Maintain `start` and `end` indexes where updates to `current` and `max_sum` happen.

---

---

### 📄 `pairs_array.java`

> **Topic:** Printing All Pairs in an Array  
> **Concepts Used:** Nested Loops, Pair Generation, Basic Iteration

> **Intuition:**  
Let’s say Tony Stark invites all Avengers to a party. Now he wants to shake hands with every possible teammate — but just once.  
This program mimics that!  
We generate every possible *unique pair* `(i, j)` in the array such that `i < j`.

> **Approach:**
1. Read `size` of the array and input elements from the user.
2. In the `pair()` function:
   - Use two nested loops.
   - Outer loop (`i`) picks each element one by one.
   - Inner loop (`j`) pairs it with every element that comes *after* it.
   - Print each pair in `(a, b)` format.

> **Complexity:**
- 🧠 Time Complexity: `O(n^2)`
- 🪶 Space Complexity: `O(1)`

> ⚠️ Note:  
Avoid calling `Scanner.close()` multiple times as it can throw exceptions or interfere with input reading. Ideally, use a single scanner instance across the whole code or close it only in `main()`.

---

---

### 📄 `PrefixSum.java`

> **Topic:** Maximum Subarray Sum using Prefix Sum  
> **Concepts Used:** Prefix Sum, Subarray Sum Optimization

> **Intuition:**  
Suppose you're tracking your mood swings over a week — some days you're up (+6), some days you're low (-2). The goal? Find the *best continuous stretch* (subarray) where your total mood was highest.  
Prefix Sum helps you avoid recalculating things again and again.

> **Approach:**  
1. Construct a `prefix[]` array such that `prefix[i] = sum of all elements from index 0 to i`.
2. For every subarray `(i, j)`:
   - Compute sum using:  
     `prefix[j] - prefix[i-1]` (if `i > 0`),  
     or just `prefix[j]` if `i == 0`.
3. Track the max sum across all subarrays.

> **Why Use Prefix Sum?**  
- Reduces subarray sum calculation from `O(n)` to `O(1)` once the prefix is built.
- Total time complexity: `O(n^2)` (due to all subarrays),  
  but much faster than the `O(n^3)` brute force version.

> 😄 Real-World Take:  
This is like trying to spot which week you made the most profit — not by checking each day's total again and again, but by keeping running totals. Basically, you stop being the guy who does mental math in a grocery store queue.

---

---

### 📄 `reverse_array.java`

> **Topic:** Reversing an Array  
> **Concepts Used:** Two-pointer approach, In-place swapping

> **Intuition:**  
You have an array, say `{1, 2, 3, 4, 5}` — and want to flip it like a pancake into `{5, 4, 3, 2, 1}`. The goal is to reverse it *in-place*, i.e., without using another array.

> **Approach:**  
- Initialize two pointers:
  - `start` at 0 (beginning of the array)
  - `end` at `length - 1` (end of the array)
- Swap elements at `start` and `end`, then move both inward:
  - `start++`, `end--`
- Repeat this until `start < end`

> **Time Complexity:** `O(n)`  
> **Space Complexity:** `O(1)`  
> In-place means **no extra space**, which makes your solution memory efficient.

> 🛠️ Real World Take:  
Reversing an array is like flipping a playlist from end to start — no fancy logic, just swap ends and walk toward the middle. Useful when your boss says, “Let’s look at the numbers from the other side.”

> ⚠️ Extra Tip:  
Always validate array bounds and handle edge cases (like empty arrays or single-element arrays). This code does it well.

---

---

### 📄 `reverse_orig.java`

> **Topic:** Reversing a Number (Digit-wise)  
> **Concepts Used:** Modulo `%`, Integer Division `/`, Loops

> **🔍 Intuition:**  
You’re given a number, say `12345`, and your job is to flip it to `54321`. Think of it as peeling off digits from the end and sticking them at the front of a new number.

> **🚀 Approach:**  
- Take the input number `n`
- Loop until `n` becomes 0:
  - Extract the last digit using `n % 10` (remainder)
  - Add it to the `rev` after shifting `rev` left (multiply `rev` by 10 and add remainder)
  - Reduce `n` using `n /= 10`
- Print the reversed number.

> **💡 Logic in Code Terms:**
```java
rem = n % 10;       // get last digit  
rev = rev * 10 + rem; // shift digits and add new  
n = n / 10;         // drop the last digit  


---

### 📄 `reverse2.java`

> **Topic:** Reversing a Number Digit-by-Digit (without storing the result)  
> **Concepts Used:** Looping with `for`, Integer Division `/`, Modulo `%`

> **🔍 Intuition:**  
Sometimes you just want to see the reverse digits of a number without worrying about storing it in a variable like `rev`. Just print as you go!

This is perfect for direct-output tasks like displaying reversed digits on-the-fly — maybe you're debugging, maybe you're flexing.

> **🚀 Approach:**  
- Accept an integer `n` from the user.
- Run a loop from `i = n` down to `0`, dividing `i` by 10 in each step.
- In each step, print `i % 10`, which gives the last digit.
- Special handling if digit is `0`, but honestly not strictly necessary here.

> **🧠 Logic in Code Terms:**
```java
for(int i = n; i != 0; i /= 10) {
    System.out.print(i % 10);
}


---

### 📄 `reverseof_num.java`

> **Topic:** Reverse a Number using While Loop and Method 1  
> **Concepts Used:** Loops (`while`), Modulo `%`, Integer Division `/`, Variables

> **🔍 Intuition:**  
When you reverse a number, you are peeling off its digits from the end one by one, stacking them in reverse order. This is exactly what we simulate here using a `while` loop.



> **🚀 Approach:**
1. Get a number `n` from the user.
2. Use a temporary variable `i` to store the current working value.
3. Initialize `rev = 0` (to build the reversed number).
4. In each iteration:
   - Get the last digit using `rem = i % 10`.
   - Append to reverse using `rev = rev * 10 + rem`.
   - Remove the last digit: `i = i / 10`.
5. When `i` becomes 0, you have your reversed number.


---
### 📄 `reverseof_num1.java`

> **Topic:** Reversing Number Digits and Printing Directly (using `while` loop)  
> **Concepts Used:** Loops (`while`), Modulo `%`, Integer Division `/`, Input with `Scanner`

> **🔍 Intuition:**  
If you want to see the digits of a number reversed without storing them, just peel them off one by one and print as you go. Like unwrapping candies and showing each to your friend instantly.

> **🚀 Approach:**  
- Take the number `n` from the user.  
- Use a `while` loop to run until the number becomes zero.  
- In each iteration, check if last digit is zero — print `0` explicitly, else print the digit `(i % 10)`.  
- Divide the number by 10 to drop the last digit and repeat.

> **🧠 Logic in Code Terms:**


### 📄 `revision.java`

> **Topic:** Printing All Subarrays of an Array  
> **Concepts Used:** Nested loops, array traversal, printing elements

> **🔍 Intuition:**  
Think of the array like a box of Avengers trading cards. You want to show every possible continuous group of cards to your buddy — from single cards to the whole squad. That’s basically what subarrays do.

> **🚀 Approach:**  
- Use one loop to pick where your mini-team (subarray) starts.  
- Use another loop to pick where it ends — because sometimes you want Iron Man solo, sometimes you want the whole Avengers lineup.  
- Then just parade those cards (elements) out for everyone to see.

---

> **Heads up:**  
Warning: The number of subarrays grows faster than Tony Stark’s ego after a successful mission. For an array of size `n`, you’re looking at roughly `n*(n+1)/2` subarrays. So buckle up, it’s gonna be a wild printout!


### 📄 `spiralMatrix.java`

> **Topic:** Printing a Matrix in Spiral Order  
> **Concepts Used:** 2D arrays, nested loops, boundary tracking

> **🔍 Intuition:**  
Imagine you’re Tony Stark navigating the halls of the Avengers Tower — starting at the top-left, moving right, then down, then left, then up, looping inward until you’ve seen every room. That’s how spiral traversal works on a matrix.

> **🚀 Approach:**  
- Keep four pointers: `rowStart`, `rowEnd`, `columnStart`, and `columnEnd` to mark the current edges of the matrix you haven’t traversed yet.  
- Print the top row from left to right, then the rightmost column top to bottom, then the bottom row right to left, and finally the leftmost column bottom to top.  
- After completing the outer loop, move the pointers inward and repeat until all layers are printed.

---

> **Heads up:**  
Watch out for edge cases when your start and end pointers cross — that’s when the spiral is complete, kind of like how Tony wraps up his suits after a mission.


### 📄 `StablePartition.java`

> **Topic:** Checking if a Triplet Can Form a Triangle  
> **Concepts Used:** Arrays, sorting, simple logic checks, input handling

> **🔍 Intuition:**  
Think of this like Tony Stark trying to build a stable triangular shield from three rods. If the sum of any two rods is greater than the third, the triangle holds — otherwise, the shield’s gonna flop.

> **🚀 Approach:**  
- Take multiple test cases as input.  
- For each array, sort the sticks (rods) so it’s easier to check combinations.  
- Walk through the array and check if any three consecutive sticks can form a triangle by the triangle inequality rule.  
- Print “YES” if possible, otherwise “NO”.

> **⏳ Complexity:**  
- Sorting: O(n log n)  
- Single pass check: O(n)  
- Overall: O(n log n)

> **🔗 Related LeetCode Problem:**  
[Valid Triangle Number](https://leetcode.com/problems/valid-triangle-number/)

---

> **Heads up:**  
Sorting is like lining up the Avengers by height — makes checking conditions way simpler. And if you find just one valid trio, you can stop looking, because sometimes less is more (except for suits).


### 📄 `subarray.java`

> **Topic:** Generating and Printing All Contiguous Subarrays  
> **Concepts Used:** Nested loops, array traversal, user input with Scanner

> **🔍 Intuition:**  
Imagine you have a magical Infinity Gauntlet that can show every possible continuous combo of stones you hold — one stone alone, pairs, triples, all the way up to the full set. This code just flexes every possible continuous subarray of your array.

> **🚀 Approach:**  
- Take input size and array elements from the user.  
- Use three nested loops:  
  - Outer loop to pick the start index.  
  - Inner loops to build and print all continuous subarrays starting at that index.  
- Print each subarray as a group with commas and braces, like showing off your collection.

> **⏳ Complexity:**  
- Time: O(n³) because of three nested loops (start, end, print elements).  
- Space: O(n) for storing input array.

> **🔗 Related LeetCode Problem:**  
[Subarrays With K Different Integers](https://leetcode.com/problems/subarrays-with-k-different-integers/) *(not exact but deals with subarrays)*

---

> **Heads up:**  
Be careful — this code prints a lot if your array is big. Like the Hulk smashing things, nested loops can get wild fast.


### 📄 `trapped_water.java`

> **Topic:** Calculating Trapped Rain Water Using Auxiliary Arrays  
> **Concepts Used:** Arrays, prefix/suffix max arrays, traversal, min/max functions

> **🔍 Intuition:**  
Imagine Tony Stark building barriers to trap water between skyscrapers. For each building, the water it can hold depends on the tallest barrier to its left and right. This code creates two “helper” arrays that keep track of those tallest walls from each side, then calculates trapped water.

> **🚀 Approach:**  
- Build `left_max` array where each element stores the highest building seen so far from the left.  
- Build `right_max` array where each element stores the highest building seen so far from the right.  
- For each position, trapped water is the minimum of `left_max` and `right_max` minus the building’s height.  
- Sum all trapped water amounts.

> **⏳ Complexity:**  
- Time: O(n) — we only traverse arrays a few times.  
- Space: O(n) — extra arrays for `left_max` and `right_max`.

> **🔗 Related LeetCode Problem:**  
[Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)

---

> **Heads up:**  
This approach is like Iron Man’s suit — efficient and clever, but watch out for those pesky loop boundaries (that `for` loop with `i--` should be fixed or it’s like Jarvis going haywire).


### 📄 `trapped_water1.java`

> **Topic:** Calculating Trapped Rain Water Using Two Auxiliary Arrays (Compact Version)  
> **Concepts Used:** Arrays, prefix/suffix max arrays, traversal, min/max functions

> **🔍 Intuition:**  
Think of this like Captain America lining up defenses on both sides of a battlefield. Each building’s water trapped depends on the tallest barrier on the left and right — the code precomputes those and then figures out how much water gets caught.

> **🚀 Approach:**  
- Build a `leftmost` array tracking max height from the left side.  
- Build a `rightmost` array tracking max height from the right side.  
- For each position, trapped water = min of left and right max minus the building height.  
- Sum all these up.

> **⏳ Complexity:**  
- Time: O(n) — just three passes through the array.  
- Space: O(n) — two extra arrays for precomputed max heights.

> **🔗 Related LeetCode Problem:**  
[Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)

---

> **Heads up:**  
Watch the loop boundaries carefully, or you might get a Hulk-sized mess. Counting backwards means `i` should go down, not up.


### 📄 `trapped_water2.java`

> **Topic:** Trapping Rain Water with Correct Loop Directions  
> **Concepts Used:** Arrays, prefix/suffix max arrays, traversal, min/max functions

> **🔍 Intuition:**  
Picture Black Widow stealthily scanning the battlefield from left and right, marking the highest points she sees. Those mark the walls where water can be trapped between buildings. This code follows that plan: left to right, right to left, then calculates trapped water.

> **🚀 Approach:**  
- Build `leftmax` array storing the highest bar from the left up to each point.  
- Build `rightmax` array storing the highest bar from the right up to each point (looping backwards).  
- For every position, trapped water = min(leftmax, rightmax) - current height.  
- Sum it all up.

> **⏳ Complexity:**  
- Time: O(n) — linear scans, nothing fancy.  
- Space: O(n) — two helper arrays.

> **🔗 Related LeetCode Problem:**  
[Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)

---

> **Heads up:**  
Remember, loops going backwards need a steady hand — like Hawkeye’s arrow — or you’ll overshoot your target.
