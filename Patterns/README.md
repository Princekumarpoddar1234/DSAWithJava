# 💥 Patterns - `pattern1`: Half Pyramid with Numbers 💥

## 📁 File: `Patterns/pattern1.java`

## 🎯 Problem Statement
Print a right-angled half pyramid pattern where each row consists of sequential numbers.

**LeetCode Link:** Not applicable (basic pattern printing).

## 🤔 Intuition
This pattern builds rows incrementally, with each row `i` printing numbers from 1 to `i`. Nested loops handle this: the outer loop controls rows, the inner loop controls numbers within each row. This is like **Jarvis counting off sequential systems during a power-up sequence**.

## 🛠️ Approach
* Outer loop `line` from 1 to 4 (for rows).
* Inner loop `count` from 1 to `line` (for numbers in current row).
    * Print `count`.
* Print a newline after each row.

## 🚀 Complexity Analysis
* **Time:** `O(N^2)` - Nested loops, where `N` is the number of lines.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The outer `for` loop iterates through each `line`. The inner `for` loop `for(int count=1; count<=line; count++)` is crucial: it prints numbers from `1` up to the current `line` number, forming the increasing rows of the pyramid.





# 💥 Patterns - `pattern2`: Half Pyramid with Increasing Characters 💥

## 📁 File: `Patterns/pattern2.java`

## 🎯 Problem Statement
Print a right-angled half pyramid pattern where each row consists of sequentially increasing characters, starting from 'A'.

**LeetCode Link:** Not applicable (basic pattern printing).

## 🤔 Intuition
This pattern uses nested loops to form a pyramid, but instead of numbers, it prints characters. A single character variable increments globally, ensuring a continuous sequence across all rows. This is like **S.H.I.E.L.D. assigning sequential alphanumeric codes** to new recruits, regardless of which team they join.

## 🛠️ Approach
* Initialize `char ch = 'A'`.
* Outer loop `line` from 1 to 4 (for rows).
* Inner loop `chars` from 1 to `line` (for characters in current row).
    * Print `ch`.
    * Increment `ch`.
* Print a newline after each row.

## 🚀 Complexity Analysis
* **Time:** `O(N^2)` - Nested loops, where `N` is the number of lines.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The outer `for` loop controls the rows. The inner `for` loop iterates `line` times. `System.out.print(ch)` prints the current character, and `ch++` globally increments it, ensuring the next character printed (even on a new line) is the next in sequence.





# 💥 Patterns - `square_pattern`: Solid Square Pattern 💥

## 📁 File: `Patterns/square_pattern.java`

## 🎯 Problem Statement
Print a solid square pattern of asterisks (`*`) using a `for` loop.

**LeetCode Link:** Not applicable (basic pattern printing).

## 🤔 Intuition
A solid square pattern involves printing the same row of asterisks repeatedly. A simple `for` loop iterating a fixed number of times is sufficient for this, like **Captain America assembling a perfect square formation of his shield-wielding soldiers.**

## 🛠️ Approach
* Use a `for` loop from `i=1` to 4.
* Inside the loop, print the string `"* * * *"`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Linear with the number of rows (here, 4).
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The `for` loop runs 4 times. In each iteration, `System.out.println("* * * *")` prints a fixed line of four asterisks, effectively forming a 4x4 solid square pattern.





# 💥 Patterns - `star1`: Half Pyramid with Stars 💥

## 📁 File: `Patterns/star1.java`

## 🎯 Problem Statement
Print a right-angled half pyramid pattern of asterisks (`*`).

**LeetCode Link:** Not applicable (basic pattern printing).

## 🤔 Intuition
This pattern builds rows incrementally, with each row `i` having `i` stars. Nested loops control this: the outer loop for rows, the inner loop for printing stars in the current row. This is like **Iron Man's arc reactor progressively increasing its glow**, layer by layer.

## 🛠️ Approach
* Outer loop `line` from 1 to 4 (for rows).
* Inner loop `star` from 1 to `line` (for stars in current row).
    * Print `*`.
* Print a newline after each row.

## 🚀 Complexity Analysis
* **Time:** `O(N^2)` - Nested loops, where `N` is the number of lines.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The outer `for` loop iterates through each `line`. The inner `for` loop `for(int star=1; star<=line; star++)` is crucial: it prints `star` (`*`) `line` number of times, forming the increasing rows of the pyramid.





# 💥 Patterns - `star2`: Inverted Half Pyramid with Stars 💥

## 📁 File: `Patterns/star2.java`

## 🎯 Problem Statement
Print an inverted right-angled half pyramid pattern of asterisks (`*`).

**LeetCode Link:** Not applicable (basic pattern printing).

## 🤔 Intuition
This pattern starts with many stars and reduces them per row. For `N` lines, row `i` (1-indexed) prints `N - i + 1` stars. Nested loops control rows and stars. This is like **Captain America assembling his shield with decreasing layers**, starting from the full width.

## 🛠️ Approach
* Outer loop `line` from 1 to 4 (for rows).
* Inner loop `star` from 1 to `(4 - line + 1)` (for stars in current row).
    * Print `*`.
* Print a newline after each row.

## 🚀 Complexity Analysis
* **Time:** `O(N^2)` - Nested loops, where `N` is the number of lines.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The outer `for` loop iterates through each `line`. The inner `for` loop `for(int star=1; star<=(4-line+1); star++)` is crucial: `(4-line+1)` dynamically calculates the decreasing number of stars per line, forming the inverted pyramid.