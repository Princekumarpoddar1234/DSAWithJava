# 💥 Control Flow - `loop_check`: Custom For Loop Increment 💥

## 📁 File: `ControlFlow/loop_check.java`

## 🎯 Problem Statement
Demonstrate a `for` loop where the loop counter is incremented by more than one in each iteration, affecting the number of repetitions.

**LeetCode Link:** Not applicable (basic loop behavior).

## 🤔 Intuition
A `for` loop's iteration can be controlled not just by its built-in incrementer, but also by explicit changes to the loop variable *inside* the loop. This allows for non-standard step sizes, like **Iron Man's thrusters applying custom bursts of energy** instead of a continuous burn.

## 🛠️ Approach
* Use a `for` loop with standard initialization (`i=0`) and condition (`i<5`).
* Inside the loop body, print "Hello".
* Explicitly increment `i` by 2 (`i+=2`).

## 🚀 Complexity Analysis
* **Time:** `O(1)` - Loop runs a fixed, small number of times (e.g., for `i=0, 3`).
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The `for` loop's `i++` runs, but `i+=2` *inside* the loop further increments `i`. This means `i` increases by 3 in total per iteration (e.g., `0 -> 3 -> 6`), causing the loop to run fewer times than expected from `i<5` alone.





# 💥 Control Flow - `sumof_n`: Sum of First N Natural Numbers 💥

## 📁 File: `ControlFlow/sumof_n.java`

## 🎯 Problem Statement
Calculate the sum of the first `n` natural numbers using a `while` loop.

**LeetCode Link:** Not applicable (basic arithmetic loop).

## 🤔 Intuition
To sum numbers from 1 to `n`, we can iteratively add each number to a running total. A `while` loop is perfect for this repetitive addition, continuing as long as the counter is less than or equal to `n`. This is like **Captain America assembling his team members one by one**, each contributing to the total strength.

## 🛠️ Approach
* Get integer `n` from the user.
* Initialize `i = 1` and `sum = 0`.
* Use a `while` loop that continues as long as `i <= n`.
    * Add `i` to `sum`.
    * Increment `i`.
* Print the final `sum`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Linear iterations proportional to `N`.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The `while(i <= n)` loop ensures iteration from 1 up to `n`. Inside, `sum+=i` accumulates the sum, and `i++` progresses the counter. This directly implements the iterative summation.





# 💥 Control Flow - `while1`: Print "Hello" N Times 💥

## 📁 File: `ControlFlow/while1.java`

## 🎯 Problem Statement
Print the word "Hello" a specified number of times (`n`) using a `while` loop.

**LeetCode Link:** Not applicable (basic loop usage).

## 🤔 Intuition
A `while` loop repeatedly executes a block of code as long as a condition remains true. It's ideal for tasks where the number of repetitions is determined dynamically, like **Jarvis reiterating a command** until it's confirmed.

## 🛠️ Approach
* Get integer `n` from the user.
* Initialize a counter `i` to 0.
* Use a `while` loop that continues as long as `i < n`.
    * Print "Hello".
    * Increment `i`.
* Print a success message and close the `Scanner`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Linear iterations proportional to `N`.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The `while(i < n)` loop controls the repetitions. `System.out.println("Hello")` prints the message. `i++` increments the counter, bringing it closer to the loop's termination condition.





# 💥 Control Flow - `while2`: Print Numbers 1 to 10 💥

## 📁 File: `ControlFlow/while2.java`

## 🎯 Problem Statement
Print natural numbers from 1 to 10 using a `while` loop.

**LeetCode Link:** Not applicable (basic loop usage).

## 🤔 Intuition
A `while` loop is suitable for tasks requiring repeated actions until a specific condition is met. Here, we iterate and print as long as our counter is within the desired range. This is like **Iron Man's flight counter**: incrementing each unit of distance until the target is reached.

## 🛠️ Approach
* Initialize a counter `i` to 1.
* Use a `while` loop that continues as long as `i <= 10`.
    * Print the current value of `i`.
    * Increment `i`.

## 🚀 Complexity Analysis
* **Time:** `O(1)` - Fixed number of iterations (10).
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The `while(i <= 10)` loop ensures the numbers are printed from 1 up to 10. `System.out.println(i)` prints the current number, and `i++` increments the counter for the next iteration.




# 🔄 Do-While Loop Example (`do_while.java`)

## 📁 File: `do_while.java`

## 🎯 Program Objective
This simple Java program demonstrates the use of a **`do-while` loop**. It prints the string "Hello" a fixed number of times.

---

## 🧠 How it Works (Intuition)
The `do-while` loop is a control flow statement that executes a block of code at least once, and then repeatedly executes the block as long as a given condition is true.

Key characteristics of `do-while`:
1.  **Guaranteed First Execution:** The code inside the `do` block runs *before* the `while` condition is checked.
2.  **Conditional Repetition:** After the first execution, the `while` condition is evaluated. If it's `true`, the `do` block executes again. This continues until the `while` condition becomes `false`.

In this program, "Hello" is printed first, then the counter `i` is incremented. This process repeats as long as `i` is less than or equal to 5.

---






# 💥 Control Flow - `while3`: Print Numbers 1 to N 💥

## 📁 File: `ControlFlow/while3.java`

## 🎯 Problem Statement
Print natural numbers from 1 up to a user-defined integer `n` using a `while` loop.

**LeetCode Link:** Not applicable (basic loop usage).

## 🤔 Intuition
A `while` loop is effective for iterating a sequence whose upper bound is dynamic (user-defined). We increment a counter and print until it exceeds `n`. This is like **Captain America counting down targets**: each one is dispatched until the mission's total `n` is reached.

## 🛠️ Approach
* Get integer `n` from the user.
* Initialize a counter `i` to 1.
* Use a `while` loop that continues as long as `i <= n`.
    * Print the current value of `i`.
    * Increment `i`.
* Print a success message and close the `Scanner`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Linear iterations proportional to `N`.
* **Space:** `O(1)` - No extra space.

### Code Explanation:
The `while(i <= n)` loop ensures that numbers from 1 to `n` (inclusive) are printed. `System.out.println(i)` displays the current number, and `i++` progresses the counter.