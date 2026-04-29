# 🧱 Stacks - `Stack1`: Custom Stack Using ArrayList 💥

## 📁 File: `Stacks/Stack1.java`

## 🎯 Problem Statement
Implement a basic **Stack** data structure using Java's `ArrayList`, supporting standard operations:
* `push()`: Add element
* `pop()`: Remove top element
* `peek()`: View top element
* `isEmpty()`: Check if the stack is empty

This mimics the behavior of Java's built-in `Stack` class but is implemented manually for learning purposes.

## 🤔 Intuition
A Stack works on the **LIFO** principle — *Last In, First Out*. Think of it like **Captain America's shield stack** — the last shield placed on top is the first one he grabs in action.

We use an `ArrayList<Integer>` internally to store stack elements. The last element in the list is treated as the **top** of the stack.

## 🛠️ Approach
* Use a static `ArrayList<Integer>` to represent the stack.
* `push(data)` → Add to end of list.
* `pop()` → Remove and return the last element.
* `peek()` → Return the last element without removing it.
* `isEmpty()` → Check if list size is zero.

⚠️ **Note:** All methods are declared `static`, so they're called using the class name, not instance (e.g., `Stack.push()` not `s.push()`).

## 🚀 Complexity Analysis
| Operation | Time Complexity | Space Complexity |
|-----------|------------------|------------------|
| push      | O(1) (amortized) | O(1)             |
| pop       | O(1)             | O(1)             |
| peek      | O(1)             | O(1)             |
| isEmpty   | O(1)             | O(1)             |

## 🧪 Sample Usage:
```java
Stack.push(10);
Stack.push(20);
System.out.println(Stack.peek()); // 20
System.out.println(Stack.pop());  // 20
System.out.println(Stack.isEmpty()); // false

This stack is like Tony Stark’s Iron Suit vault: the last suit added is always the one that flies out first when he yells “J.A.R.V.I.S., suit me up!”





# 🧱 Stacks - `Stack2`: Stack Using Linked List 💥

## 📁 File: `Stacks/Stack2.java`

## 🎯 Problem Statement
Implement a **Stack** data structure using a **singly linked list** instead of an array or `ArrayList`. Support standard stack operations:
- `push()`
- `pop()`
- `peek()`
- `isEmpty()`

## 🤔 Intuition
A **Linked List** is ideal for stack operations where dynamic memory usage is needed. We can insert and remove elements at the **head** in constant time, perfectly mimicking LIFO behavior.  
Think of it like **Thor’s hammer summoning**: the last hammer added to the summon queue is the first to arrive!

## 🛠️ Approach
- Each element is a `Node` containing `data` and a reference to the next node.
- The **top of the stack** is the `head` node.
- `push()` → Insert at the beginning (head).
- `pop()` → Remove and return the head node.
- `peek()` → Return the head node’s value.
- `isEmpty()` → Check if `head` is `null`.

## 🚀 Complexity Analysis

| Operation | Time Complexity | Space Complexity |
|-----------|------------------|------------------|
| push      | O(1)             | O(1) per node     |
| pop       | O(1)             | O(1)              |
| peek      | O(1)             | O(1)              |
| isEmpty   | O(1)             | O(1)              |

## ✅ Why Linked List?
- Avoids resizing issues of arrays.
- Efficient dynamic memory usage.
- Suitable for applications with unknown or varying stack size.

## 🧪 Sample Usage:
```java
Stack.push(10);
Stack.push(20);
System.out.println(Stack.peek()); // 20
System.out.println(Stack.pop());  // 20
System.out.println(Stack.isEmpty()); // false

⚠️ Static Design Note
Like Stack1, all methods and data are static.

This works for learning but doesn't allow multiple stack instances.

To support multiple independent stacks, avoid static (use instance variables).

🦸 Marvel Analogy
This stack is like Loki’s memory vault — every mischievous act is recorded at the top, and the TVA always deals with the latest one first!





# 🔧 Stacks - `Stack3`: Using Java's Built-in Stack 💡

## 📁 File: `Stacks/Stack3.java`

## 🎯 Problem Statement
Demonstrate stack operations using **Java’s built-in `Stack` class** from the `java.util` package. The code should perform basic LIFO operations: `push`, `pop`, and `isEmpty`.

**LeetCode Link:** Not applicable (basic language feature demonstration).

## 🤔 Intuition
Java provides a ready-made `Stack<E>` class that simplifies stack-related operations without the need to implement them manually. It is **based on a Vector**, making it synchronized (thread-safe but relatively slower in single-threaded environments).

## 🛠️ Approach
- Declare a `Stack<Integer>` and use the `.push()` method to insert elements.
- Use `.pop()` to remove and return the topmost element.
- Use `.isEmpty()` in a loop to empty the stack and print its contents in reverse order (LIFO).

## 🚀 Complexity Analysis

| Operation | Time Complexity | Space Complexity |
|-----------|------------------|------------------|
| push      | O(1) (Amortized) | O(N)             |
| pop       | O(1)             | O(1)             |
| isEmpty   | O(1)             | O(1)             |

> Note: Under the hood, `Stack` is backed by a `Vector`, so resizing may involve occasional O(N) time, but generally operations are constant time.

## 🧪 Sample Execution:
```java
Stack<Integer> s = new Stack<>();
s.push(1); s.push(2); s.push(3); s.push(4);

while (!s.isEmpty()) {
    System.out.println(s.pop()); // prints 4, 3, 2, 1
}
Key Takeaways
Stack is ideal for quick prototyping or interview questions.

For real-world projects, prefer Deque (like ArrayDeque) for better performance in non-threaded environments.

java
Copy
Edit
Deque<Integer> stack = new ArrayDeque<>();
🦸 Analogy
Think of this stack as Hawkeye's quiver — the last arrow added is the first one drawn and fired!





# 🔄 Stacks - `Stack4`: Push Element at the Bottom of Stack 🔄

## 📁 File: `Stacks/Stack4.java`

## 🎯 Problem Statement
Insert an element at the **bottom** of a stack without using any data structure other than recursion and the stack itself.

**LeetCode Link:** [Custom Implementation - Similar to Recursion Stack Problems]

## 🤔 Intuition
Stacks are inherently **Last-In-First-Out (LIFO)**, but sometimes we need to insert an element at the bottom while preserving the order of other elements. To do this:
- Temporarily remove all elements using recursion.
- Insert the new element when the stack becomes empty.
- Push all previously popped elements back on top.

> It's like adding **a new foundation brick** at the bottom of a tower and carefully replacing each stone above it.

## 🛠️ Approach
- Define a recursive function `pushAtBottom(stack, data)`:
  1. Base Case: If the stack is empty, push `data`.
  2. Recursive Case: Pop the top element, recurse to push at bottom, then re-push the top element.

- After the operation, print elements by popping to verify order.

## 🚀 Complexity Analysis

| Operation            | Time Complexity | Space Complexity |
|----------------------|------------------|------------------|
| `pushAtBottom()`     | O(N)             | O(N) (recursion stack) |
| Stack `push/pop`     | O(1)             | O(1)             |

> N is the number of elements in the stack.

## 📌 Sample Execution:
Initial Stack (top to bottom): `3 → 2 → 1`

After `pushAtBottom(stack, 4)` → Final Stack: `3 → 2 → 1 → 4`

Output:
3
2
1
4

## 🧠 Tip
Use recursion to **hold** the elements temporarily while you insert at the bottom — this mirrors how function call stacks work!

## 🦸 Analogy
> Imagine **Doctor Strange** pausing time to float each object up, placing a new one at the bottom, then resuming time — nothing out of place, but the change is made.

---





# 🔁 Stacks - `Stack5`: Reverse a String Using Stack 🔁

## 📁 File: `Stacks/Stack5.java`

## 🎯 Problem Statement
Reverse a given string using a stack without using built-in reverse functions.

**LeetCode Link:** Not applicable (basic stack usage).

## 🤔 Intuition
A stack follows the **Last-In-First-Out (LIFO)** principle. So if we push each character of a string into the stack and then pop them out, we get the reversed string.

> Think of it like placing letters on top of one another and then lifting them off from the top — you get them in reverse order.

## 🛠️ Approach
1. Create a `Stack<Character>`.
2. Convert the input string to a character array.
3. Push each character into the stack.
4. Pop characters from the stack and append them to a `StringBuilder`.
5. Print the reversed string.

## 🚀 Complexity Analysis

| Operation      | Time Complexity | Space Complexity |
|----------------|------------------|------------------|
| Push + Pop     | O(N)             | O(N)             |
| StringBuilder  | O(N)             | O(N)             |

> N = Length of the input string.

## ✅ Sample Execution
**Input:** `"Hello"`  
**Output:** `"olleH"`

### Output:
olleH

## 🧠 Tip
This is a fundamental stack problem often used to teach beginners about the LIFO behavior and how it can reverse sequences.

## 🦸 Analogy
> Like **Thor tossing Mjolnir** forward and watching it spin back in reverse — a stack flips the flow effortlessly!

---





# 🔁 Stacks - `Stack6`: Reverse a Stack Using Recursion 🔁

## 📁 File: `Stacks/Stack6.java`

## 🎯 Problem Statement
Reverse a stack **without using any extra data structure** — only recursion and stack operations.

**LeetCode Link:** Similar concept in [Reverse Stack Using Recursion](https://www.geeksforgeeks.org/reverse-a-stack-using-recursion/)

## 🤔 Intuition
To reverse a stack using only recursion:
1. Remove the top element.
2. Recursively reverse the remaining stack.
3. Push the removed element at the **bottom** of the reversed stack.

> Think of it as peeling off layers of an onion and restacking them in reverse order.

## 🛠️ Approach
- Define `pushAtBottom(stack, data)`:
  * Pushes the given `data` at the bottom of the stack using recursion.
- Define `reverseStack(stack)`:
  * Pops the top element, reverses the rest of the stack recursively, and then inserts the top at the bottom.
- Define `print(stack)`:
  * Pops and prints all elements to verify the stack has been reversed.

## 🚀 Complexity Analysis

| Operation           | Time Complexity | Space Complexity |
|---------------------|------------------|------------------|
| `reverseStack()`    | O(N²)             | O(N) (recursion stack) |
| `pushAtBottom()`    | O(N)              | O(N) (recursive calls) |

> N = Number of elements in the stack

## ✅ Sample Execution
**Initial Stack (Top to Bottom):** `3 2 1`  
**After Reversing (Top to Bottom):** `1 2 3`

### Output:
After reversing:
1
2
3

## 🧠 Tip
Recursive stack reversal is a great test of both stack fundamentals and recursion logic. This is also frequently asked in interviews to assess your understanding of stack internals without auxiliary structures.

## 🦸 Analogy
> Like **Doctor Strange** rewinding time — one frame (element) at a time — and restoring everything in reverse.

---





# 📈 Stacks - `Stack7`: Stock Span Problem 📈

## 📁 File: `Stacks/Stack7.java`

## 🎯 Problem Statement
Given a list of daily stock prices, calculate the **stock span** for each day.  
The **span** of a stock's price today is the number of consecutive days before today the price was **less than or equal** to today's price.

**LeetCode Link:** Similar to [LeetCode 901. Online Stock Span](https://leetcode.com/problems/online-stock-span/)

## 🤔 Intuition
Use a **monotonic stack** to keep track of the indices of days with prices **greater than the current day's price**.  
As you iterate:
- Pop all previous smaller prices.
- If stack is empty → span is `i + 1` (all prices so far are smaller).
- Else → span is `i - previous higher index`.

> Like a soldier looking back to see how many consecutive battles they’ve been stronger than the enemy.

## 🛠️ Approach
1. Initialize a `Stack` to keep indices.
2. For each day `i`:
   - Pop stack while current price > price at stack’s top index.
   - If stack empty → `span[i] = i + 1`
   - Else → `span[i] = i - s.peek()`
   - Push current index to stack.

## 🚀 Complexity Analysis

| Operation         | Time Complexity | Space Complexity |
|-------------------|------------------|------------------|
| Stock Span (Loop) | `O(N)`           | `O(N)`           |

- Each element is pushed and popped at most once → Linear Time.
- Stack holds indices → Linear Space.

## ✅ Sample Execution
**Input Stock Prices:**  
`100 80 60 70 60 85 100`

**Output Stock Spans:**  
`1 1 1 2 1 5 7`

## 🧠 Tip
This is a classic example of using a **monotonic decreasing stack** to solve range problems in linear time — commonly tested in interviews.

## ⚔️ Analogy
> Think of it like **Iron Man** checking how many days back he’s been the strongest Avenger. If no one stronger is found in the past, he dominates all previous records.

---






# 🔍 Stacks - `Stack8`: Next Greater Element (NGE) 🔍

## 📁 File: `Stacks/Stack8.java`

## 🎯 Problem Statement
Given an array, for each element, find the **next greater element** to its right.  
If no such element exists, output `-1`.

**LeetCode Link:** [LeetCode 496. Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/)

## 🤔 Intuition
To find the next greater element for each item in an array, we can **traverse from right to left** and use a **monotonic decreasing stack**:
- Keep removing elements from the stack that are **less than or equal** to the current element.
- The next greater element is the element left at the top of the stack (if any).

> Imagine you’re a ninja climbing rooftops from right to left. From each rooftop, you look ahead (to the right) to spot a **taller** building.

## 🛠️ Approach
1. Traverse the array **from the end** to the beginning.
2. Use a stack to keep track of **indices** of elements.
3. For each element:
   - Pop smaller or equal elements from the stack.
   - If the stack is empty → `-1`
   - Else → element at the top of the stack is the next greater.
   - Push current index onto the stack.

## 🚀 Complexity Analysis

| Operation             | Time Complexity | Space Complexity |
|------------------------|------------------|------------------|
| Next Greater Traversal | `O(N)`           | `O(N)`           |

- Each element is pushed/popped **once** → Linear time.
- Stack holds at most `N` elements → Linear space.

## ✅ Sample Execution
**Input Array:**  
`[6, 8, 0, 1, 3]`

**Next Greater Output:**  
`8 -1 1 3 -1`

## 🧠 Tip
This is a **common stack pattern** in interviews, often extended to **circular arrays**, **stock problems**, or **maximum in sliding window**.

## ⚔️ Analogy
> It’s like **Spidey** swinging across buildings, constantly scanning for the **next taller one** to hook onto.

---





# ✅ Stacks - `Stack9`: Valid Parentheses Checker ✅

## 📁 File: `Stacks/Stack9.java`

## 🎯 Problem Statement
Given a string containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['`, `']'`, determine if the input string has **valid parentheses**.  
The parentheses are valid if:
1. Every opening bracket has a corresponding closing bracket.
2. The brackets are closed in the **correct order**.

**LeetCode Link:** [LeetCode 20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)

## 🤔 Intuition
The best way to check for balanced brackets is by using a **stack**:
- Push all **opening brackets**.
- On encountering a **closing bracket**, check if the **top of the stack** is the correct matching opening bracket.
- If at the end the stack is **empty**, the string is valid.

> Think of the stack as your backpack. Every time you open a bracket, you store its symbol. When you close it, you check if it matches the last thing you stored. If not, it's invalid.

## 🛠️ Approach
1. Iterate over each character of the string:
   - If it's an opening bracket `(`, `{`, `[`: push onto the stack.
   - If it's a closing bracket `)`, `}`, `]`:
     - If the stack is empty → return `false`.
     - Otherwise, pop from the stack and check if it forms a valid pair.
2. After the loop, return `true` only if the stack is **empty**.

## 🚀 Complexity Analysis

| Operation         | Time Complexity | Space Complexity |
|------------------|------------------|------------------|
| Validity Check   | `O(N)`           | `O(N)`           |

- Each character is processed once → linear time.
- Stack can grow up to size `N` → linear space.

## ✅ Sample Execution
**Input:**  
`"(()[]{})"`

**Output:**  
`true` ✅

**Input:**  
`"({[})"`

**Output:**  
`false` ❌

## 🧠 Tip
This problem is **foundational** for syntax parsing, compiler design, and is often extended into **mathematical expression evaluation**, **HTML/XML tag balancing**, and **code format validators**.

---





# ❗ Stacks - `Stack10`: Duplicate Parentheses Checker ❗

## 📁 File: `Stacks/Stack10.java`

## 🎯 Problem Statement
Given a valid mathematical expression in string format, determine whether it contains any **duplicate (redundant) parentheses**.

A set of parentheses is duplicate if it **doesn’t enclose any operators or operands** — like `((a))` or `(a+(b))`.

**LeetCode Link:** [GFG: Duplicate Parentheses](https://www.geeksforgeeks.org/find-if-an-expression-has-redundant-brackets/) (LeetCode does not have a direct version)

## 🤔 Intuition
To detect duplicate parentheses:
- Use a **stack**.
- Push all characters until you find a **closing parenthesis `)`**.
- When a closing bracket is found, **pop elements** until an opening bracket `'('` is encountered and **count** the number of characters inside.
- If the count is **less than 1**, it means the parentheses were empty or redundant.

> Think of this as **clearing a room** — if the room (parenthesis) contains nothing meaningful (like a table or chair/operator), then it's just an unnecessary space.

## 🛠️ Approach
1. Loop through each character:
   - If it’s not `')'`, push it to the stack.
   - If it **is** `')'`, then:
     - Start popping until `'('` is found.
     - Count the number of popped elements inside.
     - If count < 1, return `true` (duplicate detected).
2. After the loop, return `false` (no duplicates).

## 🧪 Examples

```java
Input: "(((a+(b)))+(c+d))"
Output: true
Reason: Extra pair of brackets around (b)

Input: "((a+b)+(c+d))"
Output: false
Reason: All parentheses are meaningful






# 🧱 Stacks - `Stack11`: Largest Rectangle in Histogram 🧱

## 📁 File: `Stacks/Stack11.java`

## 🎯 Problem Statement
Given an array `heights[]` representing the heights of bars in a histogram, find the **area of the largest rectangle** that can be formed in the histogram.

**LeetCode Link:** [LeetCode 84 - Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/)

## 🤔 Intuition
Each bar can extend to the **left** and **right** until a **shorter bar** is encountered. To find this efficiently for every bar:
- We precompute the **Next Smaller Element to the right** (`minRight[]`)
- We precompute the **Next Smaller Element to the left** (`minLeft[]`)
- The width for each bar is `minRight[i] - minLeft[i] - 1`
- Area = `height[i] * width`

> This is like placing a building crane at each bar and asking: “How far can I expand my platform without a drop on either side?”

## 🛠️ Approach

1. **Find Next Smaller Right (NSR)**:
   - Traverse from right to left using a stack.
   - If stack is empty → extend to end (`heights.length`).
2. **Find Next Smaller Left (NSL)**:
   - Traverse from left to right using another stack.
   - If stack is empty → extend to start (`-1`).
3. **Calculate area for each bar** using:
