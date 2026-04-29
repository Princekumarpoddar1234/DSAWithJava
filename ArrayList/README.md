# 📁 ArrayList in Java

This folder contains Java code snippets demonstrating various `ArrayList` operations — adding, removing, updating, and accessing elements dynamically.

---

### 📄 `arraylist1.java`

> **Topic:** Basic operations on ArrayList  
> **Summary:**
- Created an `ArrayList<Integer>`
- Added elements using `add()`
- Inserted at a specific index
- Retrieved using `get(index)`
- Removed by index with `remove(index)`
- Checked existence using `contains(value)`
- Replaced value with `set(index, value)`
- Printed list using a loop

> **Note:** Demonstrates how `ArrayList` handles dynamic resizing, internal shifting, and provides easy list manipulation compared to arrays.

---

### 📄 `arraylist2.java`

> **Topic:** Reverse traversal of an ArrayList  
> **Summary:**
- Created an `ArrayList<Integer>` with elements 1 to 5  
- Used a reverse `for` loop to print elements from last to first  
- Demonstrates accessing elements using `get(index)` while traversing backward

---

### 📄 `arraylist3.java`

> **Topic:** Find maximum element in an ArrayList  
> **Summary:**
- Populated an `ArrayList<Integer>` with sample values  
- Initialized `max` to `Integer.MIN_VALUE`  
- Used a loop with `get(i)` to compare and update `max`  
- Printed the highest value after full traversal

---

### 📄 `arraylist4.java`

> **Topic:** Swap two elements in an ArrayList  
> **Summary:**
- Defined a custom `swap()` method using `get()` and `set()`  
- Swapped elements at index 1 and 3  
- Demonstrates value manipulation inside a list without using extra collections

---

### 📄 `arraylist5.java`

> **Topic:** Sorting an ArrayList  
> **Summary:**
- Added integers to an `ArrayList`  
- Used `Collections.sort(list)` to sort in ascending order  
- Used `Collections.sort(list, Collections.reverseOrder())` for descending  
- Demonstrates Java’s built-in utility for efficient sorting

---

### 📄 `arraylist6.java`

> **Topic:** 2D ArrayList (Nested Lists)  
> **Summary:**
- Created an `ArrayList` of `ArrayList<Integer>`  
- Added two sublists to `mainList`  
- Used nested loops to access and print elements row-wise  
- Shows how to model 2D structures using nested ArrayLists

---

### 📄 `arraylist7.java`

> **Topic:** Populating a 2D ArrayList using loops  
> **Summary:**
- Created three `ArrayList<Integer>` rows with multiples of 1, 2, and 3  
- Used a loop to fill values dynamically  
- Added each list to a main 2D `ArrayList` (`mainList`)  
- Demonstrates scalable 2D list creation using logic instead of hardcoding

---

### 📄 `arraylist8.java`

> **Topic:** Container With Most Water (Brute Force + Two Pointer)  
> **Summary:**
- Problem: Find the max water container between vertical lines stored as heights  
- `storeWater1()`: Brute force O(n²) approach by checking all pairs  
- `storeWater2()`: Optimized O(n) solution using two-pointer technique  
- Demonstrates comparison-based decision making with `ArrayList.get()`

---

### 📄 `arraylist9.java`

> **Topic:** Check if any pair sums to target (Brute Force + Two Pointer)  
> **Summary:**
- `findPair()`: Brute-force O(n²) approach using nested loops  
- `findPair2()`: Optimized O(n) two-pointer solution (requires sorted input)  
- Adds integers to an `ArrayList`, checks for existence of a target sum pair  
- Demonstrates efficient searching techniques with minimal extra space

---

### 📄 `arraylist10.java`

> **Topic:** Pair sum in a circularly sorted ArrayList  
> **Intuition:** The list is rotated, so normal two-pointer won't work. We find the rotation point, then scan using circular two-pointers.  
> **Approach:**  
- Find the index where the order breaks (`breakPoint`)  
- Set `left = breakPoint + 1`, `right = breakPoint`  
- Move pointers circularly using modulo until a valid pair is found  
> **Summary:**  
- Time Complexity: O(n)  
- Solves the pair sum problem in a rotated sorted list without extra space
