# 💥 Linked Lists - `linkedList1`: Singly Linked List Operations 💥

## 📁 File: `LinkedLists/linkedList1.java`

## 🎯 Problem Statement
Implement various operations for a singly linked list, including adding/removing elements, searching, reversing, checking for palindromes, deleting Nth node from end, and cycle detection.

**LeetCode Link:** [LeetCode 206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/), [LeetCode 234. Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/), [LeetCode 19. Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/), [LeetCode 141. Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)

## 🤔 Intuition
A linked list is a sequence of nodes, each pointing to the next. Operations involve manipulating these `next` pointers.
* **Adding/Removing:** Adjust `head`, `tail`, or intermediate `next` pointers.
* **Searching:** Traverse iteratively or recursively.
* **Reversing:** Change `next` pointers to point backwards.
* **Palindrome:** Find middle, reverse second half, compare halves.
* **Cycle:** Use Floyd's Cycle-Finding (fast/slow pointers).
This is like **Iron Man reconfiguring his suit's internal wiring** for different functionalities.

## 🛠️ Approach
* **`Node` class:** `data`, `next`.
* `addFirst`, `addLast`, `add(idx)`: Insert new nodes by updating pointers.
* `removeFirst`, `removeLast`: Remove nodes by updating pointers.
* `print`: Traverse and print.
* `iterativeSearch`, `recSearch`: Find key by traversal.
* `reverse`: Iterate, reversing `next` pointers (`curr.next = prev`).
* `deleteNthNodeFromEnd`: Calculate size, then traverse to `(size-n)`th node and bypass.
* `checkPalindrome`: Use `findMid` (slow/fast pointers), reverse second half, compare.
* `isCycle`: Use `slow` and `fast` pointers (Floyd's algorithm).

## 🚀 Complexity Analysis
* **Time:** `O(1)` for `addFirst`, `removeFirst`. `O(N)` for `addLast`, `removeLast`, `add(idx)`, search, reverse, `deleteNthNodeFromEnd`, `checkPalindrome`, `isCycle`.
* **Space:** `O(1)` for most, `O(N)` for `recSearch` stack.

### Code Explanation:
`add`/`remove` methods handle pointer updates. `print` traverses. `iterativeSearch` loops. `recSearch` uses a recursive `helper`. `reverse` changes `next` pointers to reverse. `deleteNthNodeFromEnd` first counts size, then finds `(size-n)`th node's predecessor to unlink. `checkPalindrome` splits, reverses, and compares halves. `isCycle` employs **Floyd's Cycle-Finding Algorithm** (slow/fast pointers) for cycle detection.





# 💥 Linked Lists - `linkedlist2`: Cycle Detection and Removal 💥

## 📁 File: `LinkedLists/linkedlist2.java`

## 🎯 Problem Statement
Detect if a cycle exists in a linked list and, if so, remove it.

**LeetCode Link:** [LeetCode 141. Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/), [LeetCode 142. Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/)

## 🤔 Intuition
Cycle detection uses **Floyd's Cycle-Finding Algorithm** (fast and slow pointers). If a cycle exists, fast (2x speed) will eventually catch slow (1x speed). To remove it, once they meet, reset slow to head. Both move 1 step at a time; they will meet at the cycle's start. The node *before* this meeting point from the fast pointer's side has its `next` pointer set to `null`. This is like **Iron Man's flight path: if his fast-moving suit revisits a location faster than his slow-moving drone, there's a loop. To break it, he traces both back to the loop's origin.**

## 🛠️ Approach
* **`isCycle()`:** Use `slow` and `fast` pointers. `slow` moves one step, `fast` moves two. If they meet, return `true`.
* **`removeCycle()`:**
    1.  **Detect Cycle:** Use `slow` and `fast` to find if a cycle exists and where they first meet.
    2.  **Find Cycle Start:** If cycle found, reset `slow` to `head`. Move `slow` and `fast` one step at a time until they meet again. This meeting point is the cycle's starting node.
    3.  **Remove Cycle:** The node *just before* the meeting point (`prev`) is the tail of the cycle. Set `prev.next = null`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Linear traversal (Floyd's algorithm).
* **Space:** `O(1)` - Constant extra space.

### Code Explanation:
`isCycle()` uses standard fast/slow pointers to detect a cycle. `removeCycle()` first detects the cycle. If found, it re-initializes `slow` to `head`. Then, `slow` and `fast` both move one step until they meet again, identifying the cycle's entry point. The `prev` pointer correctly tracks the node just before this entry point (from `fast`'s perspective in the loop), allowing `prev.next=null` to break the cycle. This logic is robust even if the cycle starts at the head.





# 💥 Linked Lists - `linkedlist3`: Java's Built-in LinkedList Basics 💥

## 📁 File: `LinkedLists/linkedlist3.java`

## 🎯 Problem Statement
Demonstrate basic operations (add, remove) using Java's built-in `LinkedList` class.

**LeetCode Link:** Not applicable (fundamental data structure usage in Java).

## 🤔 Intuition
Java's `LinkedList` class provides a ready-to-use implementation of a doubly linked list. It simplifies common linked list operations, abstracting away manual pointer management. It's like **Tony Stark using a pre-built component** instead of fabricating it from scratch.

## 🛠️ Approach
* Create an instance of `java.util.LinkedList<Integer>`.
* Use `addLast()` to append elements.
* Use `addFirst()` to prepend elements.
* Use `removeLast()` to remove the last element.
* Use `removeFirst()` to remove the first element.
* Print the list using `System.out.println(ll)` (which calls `toString()`).

## 🚀 Complexity Analysis
* **Time:** `O(1)` for `addFirst`, `addLast`, `removeFirst`, `removeLast`.
* **Space:** `O(N)` for storing `N` elements.

### Code Explanation:
The code initializes a `LinkedList`. `ll.addLast(1)` and `ll.addFirst(0)` demonstrate adding elements at ends. `System.out.println(ll)` prints the list. `removeLast()` and `removeFirst()` then remove elements, showing how the list changes.





# 💥 Linked Lists - `linkedlist4`: Merge Sort for Linked List 💥

## 📁 File: `LinkedLists/linkedlist4.java`

## 🎯 Problem Statement
Sort a singly linked list using the Merge Sort algorithm.

**LeetCode Link:** [LeetCode 148. Sort List](https://leetcode.com/problems/sort-list/)

## 🤔 Intuition
Merge Sort is a divide-and-conquer algorithm. For linked lists, it's efficient because splitting (finding mid) and merging are natural operations. Recursively split the list in half, sort each half, then merge the two sorted halves. This is like **Captain America splitting his forces, training them separately, then combining them into a super-efficient unit.**

## 🛠️ Approach
* **`getMid(head)`:** Uses fast and slow pointers to find the middle node (or the node just before middle for even length).
* **`merge(head1, head2)`:** Merges two *sorted* linked lists into a single sorted list.
* **`mergeSort(head)`:**
    * Base case: If `head` is `null` or `head.next` is `null`, return `head`.
    * Find `mid` of the list using `getMid`.
    * Split list into two halves (`head` to `mid` and `mid.next` to end).
    * Recursively call `mergeSort` on both halves.
    * Merge the two sorted halves using `merge`.

## 🚀 Complexity Analysis
* **Time:** `O(N log N)` - `log N` levels of recursion, `O(N)` work per level for merging and splitting.
* **Space:** `O(log N)` - For recursion stack (due to balanced splits).

### Code Explanation:
`getMid` finds the list's middle (slow/fast pointers). `merge` iteratively combines two sorted lists. `mergeSort` recursively calls itself to sort halves, then uses `merge` to combine them. The original `head` is passed to `mergeSort`, but `merge` returns a new head for the sorted list.





# 💥 Linked Lists - `linkedlist5`: Zigzag Linked List 💥

## 📁 File: `LinkedLists/linkedlist5.java`

## 🎯 Problem Statement
Rearrange a singly linked list into a zigzag pattern (e.g., `1->2->3->4` becomes `1->4->2->3`).

**LeetCode Link:** [LeetCode 328. Odd Even Linked List](https://leetcode.com/problems/odd-even-linked-list/) (related concept of reordering based on property), [LeetCode 143. Reorder List](https://leetcode.com/problems/reorder-list/) (more direct match).

## 🤔 Intuition
To form a zigzag pattern, we can split the list into two halves, reverse the second half, and then merge them alternatingly. This is like **Captain America splitting his squad**, having one flank advance normally, the other perform a tactical reverse, then re-interleaving them for a strategic pattern.

## 🛠️ Approach
* **`getMid(head)`:** Finds the middle node of the linked list (slow/fast pointers).
* **`reverse(head1)`:** Reverses the second half of the linked list.
* **`zigzag(head)`:**
    * Find the middle of the list using `getMid`.
    * Split the list into two halves: `left` (head to mid) and `right` (mid.next to end). `mid.next` is set to `null` to separate.
    * Reverse the `right` half using `reverse`.
    * Merge `left` and `right` halves alternatingly by adjusting `next` pointers.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Traversals for finding mid, reversing, and merging are all linear.
* **Space:** `O(1)` - Constant extra space.

### Code Explanation:
`getMid` uses slow/fast pointers. `reverse` iteratively flips pointers. `zigzag` uses these: `mid` splits the list. `right` is reversed. The `while` loop then interweaves `left` and `right` nodes by carefully updating `left.next` and `right.next` pointers to create the `L1->R1->L2->R2...` pattern.




# 💥 Linked Lists - `linkedlist6`: Doubly Linked List Operations 💥

## 📁 File: `LinkedLists/linkedlist6.java`

## 🎯 Problem Statement
Implement a basic Doubly Linked List with `addFirst`, `removeFirst`, `print`, and `reverse` operations.

**LeetCode Link:** Not applicable (fundamental data structure implementation).

## 🤔 Intuition
A doubly linked list node has pointers to both `next` and `prev` nodes. This allows bidirectional traversal. Operations involve updating both sets of pointers. Reversing means swapping `next` and `prev` for each node. This is like **Vision's internal wiring**, allowing energy (data) to flow in both directions between components.

## 🛠️ Approach
* **`Node` class:** `data`, `next`, `prev`.
* `addFirst(data)`: Creates `newNode`, sets `newNode.next = head`, `head.prev = newNode`, then updates `head`.
* `print()`: Traverses `head` to `null` printing `data<->`.
* `removeFirst()`: Updates `head` to `head.next`, sets new `head.prev = null`.
* `reverse()`: Iterates, for each `curr`, swaps `curr.prev` and `curr.next` pointers. Finally, updates `head` and `tail`.

## 🚀 Complexity Analysis
* **Time:** `O(1)` for `addFirst`, `removeFirst`. `O(N)` for `print`, `reverse`.
* **Space:** `O(1)` (excluding list storage).

### Code Explanation:
The `Node` class holds `data`, `next`, and `prev` pointers. `addFirst` and `removeFirst` efficiently manage head and its neighbors. `reverse` iterates through the list, **swapping `next` and `prev` pointers for each node**, effectively reversing the list. The final `head` and `tail` adjustments (`head = temp.prev` and then `tail` traversal) complete the reversal.