## 🔙 Backtracking Problems

---

### 🔹 `Backtracking1.java`  
> **🧾 Problem:** Fill an array recursively, then use backtracking to roll back changes.  
> **⏱️ Complexity:** `Time:` O(n) &nbsp;&nbsp;&nbsp; `Space:` O(n) (due to recursion stack)  
> **📚 Concepts Used:** Recursion, Backtracking, Arrays  

> **🧠 Intuition:**  
We’re filling an array step-by-step, starting from index 0, using recursion. Once we hit the base case (i.e., we’ve filled all elements), we print the array.  

But here’s the twist: after printing, we “undo” the last assignment by changing the value — this is what we call **backtracking**.

Still stuck? Think of it like setting up chairs for guests. You put all chairs in place (fill the array), then suddenly someone says — “We need to change the last one to a bean bag.” So, you go back and tweak the last seat 🍿🪑.

---

> **⚙️ Approach:**  
- Start from index `i = 0`.  
- Assign `arr[i] = val`.  
- Recursively go to the next index with `val + 1`.  
- When the array is full, print it.  
- Then, on the way back (as recursion unwinds), change `arr[i] = val - 2` just to demonstrate rollback.

This helps visualize how recursion fills values forward ⏩, and backtracking rolls them back ⏪ — kind of like writing with a pencil and then erasing to rewrite something new ✏️.

---


---

### 🔹 `Backtracking2.java`  
> **🧾 Problem:** Print all subsets of a given string using recursion (aka Power Set).  
> **⏱️ Complexity:** `Time:` O(2ⁿ) &nbsp;&nbsp;&nbsp; `Space:` O(n) (recursive call stack)  
> **📚 Concepts Used:** Recursion, Backtracking, Subsets  

> **🧠 Intuition:**  
You're at a buffet and for every item you see, you get two choices: *“Add it to my plate 🍛”* or *“Skip it 🍽️.”*  
This code does the same for each character in the string. At every index `i`, we ask:
- Do we **include** `str[i]` in our subset?
- Or do we **exclude** it?

It’s that simple — binary decisions at every step lead to `2^n` possibilities.  
And don’t worry — if the final subset is empty, we print `"null"` (because Java won’t give us an actual void to stare into 😅).

---

> **⚙️ Approach:**  
1. Start with an empty answer `ans = ""` and index `i = 0`.  
2. At each index, make two recursive calls:  
   - One with `str[i]` added to `ans`  
   - One without it  
3. Continue this until `i == str.length()`.  
4. Print the `ans`. If it’s empty, print `"null"`.

This is a depth-first exploration of all inclusion/exclusion combinations. You’ll see all possible subsets, from full strings to empty sets.

If you're feeling lost, just pretend it's your wardrobe and you're trying all possible combinations of T-shirts — yes, even the one you wore during last semester's viva. 😅👕

---

---

### 🔹 `BackTracking3.java`  
> **🧾 Problem:** Generate all permutations of a given string using recursion.  
> **⏱️ Complexity:** `Time:` O(n × n!) &nbsp;&nbsp;&nbsp; `Space:` O(n) (due to recursion stack and substring creation)  
> **📚 Concepts Used:** Recursion, Backtracking, String Manipulation  

> **🧠 Intuition:**  
Permutations are just all the ways you can rearrange things. Imagine writing your name on a form but mixing up the letters every time — that's what this code does, only systematically.

At each step:
- You pick a character `curr` from the string.
- Remove it from the original.
- Append it to your `ans`.
- Recurse with the rest.

It’s like musical chairs — every character gets a turn to sit in every position. 🎶🪑  
And yes, substring juggling here feels like cutting up a pizza and trying every slice in every possible order (don’t try this at home).

---

> **⚙️ Approach:**  
1. Start with the original string `str` and an empty `ans`.  
2. Loop through each character in `str`:  
   - Pick one character (`curr`)  
   - Remove it to form `str1`  
   - Add `curr` to `ans`  
   - Recurse with `str1` and new `ans`  
3. When `str.length() == 0`, print the `ans`.

Each level of recursion represents a decision: “Which character should I fix next in the permutation?”

---


---

### 🔹 `BackTracking4.java`  
> **🧾 Problem:** Place N queens on an N×N chessboard such that no two queens attack each other.  
> **⏱️ Complexity:** `Time:` O(N!) &nbsp;&nbsp;&nbsp; `Space:` O(N²) (board + recursion stack)  
> **📚 Concepts Used:** Backtracking, 2D Arrays, Recursion, Chess Logic  

> **🧠 Intuition:**  
At each row, try placing a queen in every column. But here’s the catch — no two queens can attack each other 🐍♟️. So we need to check:
- No other queen in the same column (vertical 🔽)
- No other queen in top-left diagonal (↖)
- No other queen in top-right diagonal (↗)

Place the queen **only if it’s safe**. Then move to the next row.  
If placing a queen leads to no valid placement later, **backtrack** — remove it, and try the next column.

It's like trying to assign seats at a royal dinner where no two queens want to sit where they might glare at each other 👑😤 — pure drama.

---

> **⚙️ Approach:**  
1. Start from row 0.  
2. For each column in that row, check if it’s **safe** to place a queen:  
   - No queen in the same column  
   - No queen on the top-left diagonal  
   - No queen on the top-right diagonal  
3. If safe, place `'Q'` and move to the next row.  
4. After recursive call, remove the queen (`backtrack` by placing `'x'` or `'.'`).  
5. Once `row == board.length`, print the board (a valid configuration).  

> ⚠️ Note: With `n = 2`, **no valid arrangement** exists. But this code still walks through all possibilities — a great debug+learning scenario!

---


---

### 🔹 `Backtracking5.java`  
> **🧾 Problem:** Count the number of ways to place N queens on an N×N chessboard so that no two queens attack each other.  
> **⏱️ Complexity:** `Time:` O(N!) &nbsp;&nbsp;&nbsp; `Space:` O(N²) (due to board + recursion stack)  
> **📚 Concepts Used:** Backtracking, Recursion, N-Queens, Combinatorics  

> **🧠 Intuition:**  
Same classic N-Queens logic — but now instead of printing each beautiful solution like a proud artist 🎨, we're quietly counting how many valid paintings exist in the gallery 🖼️.

At every row, we try to place a queen in all possible columns. If the spot is safe (no queen in the column or diagonals), place it, recurse for the next row, and backtrack after that.  
Every time we reach the base case (i.e., `row == board.length`), we increment a global `count`.

This is less about drama on the board and more about quietly building up a winning score behind the scenes — like a chess AI simulating millions of boards before making its first move. 🤖♟️

---

> **⚙️ Approach:**  
1. Initialize a chessboard with `'X'` in all cells.  
2. Use recursion to try placing a queen in every column of the current row.  
3. Check if it’s **safe** using `isSafe()` (column, upper-left diagonal, upper-right diagonal).  
4. If safe:  
   - Place `'Q'`  
   - Recurse for next row  
   - Backtrack by setting `'X'` again  
5. When a full valid configuration is reached, increment the global `count`.  
6. Finally, print the count of total valid ways.

---

---

### 🔹 `Backtracking6.java`  
> **🧾 Problem:** Count the total number of ways to reach the bottom-right cell of an `n × m` grid by moving only right or down.  
> **⏱️ Complexity:** `Time:` O(2^(n + m)) (exponential recursion) &nbsp;&nbsp;&nbsp; `Space:` O(n + m) (call stack depth)  
> **📚 Concepts Used:** Recursion, Backtracking, Grid Path Exploration  

> **🧠 Intuition:**  
You’re standing at the top-left corner of a grid. The goal is to reach the bottom-right corner.  
The catch? You can only move either **right ➡️** or **down ⬇️**.

At each cell `(i, j)`, you have two options:
- Move **down** to `(i + 1, j)`
- Move **right** to `(i, j + 1)`

Recursively explore both options and sum their return values — each `1` means you successfully reached the destination.

Not sure how to visualize it?  
Just imagine walking inside a square-shaped chocolate box 🍫 — you can only go down or right. You're counting all unique ways to eat your way to the last piece. No backtracking here — once a step is made, no undo — but you're trying every possible *forward* path.

---

> **⚙️ Approach:**  
1. Start from `(0, 0)` — top-left of the grid.  
2. If you reach `(n-1, m-1)`, return `1` (valid path).  
3. If `i == n` or `j == m`, return `0` (out of bounds).  
4. Else, return the sum of two recursive calls:  
   - One moving **down**  
   - One moving **right**

This explores all possible routes recursively and adds them up.

---


---

### 🔹 `Backtracking7.java`  
> **🧾 Problem:** Solve a standard 9×9 Sudoku puzzle using backtracking.  
> **⏱️ Complexity:** `Time:` O(9ⁿ) in worst-case scenarios  
> **📚 Concepts Used:** Backtracking, 2D Grid Traversal, Constraint Satisfaction  

> **🧠 Intuition:**  
Every empty cell in a Sudoku grid has to be filled with a digit from 1 to 9. But here’s the catch:
- No repetition in the **same row**
- No repetition in the **same column**
- No repetition in the **same 3×3 subgrid**

So, for each empty cell, we:
1. Try placing each digit (1 to 9).
2. If it’s safe, we place it and move to the next cell.
3. If it leads to a dead end — we backtrack (reset the cell to 0) and try the next digit.

It’s like filling out a government form where each section has rules, and a wrong entry forces you to start over… but now imagine doing it for 81 cells with rules that cross-check each other 😅📑

---

> **⚙️ Approach:**  
1. Start from cell `(0, 0)` and move row-wise.  
2. For each cell:  
   - If it’s already filled (`!= 0`), move to the next one.  
   - If empty, try placing digits `1` to `9`:  
     - Check if it's **safe** using `isSafe()`  
     - If yes, place the digit and recurse  
     - If that path fails, reset the cell to `0` (backtrack)  
3. If `row == 9`, the entire board is filled correctly — return `true`.  

> 🔍 Safety Check Includes:
- No duplicate in current row  
- No duplicate in current column  
- No duplicate in 3×3 subgrid  

---

