---

### 🔹 `binary_search_array.java`  
> **🧾 Problem:** Perform binary search on a sorted array (ascending/descending not handled in logic).  
> **⏱️ Complexity:** `Time:` O(log n) &nbsp;&nbsp;&nbsp; `Space:` O(1)  
> **📚 Concepts Used:** Binary Search, Array, Iteration  

> **🧠 Intuition:**  
Binary search divides your search space in half at each step. It’s like looking for a name in a phone book — you flip to the middle, then decide which half to explore next 📖🔍

The algorithm keeps adjusting the `low` and `high` bounds:
- If the middle element is the key, return it.
- If the key is smaller, search in the left half.
- If larger, search in the right half.

⚠️ Note: This code **does not detect ascending/descending order** — it assumes a sorted array in ascending order.

---

> **⚙️ Approach:**  
1. Take the input array and key from the user.  
2. Set `low = 0`, `high = size - 1`.  
3. Use a loop to:
   - Calculate `mid = (low + high)/2`  
   - If `array[mid] == key`, return `mid + 1` (1-based index)  
   - If `key < array[mid]`, move `high = mid - 1`  
   - Else, move `low = mid + 1`  
4. If loop ends without match, return 0 (not found).  
5. Print position if found, else show not found message.

---

---

### 🔹 `binary_search2.java`  
> **🧾 Problem:** Perform binary search on a sorted array using a `while` loop.  
> **⏱️ Complexity:** `Time:` O(log n) &nbsp;&nbsp;&nbsp; `Space:` O(1)  
> **📚 Concepts Used:** Binary Search, Arrays, Iterative Loop  

> **🧠 Intuition:**  
The goal here is to efficiently find the position of a key in a **sorted array** — not by looking through every element, but by dividing and conquering ⚔️.

Binary search works like this:
- Start with two pointers, `start` and `end`.
- Check the **middle element** (`mid`).
- If the key is found, return it (with a +1 because output is 1-based).
- If the key is smaller, discard the right half (`end = mid - 1`).
- If it's bigger, discard the left half (`start = mid + 1`).

Repeat this until you either find the key or exhaust the search range.

---

> **⚙️ Approach:**  
1. Take array input from the user (ascending order assumed).  
2. Get the key element to be found.  
3. Use a classic `while(start <= end)` loop to:  
   - Recalculate `mid` each time  
   - Compare and adjust the bounds accordingly  
4. Return `mid + 1` if found (1-based position), else `0`.  
5. Print result to user.

---


---

### 🔹 `binary_search3.java`  
> **🧾 Problem:** Perform binary search on a sorted array and return the **0-based index** of the key element.  
> **⏱️ Complexity:** `Time:` O(log n) &nbsp;&nbsp;&nbsp; `Space:` O(1)  
> **📚 Concepts Used:** Binary Search, Iteration, Modular Design  

> **🧠 Intuition:**  
This is the classic iterative binary search done right — it divides the array until it either finds the element or confirms it’s not there.

Think of it like playing "Guess the Number" with a smart friend who always guesses the middle — if it’s too high or too low, they immediately cut the range in half 🎯

> ✅ This version returns the **actual array index** (starting from 0), unlike some earlier versions that returned position + 1.

---

> **⚙️ Approach:**  
1. User inputs the size and the elements (assumed to be sorted).  
2. Binary search is applied using:
   - `low = 0`, `high = n - 1`  
   - Calculate `mid` inside the loop  
   - If `array[mid] == key`, return `mid`  
   - Adjust `low` or `high` accordingly  
3. If the key isn't found, return `-1`.  
4. Output result based on return value.

> 👨‍🔧 The `create()` method modularizes array input — a neat touch!

---


---

### 🔹 `countingSort.java`  
> **🧾 Problem:** Sort an array using **Counting Sort**, a non-comparison-based sorting algorithm.  
> **⏱️ Complexity:** `Time:` O(n + k) &nbsp;&nbsp;&nbsp; `Space:` O(k), where `k = max(array)`  
> **📚 Concepts Used:** Frequency Array, Counting Sort, Stable Sort Idea  

> **🧠 Intuition:**  
Imagine you’re a teacher and students give you their roll numbers. You want to line them up in order — but instead of comparing them like a normal sorting algorithm, you just count how many times each number was called and then recreate the list from that count.  
Simple. Fast. Efficient — when numbers are small and positive ✅

> 🧨 But beware:  
Counting Sort doesn't work well for:
- **Negative numbers** (unless handled explicitly)
- **Very large values** (it wastes space)

---

> **⚙️ Approach:**  
1. Find the **maximum element** to determine size of count array.  
2. Create a `count[]` array of size `max + 1`.  
3. Count the frequency of each element in the original array.  
4. Traverse the count array:  
   - For each index `i`, place it `count[i]` times in original array.  

> ✅ This version sorts in-place without returning anything.

---


---

### 🔹 `selectionSorting.java`  
> **🧾 Problem:** Sort an array using **Selection Sort** algorithm.  
> **⏱️ Complexity:** `Time:` O(n²) &nbsp;&nbsp;&nbsp; `Space:` O(1)  
> **📚 Concepts Used:** Greedy Approach, In-place Sorting  

> **🧠 Intuition:**  
Selection Sort is like picking players for a team — you look through the list, find the **smallest (or best)** one, and put them in the front. Then repeat for the rest.  
No fancy tricks, just brute honesty 💪🏽

It finds the **minimum element** from the unsorted part and swaps it with the beginning of that part. Repeats until the array is sorted.

> 🧪 Not the fastest, but a great way to understand sorting mechanics — and fun for arrays where performance isn’t critical.

---

> **⚙️ Approach:**  
1. Loop through the array from `i = 0` to `n-1`  
2. Find the position of the minimum element from `i` to `n-1`  
3. Swap that minimum with `array[i]`  
4. Print the final sorted array

> ✅ Sorting is done **in-place** — no extra space needed.

---


---

### 🔹 `InsertionSorting.java`  
> **🧾 Problem:** Sort an array using the **Insertion Sort** algorithm.  
> **⏱️ Complexity:**  
- `Time:` O(n²) worst, O(n) best (when nearly sorted)  
- `Space:` O(1) (in-place sort)  
> **📚 Concepts Used:** Array Manipulation, Element Shifting, Greedy Insertion  

> **🧠 Intuition:**  
Imagine you're organizing your hand of cards 🃏 — each time you pick a new one, you **slide it left** until it's in its correct place.  
That’s exactly what this algorithm does. It's smooth, simple, and incredibly fast for small or nearly sorted data sets.

This is also the algorithm your brain might *naturally use* if asked to sort a tiny list without thinking too hard. You just pick and place. Simple and human-friendly.

---

> **⚙️ Approach:**  
1. Loop through the array starting from index `1` (since first element is already "sorted").  
2. Take the `current` element.  
3. Compare it with all elements to its left.  
4. Keep **shifting elements right** until you find the correct spot.  
5. Insert the current element in the correct position.

> ✅ No extra memory needed — everything happens inside the given array.

---


---

### 🔹 `sortedArraySearch.java`  
> **🧾 Problem:** Search for an element in a **row-wise and column-wise sorted 2D matrix**.  
> **⏱️ Complexity:** `Time:` O(n + m) &nbsp;&nbsp;&nbsp; `Space:` O(1)  
> **📚 Concepts Used:** Matrix Traversal, Greedy Search, Sorted Property  

> **🧠 Intuition:**  
The matrix is sorted **left-to-right** (row-wise) and **top-to-bottom** (column-wise).  
So instead of brute-forcing all elements, we start at the **top-right** — why? Because it gives us direction:  
- If the current value is **greater than key**, move **left**  
- If it’s **less than key**, move **down**  
Like a well-trained detective 🕵️‍♂️ walking down from the roof, narrowing the search one step at a time.

---

> **⚙️ Approach:**  
1. Start from **top-right** corner: `row = 0`, `col = array[0].length - 1`  
2. While within matrix bounds:  
   - If `array[row][col] == key`, 🎯 print its location and return `true`  
   - If `key < current`, move **left** (decrease `col`)  
   - If `key > current`, move **down** (increase `row`)  
3. If loop exits, return `false` (element not found)

> ✅ Optimized and avoids unnecessary comparisons.

> 💡 Real-Life Analogy:  
Imagine this like searching for a name in a **sorted attendance chart** — if the name’s alphabetically smaller, you go left on the row; if it's later, you jump to the next row below.  
No need to flip every page 📖

---


---

### 🔹 `sortingBubble.java`  
> **🧾 Problem:** Sort an array using **Bubble Sort**  
> **⏱️ Complexity:**  
- `Time:` O(n²) worst case, O(n) best (if already sorted)  
- `Space:` O(1) (In-place sort)  
> **📚 Concepts Used:** Swapping, In-place Sorting, Stability

> **🧠 Intuition:**  
Bubble Sort works just like its name — bigger elements “bubble up” to the end with each pass, like they’ve got helium balloons 🎈

You go pair by pair, swapping if they’re out of order. After every pass, the largest element settles at the correct position. Repeat until everything’s in place.

---

> **⚙️ Approach:**  
1. Run a loop from `turn = 0` to `n-1`  
2. For every `turn`, compare adjacent elements `array[j]` and `array[j+1]`  
3. If they’re in the wrong order, **swap**  
4. Add an optimization: if no swaps happen in a full pass, the array is already sorted — exit early 🚪  

> ✅ Stable sort, good for teaching but not preferred for large datasets.

---