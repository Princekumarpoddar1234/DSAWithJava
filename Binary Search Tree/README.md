# 🌲 Binary Search Tree (BST)

Welcome to the land of **Binary Search Trees** — where everything’s either to the left or to the right (kinda like people on Twitter 😅)
This section covers the fundamentals and operations of **Binary Search Trees** — a sorted binary tree structure with efficient search, insert, and delete functionalities.

---

### 🔹 `BST1.java`

> **🎯 Purpose:**  
Implements core BST operations:
- Node Insertion
- Inorder Traversal
- Search
- Delete (with all 3 cases)
- Inorder Successor

> **🛠️ Logic:**  
- Insert: Recursively place values left/right based on comparison.
- Inorder: Left → Root → Right (returns sorted sequence).
- Search: Classic recursive BST search.
- Delete: Handles three cases — leaf, one child, and two children (using inorder successor).

> **📌 Example:**
```java
Input: [8,5,3,6,1,4,10,11,14]
Inorder Before Deletion: 1 3 4 5 6 8 10 11 14
Delete: 6
Inorder After Deletion: 1 3 4 5 8 10 11 14



### 🔹 `BST2.java`

> **🎯 Purpose:**  
This code adds a bunch of BST utility features like:
- ✅ Printing nodes in a given range
- 🌱 Printing all root-to-leaf paths
- ✔️ Validating whether the tree is a BST
- 🔁 Creating a mirror image of the tree

> **🛠️ Highlights of Implementation:**
- **`printInRange(k1, k2)`** — Prints all nodes with values between `k1` and `k2` in sorted order. Super handy for range queries!
- **`printRootToLeaf()`** — Recursively prints all paths from root to every leaf. Kind of like tracing every possible story ending from a Marvel "What If?" episode.
- **`isValidBST()`** — Confirms whether the current tree follows BST rules using min/max constraints at each level.
- **`mirror()`** — Swaps left and right subtrees recursively. A full-on mirrorverse transformation — Loki would be proud.



### 🔹 `BST3.java`

> **🎯 Purpose:**  
Build a height-balanced Binary Search Tree (BST) from a sorted array. Basically, convert a linear world into a structured hierarchy. Vision would call it... *perfectly balanced*.

> **🧠 Intuition:**  
We take the **middle element** of the array as the root, recursively assign the middle of the left subarray to the left subtree, and the middle of the right subarray to the right subtree. This ensures the tree is **as balanced as possible**, preventing it from degenerating into a linked list.

> **🧪 Example:**  
Input: `[3,5,6,8,10,11,12]`  
Preorder Output: `8 5 3 6 11 10 12`

> **📈 Time Complexity:**  
- Tree Construction: **O(n)**  
- Preorder Traversal: **O(n)**  

> 🧊 Pro Tip:  
Great for converting sorted datasets into efficient searchable trees — and when you want a tree that doesn't tip over like a poorly-built IKEA shelf.

---



### 🔹 `BST4.java`

> **🎯 Purpose:**  
Takes an **unbalanced BST**, captures its inorder traversal (which is always sorted), and then rebuilds a **balanced BST** from that sorted list. It’s like giving your wobbly Jenga tower a proper architecture upgrade.

> **🧠 Intuition:**  
- Step 1: Insert nodes normally → may create an unbalanced BST.  
- Step 2: Store its **inorder** (sorted values).  
- Step 3: Use the middle element to build a **balanced BST** recursively — just like `BST3.java`.

> **🧪 Example:**  
Input: `{8,6,5,3,10,11,12}`  
Original Preorder: `8 6 5 3 10 11 12`  
Balanced Preorder: `8 5 3 6 11 10 12`

> **📈 Time Complexity:**  
- Insertion: O(n log n) avg, O(n²) worst  
- Inorder Traversal: O(n)  
- Rebuilding BST: O(n)

> 🤹 Tip to Remember:  
Balancing a tree doesn't require ninja reflexes — just a sorted list and a good midpoint habit.

---



### 🔹 `BST5.java`

> **🎯 Purpose:**  
Finds the **size of the largest Binary Search Tree (BST)** present inside a Binary Tree. Not every subtree may be a BST — but we dig deep to find the biggest valid one.

> **🧠 Intuition:**  
Use **post-order traversal** to get info from left and right subtrees. For every node, check:
- Are both subtrees BSTs?
- Does the current node maintain BST rules?
If yes → update the global `maxSize`.

> **🧪 Example Tree:**  
Binary Tree with BST subtree rooted at 60  
Output: `Largest BST size: 5`

> **⚙️ Core Components:**  
- `Info` class holds BST validity, size, min, and max.
- `largestBST()` recursively checks all subtrees.

> **⏱️ Time Complexity:**  
- O(n), since every node is visited once.

> 🧩 Trivia:  
This is not about *making* a BST — it’s about *spotting* the biggest one hiding inside.

---



### 🔹 `BST6.java`

> **🎯 Purpose:**  
Merges two **Binary Search Trees** into a single **balanced BST** that includes all elements from both trees.

> **⚙️ Process:**
1. Perform **inorder traversal** of both BSTs to get sorted arrays.
2. **Merge** the two sorted arrays.
3. Convert the merged array back into a **balanced BST** using the middle element as root (recursively).

> **📦 Key Components:**
- `mergeArray()`: Merges two sorted lists.
- `createBST()`: Builds balanced BST from sorted array.
- `mergeBST()`: Brings it all together.

> **🧪 Output:**  
Preorder traversal of the merged balanced BST.  
For trees `{1,2,4}` and `{3,9,12}` → Merged Preorder: `4 2 1 3 9 12`

> **🕰️ Time Complexity:**  
- O(n + m) where `n` and `m` are sizes of the two trees.

> 🧩 Insight:  
Using **sorted traversal** ensures that we maintain BST properties without dealing with direct tree manipulations.

---
