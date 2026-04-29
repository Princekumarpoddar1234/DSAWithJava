# 💥 Queues - `Queue1`: Queue Implementation (Array-based, Linear) 💥

## 📁 File: `Queues/Queue1.java`

## 🎯 Problem Statement
Implement a basic Queue data structure using a fixed-size array, supporting `add`, `remove`, `peek`, and `isEmpty` operations.

**LeetCode Link:** Not applicable (fundamental data structure implementation).

## 🤔 Intuition
A Queue follows a First-In, First-Out (FIFO) principle. Using a linear array, new elements are added at the `rear`, and elements are removed from the `front`. Removing from the front involves shifting all subsequent elements, which is inefficient. This is like **Captain America's orderly queue for supplies**: first in, first out, but everyone behind shifts up when someone leaves the front.

## 🛠️ Approach
* `Queue` class has `static int[] arr`, `static int size`, `static int rear`.
* Constructor initializes `arr` and sets `rear = -1`.
* `isEmpty()`: Checks `rear == -1`.
* `add(data)`: If not full, increments `rear` and places `data`.
* `remove()`: If not empty, stores `arr[0]`, shifts all elements from `arr[1]` to `arr[rear]` one position left, decrements `rear`.
* `peek()`: Returns `arr[0]` (front element).

## 🚀 Complexity Analysis
* **Time:** `O(1)` for `add`, `isEmpty`, `peek`. `O(N)` for `remove` (due to shifting).
* **Space:** `O(N)` for the array.

### Code Explanation:
The `Queue` class uses a static array `arr`. `add` places new elements at `rear`. `remove` retrieves `arr[0]`, then **shifts all remaining elements to the left** to fill the gap, making it `O(N)`. `peek` just returns `arr[0]`.





# 💥 Queues - `Queue2`: Queue Implementation (Circular Array) 💥

## 📁 File: `Queues/Queue2.java`

## 🎯 Problem Statement
Implement a Queue data structure using a fixed-size **circular array**, supporting `add`, `remove`, `peek`, `isEmpty`, and `isFull` operations.

**LeetCode Link:** Not applicable (fundamental data structure implementation).

## 🤔 Intuition
A circular array solves the `O(N)` `remove` inefficiency of a linear array queue. By using modulo arithmetic (`% size`), `front` and `rear` pointers "wrap around" the array. This allows `remove` to be `O(1)` as no shifting is needed. It's like **Iron Man's flight path**: instead of moving all traffic when one jet leaves, the queue simply loops back to the start.

## 🛠️ Approach
* `Queue` class has `static int[] arr`, `static int size`, `static int rear`, `static int front`.
* Constructor initializes `arr`, `front = -1`, `rear = -1`.
* `isEmpty()`: `rear == -1 && front == -1`.
* `isFull()`: `(rear + 1) % size == front`.
* `add(data)`: If not full, updates `rear = (rear + 1) % size`, handles `front` for first element.
* `remove()`: If not empty, stores `arr[front]`. If last element, resets `front=rear=-1`; else, updates `front = (front + 1) % size`.
* `peek()`: Returns `arr[front]`.

## 🚀 Complexity Analysis
* **Time:** `O(1)` for `add`, `remove`, `peek`, `isEmpty`, `isFull`.
* **Space:** `O(N)` for the array.

### Code Explanation:
The key is `front` and `rear` pointers moving cyclically (`% size`). `add` increments `rear` circularly. `remove` increments `front` circularly. This avoids shifting, making all operations `O(1)`. `isEmpty` and `isFull` are carefully checked using both pointers.





# 💥 Queues - `Queue3`: Queue Implementation (LinkedList-based) 💥

## 📁 File: `Queues/Queue3.java`

## 🎯 Problem Statement
Implement a Queue data structure using a **linked list**, supporting `add`, `remove`, `peek`, and `isEmpty` operations.

**LeetCode Link:** Not applicable (fundamental data structure implementation).

## 🤔 Intuition
A Queue is FIFO. Implementing it with a linked list simplifies `add` (at tail) and `remove` (from head) to `O(1)` operations, as no shifting is needed. It's like **Captain America's line for a briefing**: new people join the end, and the person at the front leaves directly.

## 🛠️ Approach
* `Queue` class has `static Node head` and `static Node tail` pointers.
* `Node` inner class: `data`, `next`.
* `isEmpty()`: Checks `head == null && tail == null`.
* `add(data)`: Creates `newNode`, adds to `tail.next`, updates `tail`. If empty, `head=tail=newNode`.
* `remove()`: Stores `head.data`. Updates `head = head.next`. If only one node, `head=tail=null`.
* `peek()`: Returns `head.data`.

## 🚀 Complexity Analysis
* **Time:** `O(1)` for `add`, `remove`, `peek`, `isEmpty`.
* **Space:** `O(N)` for the linked list nodes.

### Code Explanation:
The `Queue` uses `head` and `tail` pointers. `add` appends to the `tail` (`tail.next=newNode`). `remove` takes from `head` (`head=head.next`). Both operations are `O(1)` as they only involve pointer manipulations, making it efficient for dynamic sizing.





# 💥 Queues - `Queue4`: Java's Built-in Queue (ArrayDeque) 💥

## 📁 File: `Queues/Queue4.java`

## 🎯 Problem Statement
Demonstrate the basic operations (add, remove, peek, isEmpty) using Java's built-in `Queue` interface implementation via `ArrayDeque`.

**LeetCode Link:** Not applicable (fundamental data structure usage in Java).

## 🤔 Intuition
Java's `Queue` interface, commonly implemented by `LinkedList` or `ArrayDeque`, provides a robust and efficient FIFO data structure. `ArrayDeque` is often preferred for its performance in both queue and stack operations, being a double-ended queue. It's like **Tony Stark using a highly optimized, multi-purpose tool** from his workshop instead of building one.

## 🛠️ Approach
* Create a `Queue<Integer>` instance, specifically using `new ArrayDeque<>()`.
* Use `add()` to enqueue elements.
* Use `peek()` to view the front element.
* Use `remove()` to dequeue elements.
* Use `isEmpty()` to check if the queue is empty.

## 🚀 Complexity Analysis
* **Time:** `O(1)` for `add`, `remove`, `peek`, `isEmpty`.
* **Space:** `O(N)` for storing `N` elements.

### Code Explanation:
The code initializes a `Queue` using `ArrayDeque`. `q.add()` enqueues elements. The `while` loop processes the queue: `q.peek()` retrieves the front element, and `q.remove()` dequeues it. This demonstrates the standard FIFO behavior efficiently.





# 💥 Queues - `Queue5`: Queue using Two Stacks (Costly Add) 💥

## 📁 File: `Queues/Queue5.java`

## 🎯 Problem Statement
Implement a Queue data structure using two `Stack`s, where the `add` operation is `O(N)` and `remove`/`peek` are `O(1)`.

**LeetCode Link:** [LeetCode 232. Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/)

## 🤔 Intuition
Queues are FIFO, Stacks are LIFO. To simulate FIFO with LIFO structures, we can use two stacks. One common strategy is to keep the "front" element always at the top of the main stack (`s1`). When adding, all elements from `s1` are moved to `s2`, the new element is pushed to `s1`, then `s2` elements are moved back to `s1`. This ensures the newest element is at the bottom of `s1`. This is like **Iron Man's flight crew re-stacking supplies**: everything has to be moved out and back to put a new item at the bottom.

## 🛠️ Approach
* `Queue` class contains two `static Stack<Integer> s1` and `s2`.
* `isEmpty()`: Checks if `s1` is empty.
* `add(data)`:
    * Pop all elements from `s1` and push to `s2`.
    * Push `data` onto `s1`.
    * Pop all elements from `s2` and push back to `s1`.
* `remove()`: Pops from `s1`.
* `peek()`: Peeks `s1`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` for `add` (due to shifting `N` elements twice). `O(1)` for `remove`, `peek`, `isEmpty`.
* **Space:** `O(N)` for the two stacks.

### Code Explanation:
`isEmpty`, `remove`, and `peek` are `O(1)` as they directly use `s1`'s top. The `add` method is where the transformation happens: it **empties `s1` into `s2`**, pushes the `newData` onto the now-empty `s1`, and then **moves everything back from `s2` to `s1`**. This ensures the newest element is at the "bottom" (last to be popped) of `s1`, maintaining FIFO order for `remove`.





# 💥 Queues - `Queue6`: Stack using Two Queues (Costly Pop/Peek) 💥

## 📁 File: `Queues/Queue6.java`

## 🎯 Problem Statement
Implement a Stack data structure using two `Queue`s, where `push` is `O(1)` and `pop`/`peek` are `O(N)`.

**LeetCode Link:** [LeetCode 225. Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/)

## 🤔 Intuition
Stacks are LIFO. To simulate LIFO with FIFO queues, we can perform the "costly" operation (shifting elements) during `pop` or `peek`. When popping, we move all elements from the primary queue (`q1`) except the last one to the secondary queue (`q2`). The last element in `q1` is the one we want. This is like **Captain America moving his entire team except for the last agent into a new formation** just to get that specific agent's intel.

## 🛠️ Approach
* `Stack` class contains two `static Queue<Integer> q1` and `q2`.
* `isEmpty()`: Checks if both `q1` and `q2` are empty.
* `push(data)`: Adds `data` to the non-empty queue. If both are empty, adds to `q1`.
* `pop()`:
    * If `q1` is not empty: Move all but the last element from `q1` to `q2`. The last element is the `top`, return it.
    * Else (`q2` is not empty): Move all but the last element from `q2` to `q1`. The last element is the `top`, return it.
    * (Note: The implementation effectively moves elements *to the other queue* then gets the last one. It then switches which queue is considered the 'main' one.)
* `peek()`: Same logic as `pop`, but *adds the element back* to the other queue after getting `top`.

## 🚀 Complexity Analysis
* **Time:** `O(1)` for `push`. `O(N)` for `pop` and `peek` (due to transferring `N-1` elements).
* **Space:** `O(N)` for the two queues.

### Code Explanation:
`isEmpty` checks both queues. `push` is `O(1)` as it just adds to whichever queue isn't empty. `pop` and `peek` are `O(N)`: they iterate through one queue, moving all `N-1` elements to the other, to reach the last element (which is the stack's "top"). After finding `top`, `pop` removes it. `peek` puts it back. The code effectively maintains one queue as the "main" one containing elements in LIFO order (for its front) and uses the other as a temporary buffer.





# 💥 Queues - `Queue7`: First Non-Repeating Character in a Stream 💥

## 📁 File: `Queues/Queue7.java`

## 🎯 Problem Statement
For a given string (representing a stream of characters), find the first non-repeating character seen so far after each character is processed.

**LeetCode Link:** [LeetCode 387. First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/) (similar concept for a static string).

## 🤔 Intuition
We need to track character frequencies and maintain the order of appearance. A **Queue** stores characters in their insertion order, and a **frequency array** (or map) tracks counts. After each new character, we dequeue from the front until the character at the front has a frequency of 1. If the queue becomes empty, no non-repeating character is found. This is like **Iron Man's real-time threat analysis**: constantly updating a list of threats and immediately identifying the highest-priority (first non-repeating) unaddressed one.

## 🛠️ Approach
* Create a `Queue<Character>` and an `int[] freq` (size 26 for lowercase English letters).
* Iterate through the input `str` character by character (`ch`):
    * Add `ch` to the `Queue`.
    * Increment `freq[ch - 'a']`.
    * While the `Queue` is not empty AND the character at `q.peek()` has `freq > 1`: Remove from `q`.
    * If `q` is empty, print `-1`.
    * Else, print `q.peek()`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Each character is enqueued and dequeued at most once. Frequency array operations are `O(1)`.
* **Space:** `O(1)` - `freq` array is constant size (26). Queue size is at most 26 (if all characters are unique initially).

### Code Explanation:
The `for` loop processes each character `ch`. `q.add(ch)` and `freq[ch-'a']++` update counts. The `while` loop `while(!q.isEmpty() && freq[q.peek()-'a']>1)` is key: it **removes repeating characters from the front** of the queue until a truly non-repeating character is at the `peek()` position. This ensures `q.peek()` always holds the first non-repeating char seen so far.





# 💥 Queues - `Queue8`: Interleave First Half of Queue with Second Half 💥

## 📁 File: `Queues/Queue8.java`

## 🎯 Problem Statement
Given a queue of even length, interleave the first half with the second half. For example, `[1,2,3,4,5,6]` becomes `[1,4,2,5,3,6]`.

**LeetCode Link:** Not a direct LeetCode problem, but a common queue manipulation exercise.

## 🤔 Intuition
To interleave, we need access to both the first and second halves of the queue simultaneously. We can achieve this by moving the first half into a temporary queue. Then, by repeatedly taking one element from the temporary queue and one from the original queue, and adding both back to the original queue, we interleave them. This is like **Black Widow executing a perfectly synchronized attack**: moving one squad, then another, then combining their movements.

## 🛠️ Approach
* Define `interLeave(Queue<Integer> q)`.
* Create a temporary `Queue<Integer> q2`.
* Move the first half of `q` into `q2`.
* While `q2` is not empty:
    * Dequeue an element from `q2` and enqueue it back into `q`.
    * Dequeue an element from `q` (which is now from the original second half) and enqueue it back into `q`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Three linear passes through `N/2` elements.
* **Space:** `O(N)` - For the temporary queue `q2`.

### Code Explanation:
The first `while(size-->0)` loop **transfers the first half of `q` to `q2`**. The second `while(!q2.isEmpty())` loop performs the **interleaving**: it takes one element from `q2` (original first half) and one from `q` (original second half, which is now at its front) and adds both back to `q`.





# 💥 Queues - `Queue9`: Reverse a Queue 💥

## 📁 File: `Queues/Queue9.java`

## 🎯 Problem Statement
Reverse the elements of a given queue.

**LeetCode Link:** Not a direct LeetCode problem, but a common queue manipulation exercise.

## 🤔 Intuition
Queues are FIFO, while Stacks are LIFO. To reverse a queue, we can leverage this complementary behavior: pop all elements from the queue and push them onto a stack. Then, pop elements from the stack and enqueue them back into the queue. This effectively reverses the order, like **Doctor Strange reversing time** on a sequence of events.

## 🛠️ Approach
* Define `reverse(Queue<Integer> q)`.
* Create a `Stack<Integer> s`.
* **Step 1: Queue to Stack:** While `q` is not empty, `remove` from `q` and `push` to `s`.
* **Step 2: Stack to Queue:** While `s` is not empty, `pop` from `s` and `add` to `q`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Two linear passes, one to transfer to stack, one to transfer back.
* **Space:** `O(N)` - For the auxiliary `Stack`.

### Code Explanation:
The first `while` loop `while(!q.isEmpty()){ s.push(q.remove()); }` **transfers all elements from the queue to the stack**. Due to LIFO, the last element from the queue becomes the first on the stack. The second `while` loop `while(!s.isEmpty()){ q.add(s.pop()); }` then **transfers elements back from the stack to the queue**. This two-step process effectively reverses the order of elements in the queue.





# 💥 Queues - `Queue10`: Deque (Double-Ended Queue) Basics 💥

## 📁 File: `Queues/Queue10.java`

## 🎯 Problem Statement
Demonstrate the basic operations of a `Deque` (Double-Ended Queue) using `LinkedList` as its implementation.

**LeetCode Link:** Not applicable (fundamental data structure usage in Java).

## 🤔 Intuition
A `Deque` allows additions and removals from *both ends* (front and rear). This makes it versatile, usable as both a queue (FIFO) and a stack (LIFO). `LinkedList` implements `Deque` efficiently. It's like **Iron Man's suit having multiple entry/exit points**: he can go in or out from the top or bottom.

## 🛠️ Approach
* Create a `Deque<Integer>` instance using `new LinkedList<>()`.
* Use `addFirst()` to add elements to the front.
* Use `addLast()` to add elements to the rear.
* Use `getFirst()` and `getLast()` to peek at elements at either end.
* Use `removeFirst()` (or `removeLast()`) to remove from either end.
* Print the `deque`'s state at various steps.

## 🚀 Complexity Analysis
* **Time:** `O(1)` for `addFirst`, `addLast`, `removeFirst`, `removeLast`, `getFirst`, `getLast`.
* **Space:** `O(N)` for storing `N` elements.

### Code Explanation:
The `Deque` is instantiated with `LinkedList`. `addFirst` and `addLast` methods demonstrate adding elements to both ends. `getFirst` and `getLast` show peeking, while `removeFirst` shows removal. The prints trace the deque's state, illustrating its double-ended nature.





# 💥 Queues - `Queue11`: Stack using Deque 💥

## 📁 File: `Queues/Queue11.java`

## 🎯 Problem Statement
Implement a Stack data structure using Java's `Deque` (Double-Ended Queue) interface.

**LeetCode Link:** [LeetCode 225. Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/) (though this specifically uses Queues, Deque is a more direct fit for Stack).

## 🤔 Intuition
A Stack is LIFO (Last-In, First-Out). A `Deque` provides `addFirst`/`addLast` and `removeFirst`/`removeLast`. We can map stack operations (`push`, `pop`, `peek`) directly to `Deque` operations that operate on one end (e.g., `addLast` for `push`, `removeLast` for `pop`). This is like **Captain America using a versatile utility tool** that can both add and remove items from the top or bottom of a compartment.

## 🛠️ Approach
* Define a `Stack` class containing a `Deque<Integer> deque` (implemented by `LinkedList`).
* `push(data)`: Maps to `deque.addLast(data)`.
* `pop()`: Maps to `deque.removeLast()`.
* `peek()`: Maps to `deque.getLast()`.

## 🚀 Complexity Analysis
* **Time:** `O(1)` for `push`, `pop`, `peek`.
* **Space:** `O(N)` for storing `N` elements in the `Deque`.

### Code Explanation:
The `Stack` class internally uses a `Deque`. `push` maps to `deque.addLast()`, always adding to one end. `pop` maps to `deque.removeLast()`, always removing from that same end. `peek` maps to `deque.getLast()`. This direct mapping efficiently simulates LIFO behavior using the `Deque`.





# 💥 Queues - `Queue12`: Queue using Deque 💥

## 📁 File: `Queues/Queue12.java`

## 🎯 Problem Statement
Implement a Queue data structure using Java's `Deque` (Double-Ended Queue) interface.

**LeetCode Link:** [LeetCode 232. Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/) (though this specifically uses Stacks, Deque is a more direct fit for Queue).

## 🤔 Intuition
A Queue is FIFO (First-In, First-Out). A `Deque` offers operations at both ends. We can easily map queue operations (`add`, `remove`, `peek`) to `Deque` operations that operate consistently on opposite ends (e.g., `addLast` for `add`, `removeFirst` for `remove`). This is like **S.H.I.E.L.D. managing a mission queue**: new tasks are added to the back, and completed tasks are removed from the front.

## 🛠️ Approach
* Define a `Queue` class containing a `Deque<Integer> deque` (implemented by `LinkedList`).
* `add(data)`: Maps to `deque.addLast(data)`.
* `remove()`: Maps to `deque.removeFirst()`.
* `peek()`: Maps to `deque.getFirst()`.

## 🚀 Complexity Analysis
* **Time:** `O(1)` for `add`, `remove`, `peek`.
* **Space:** `O(N)` for storing `N` elements in the `Deque`.

### Code Explanation:
The `Queue` class internally uses a `Deque`. `add` maps to `deque.addLast()`, adding to the rear. `remove` maps to `deque.removeFirst()`, taking from the front. `peek` maps to `deque.getFirst()`. This direct mapping efficiently simulates FIFO behavior using the `Deque`.