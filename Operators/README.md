# 💥 Operators - `operator`: Introduction to Java Operators 💥

## 📁 File: `Operators/operator.java`

## 🎯 Problem Statement
Demonstrate the various types of operators available in Java, including arithmetic, unary, relational, logical, bitwise, assignment, ternary, and `instanceof`.

**LeetCode Link:** Not applicable (fundamental language concept).

## 🤔 Intuition
Operators are the **verbs of programming**, performing actions on data. Java provides a rich set of operators for different purposes, from basic math to complex bitwise manipulation and logical comparisons. Understanding each type is crucial for writing any Java code. This is like **Iron Man mastering his suit's various controls**: each button (operator) performs a distinct, essential function.

## 🛠️ Approach
* Categorize operators into sections.
* For each category, declare appropriate variables (integers, booleans, strings).
* Apply each operator with example values.
* Print the result of each operation with a descriptive label.

## 🚀 Complexity Analysis
* **Time:** `O(1)` - All operations are constant time and involve a fixed number of computations.
* **Space:** `O(1)` - Only a few primitive variables are used.

### Code Explanation:
The code is structured into sections, each demonstrating a type of operator:
1.  **Arithmetic:** `+`, `-`, `*`, `/`, `%` perform standard mathematical calculations.
2.  **Unary:** `++`, `--` (increment/decrement), `+`, `-` (sign), `!` (logical NOT). Shows pre/post effects.
3.  **Relational:** `==`, `!=`, `>`, `<`, `>=`, `<=` for comparisons, returning boolean.
4.  **Logical:** `&&` (AND), `||` (OR), `!` (NOT) for combining boolean expressions.
5.  **Bitwise:** `&`, `|`, `^`, `~`, `<<`, `>>` operate directly on binary representations of numbers.
6.  **Assignment:** `+=`, `-=`, `*=` etc. for shorthand assignment operations.
7.  **Ternary:** `? :` (conditional operator) for concise `if-else` expressions.
8.  **`instanceof`:** Checks if an object is an instance of a particular class or interface.
This provides a **comprehensive overview** of Java's operator toolkit.





# 💥 Operators - `operator1`: Basic Multiplication 💥

## 📁 File: `Operators/operator1.java`

## 🎯 Problem Statement
Read two integers from the user and print their product.

**LeetCode Link:** Not applicable (basic arithmetic operation).

## 🤔 Intuition
Multiplication is a fundamental arithmetic operation. Inputting two numbers and applying the `*` operator directly yields their product. This is like **Jarvis quickly calculating component quantities** based on a formula.

## 🛠️ Approach
* Use `Scanner` to read two integers (`a` and `b`).
* Multiply `a` and `b`, storing the result in `product`.
* Print `product`.
* Close the `Scanner`.

## 🚀 Complexity Analysis
* **Time:** `O(1)` - Constant time operations (input, multiplication, output).
* **Space:** `O(1)` - Only a few primitive variables.

### Code Explanation:
The `Scanner` takes `a` and `b` as input. The `*` (multiplication) operator computes `a * b`. The `System.out.println()` statement then displays the calculated `product`.