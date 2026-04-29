# 🧠 StringBuilder Magic — `StringBuilder2` & `stringBuilder3` 🧠

## 📁 Files: `StringBuilder/StringBuilder2.java`


---

## 🔠 1. Capitalize First Letter of Each Word

### 🎯 Problem Statement
Given a lowercase sentence, **capitalize the first letter of every word** using `StringBuilder`.  
Example: `"hi, i am harshit"` → `"Hi, I Am Harshit"`

**LeetCode Link (related):** [LeetCode 2129. Capitalize the Title](https://leetcode.com/problems/capitalize-the-title/)

### 🤔 Intuition
Like Thor lifting Mjölnir, this method **lifts the first letter** of each word. We scan the string, and after every space, the next character becomes **worthy** — it is converted to uppercase.

We avoid repeated string creation by using `StringBuilder`, which is more memory-efficient for mutation.

### 🛠️ Approach
- Initialize an empty `StringBuilder`.
- Append `Character.toUpperCase(str.charAt(0))` — the first character.
- From index `1` to end:
  - If a space is found and it's **not the last character**, add the space and capitalize the **next** character.
  - Else, append the character as-is.

### 🚀 Complexity
- **Time:** `O(N)` — one traversal through the string.
- **Space:** `O(N)` — for the final result using `StringBuilder`.

### 📌 Example
```java
Input:  "hi, i am harshit"
Output: "Hi, I Am Harshit"


-----




## 📁 File: `StringBuilder/stringBuilder3.java`

## 🎯 Problem Statement
Given a string consisting of repeated characters, compress it such that **consecutive repeating characters** are replaced by a single character followed by its **count**.  
This is a basic implementation of **Run-Length Encoding**.

### 🔸 Example:
Input: "aaaabbcccdd"
Output: "a4b2c3d2"


## 🧠 Key Concepts
- Uses `StringBuilder` for efficient string manipulation.
- Repeats are counted in a loop and only compressed if the character occurs more than once consecutively.
- A classic case of **lossless compression** logic in string problems.

## 🛠️ Approach
1. Initialize an empty `StringBuilder`.
2. Traverse the string using a loop:
   - Set `count = 1` for the current character.
   - While the next character is the same, increment `count` and index `i`.
   - Append the current character.
   - If `count > 1`, append the count as well.
3. Return the result as a string.

