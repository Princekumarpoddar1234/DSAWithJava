# 💥 Strings - `string1`: Shortest Path Length (Directions) 💥

## 📁 File: `Strings/string1.java`

## 🎯 Problem Statement
Given a string representing a series of directional movements ('N', 'S', 'E', 'W'), calculate the shortest straight-line distance (Euclidean distance) from the starting point to the final destination.

**LeetCode Link:** Not a direct LeetCode problem, but related to geometry and string parsing.

## 🤔 Intuition
To find the shortest path, we don't need to trace every zig-zag. We only care about the net displacement in the x-direction and y-direction. Once we have the final `(x, y)` coordinates relative to the origin, the shortest path is simply the hypotenuse of the right triangle formed by these displacements. This is like **Iron Man's flight navigation system**: it doesn't log every micro-movement, just the final coordinates to calculate a direct return.

## 🛠️ Approach
* Define `PathLength(String path)`.
* Initialize `x=0`, `y=0` to track current coordinates.
* Iterate through each character (`dir`) in the `path` string:
    * If `dir` is 'N', increment `y`.
    * If `dir` is 'S', decrement `y`.
    * If `dir` is 'E', increment `x`.
    * If `dir` is 'W', decrement `x`.
* After iterating, calculate squared displacements: `X2 = x*x`, `Y2 = y*y`.
* Return the square root of `(X2 + Y2)` as a `float`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Linear scan of the input `path` string.
* **Space:** `O(1)` - Only a few variables used.

### Code Explanation:
The `PathLength` function simulates movement by updating `x` and `y` coordinates based on direction characters. After processing the entire path, it calculates the **squared Euclidean distance** (`X2 + Y2`) and returns its square root, representing the shortest straight-line path from start to end.





# 🔤 String Comparison in Java

## 📁 File: `string2.java`

## 🎯 Problem Statement
Demonstrate the use of `equals()` method to compare two string objects in Java, one created using a string literal and the other using the `new` keyword.

## 🧠 Key Concepts
- `==` checks **reference equality** (i.e., if both references point to the same object).
- `.equals()` checks **content equality** (i.e., if the values of the strings are the same).






# ✂️ Substring Implementation in Java

## 📁 File: `string3.java`

## 🎯 Problem Statement
Demonstrate how to extract a substring from a given string using both custom logic and Java’s built-in `substring()` method.

## 🧠 Key Concepts
- `charAt(i)` is used to get individual characters.
- String concatenation builds the substring manually.
- `substring(start, end)` is Java's built-in method for extracting part of a string.

## 🔍 Code Logic
```java
String str = "HELLO WORLD";
SubString(str, 0, 5);               // custom logic
System.out.println(str.substring(0,5));  // built-in method

----





# 🍎 Find Lexicographically Largest String

## 📁 File: `string4.java`

## 🎯 Problem Statement
Find and print the lexicographically largest string from a given array of strings using `compareTo()`.

## 🧠 Key Concepts
- `compareTo(String s)` compares two strings lexicographically.
  - Returns:
    - `0` if equal
    - `<0` if calling string is smaller
    - `>0` if calling string is larger
- Lexicographical order is like dictionary order.

----





# 🔁 String Topics in Java — Character Iteration & Palindrome Check

## 📁 File: `stringTopic.java`

## 🎯 Problem Statement
This Java program performs basic string operations, including:
- Iterating through and printing each letter of a string (commented function).
- Checking whether a given string is a **palindrome** (reads the same forwards and backwards).

---

## 🧠 Key Concepts
- **`charAt(i)`**: Accesses a specific character in a string.
- **Palindrome**: A string that reads the same forwards and backwards, e.g., `"madam"` or `"racecar"`.
- **`Scanner`**: Used for user input.

---





# 🔤 Count Lowercase Vowels in a String — `strques1.java`

## 📁 File: `strques1.java`

## 🎯 Problem Statement
Given a string, count the number of **lowercase vowels** (`a, e, i, o, u`) in it.

---

## 💡 Intuition
Vowels are a limited set of characters. If we check every character in the string one by one and see whether it's a vowel, we can simply keep a count and return it.

This is a **linear scan** problem — for each character, we perform a constant-time check.

---

## 🛠️ Approach
1. **Initialize a counter** to zero. This will track how many vowels we find.
2. **Loop through each character** in the string using a `for` loop.
3. For every character, check if it is a **lowercase vowel** (i.e., matches `'a'`, `'e'`, `'i'`, `'o'`, or `'u'`).
4. If it's a vowel, **increment the counter**.
5. After the loop, return the counter — this gives the total number of lowercase vowels in the string.

🧠 **Why this works:**  
We are simply filtering characters based on a small set of known values (vowels), so it's fast and efficient.

---





# 🔍 String Comparison using `equals()` — `strques2.java`

## 📁 File: `strques2.java`

## 🎯 Problem Statement
Compare two strings in Java and check if they are **equal by content**, not by reference.

You are given:
```java
String str  = "ShradhaDidi";
String str1 = "ApnaCollege";
String str2 = "ShradhaDidi";

----





# 🔁 Replace Characters in a String — `strques3.java`

## 📁 File: `strques3.java`

## 🎯 Problem Statement
Write a Java program to **replace all occurrences of a character** in a string with another character using the built-in `.replace()` method.

---

## 💡 Intuition
Strings in Java are **immutable**, meaning once created, they cannot be changed.  
However, Java provides utility methods like `.replace()` which create and return a **new string** with the desired changes.

---

## 🛠️ Approach
1. Define a string: `"ApnaColleglple"`
2. Call the `.replace("l", "k")` method:
   - This replaces **all lowercase 'l' characters** with **'k'**.
   - Note: It does **not** change uppercase `'L'` or other characters.
3. Store the result in a new string and print it.

> Since strings are immutable, the original string remains unchanged — the method returns a **new string** with replacements.

---





# 🔄 Anagram Checker in Java — `strques4.java`

## 📁 File: `strques4.java`

## 🎯 Problem Statement
Check whether two given strings are **anagrams** of each other.  
Two strings are anagrams if they contain the **same characters in any order** and have the **same length**.

**Example:**
- `"race"` and `"care"` → ✅ Anagrams  
- `"hello"` and `"world"` → ❌ Not Anagrams

---

## 💡 Intuition
If two strings are truly anagrams:
- They must be the **same length**.
- When sorted, their **character arrays must look identical**.

So, convert both strings to lowercase, break them into character arrays, sort them, and check if they’re equal.

---

## 🛠️ Approach
1. **Check string lengths**: If not equal, immediately return false.
2. Convert both strings to **lowercase** to ignore case differences.
3. Convert both strings to **character arrays**.
4. Use `Arrays.sort()` to sort both arrays alphabetically.
5. Use `Arrays.equals()` to check if sorted arrays are identical.
6. If equal → print `True`; else → print `False`.

> Sorting helps standardize the arrangement of characters for accurate comparison.

---

## 🔍 Code Behavior
```java
String str1 = "race";
String str2 = "care";
isAnagram(str1, str2);
