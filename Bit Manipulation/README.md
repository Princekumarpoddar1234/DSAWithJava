# 💥 Bit Manipulation - Basic Bitwise Operations 💥

## 📄 `bitMaipulation0.java`
## 🎯 Problem Statement
This problem demonstrates the fundamental bitwise operations (`AND`, `OR`, `XOR`, `NOT`, `Left Shift`, `Right Shift`) on integers to understand how numbers are manipulated at the bit level.

**LeetCode Link:** Not a specific LeetCode problem, but foundational for many.

## 🤔 Intuition
Bit manipulation allows us to interact with numbers as sequences of binary digits (0s and 1s). Understanding these operations is crucial for optimizing code, performing quick calculations (like multiplication/division by powers of 2), and solving certain algorithmic problems by directly manipulating the 'switches' of a number.

## 🛠️ Approach
We apply each of the six core bitwise operators (`&`, `|`, `^`, `~`, `<<`, `>>`) to simple integer values (5 and 6) and observe their effects on the binary representation of these numbers.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - All bitwise operations are constant time as they operate directly on the bits, regardless of the integer's magnitude.
* **Space Complexity:** `O(1)` - No additional data structures are used; operations are in-place.

### Code Explanation:
* `5` in binary is `...0101`, `6` is `...0110`.
* **`5 & 6` (AND):** `0101 & 0110 = 0100` (4). Both bits must be 1.
* **`5 | 6` (OR):** `0101 | 0110 = 0111` (7). At least one bit must be 1.
* **`5 ^ 6` (XOR):** `0101 ^ 0110 = 0011` (3). Bits must be different.
* **`~5` (NOT):** Flips all bits of 5 (`...0101` becomes `...1010`), resulting in -6 due to two's complement representation.
* **`5 << 2` (Left Shift):** `0101` shifted left by 2 becomes `010100` (20). Equivalent to `5 * 2^2`.
* **`5 >> 2` (Right Shift):** `0101` shifted right by 2 becomes `0001` (1). Equivalent to `5 / 2^2` (integer division).



# 💥 Bit Manipulation - `bitManipulation2`: Get Bit 💥

## 📁 File: `BitManipulation/bitManipulation2.java`

## 🎯 Problem Statement
Given a number and a bit position `i`, determine the value (0 or 1) of the bit at that specific position. It's like **Iron Man's diagnostic scan**, pinpointing the exact status of a single circuit in a vast system.

**LeetCode Link:** Not a specific LeetCode problem, but a common operation in bit manipulation.

## 🤔 Intuition
To find the value of a bit at a specific position `i`, we need a way to isolate just that bit. We can create a `bitMask` by shifting `1` to the left `i` times (`1 << i`). This creates a mask with a `1` only at the desired `i`-th position and `0`s everywhere else. When we perform a bitwise `AND` between the `number` and this `bitMask`, all other bits will be zeroed out, and the `i`-th bit will reveal itself. If the result is non-zero, that bit was `1`; otherwise, it was `0`. It's like using **Doctor Strange's Eye of Agamotto** to focus on one tiny, crucial detail!

## 🛠️ Approach
1.  Create a `bitMask` by left-shifting `1` by `i` positions (`1 << i`).
2.  Perform a bitwise `AND` operation between the input `number` and the `bitMask`.
3.  If the result of the `AND` operation is `0`, the bit at position `i` was `0`.
4.  If the result is non-zero (specifically, equal to `bitMask`), the bit at position `i` was `1`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - The operations involve a single left shift and a single bitwise AND, which are constant time regardless of the number's size. It's as quick as **Captain Marvel's binary blast** – instantaneous!
* **Space Complexity:** `O(1)` - No auxiliary space is used; all operations are performed directly. This is as efficient as **Ant-Man carrying data without needing a huge truck**.

### Code Explanation:
* `int bitMask = 1 << i;`: This creates our **surgical tool** (the mask). For `i=0`, mask is `0001`; for `i=1`, `0010`; for `i=2`, `0100`, etc.
* `if ((n & bitMask) == 0)`: This performs the **critical inspection**.
    * If the `i`-th bit of `n` is `0`, then `n & bitMask` will result in `0`.
    * If the `i`-th bit of `n` is `1`, then `n & bitMask` will result in `bitMask` (a non-zero value).
* The output (`"bit was zero"` or `"bit was one"`) then reports the status of that specific bit, much like **Shuri's vibranium analysis** providing precise data.



# 💥 Bit Manipulation - `bitManipulation2`: Get Bit 💥

## 📁 File: `BitManipulation/bitManipulation2.java`

## 🎯 Problem Statement
Given a number `n` and a bit position `i`, determine the value (0 or 1) of the bit at that specific position. It's like **Iron Man's diagnostic scan**, pinpointing the exact status of a single circuit in a vast system.

**LeetCode Link:** Not a specific LeetCode problem, but a common operation in bit manipulation.

## 🤔 Intuition
To find the value of a bit at a specific position `i`, we need a way to isolate just that bit. We can create a `bitMask` by shifting `1` to the left `i` times (`1 << i`). This creates a mask with a `1` only at the desired `i`-th position and `0`s everywhere else. When we perform a bitwise `AND` between the `number` and this `bitMask`, all other bits will be zeroed out, and the `i`-th bit will reveal itself. If the result is non-zero, that bit was `1`; otherwise, it was `0`. It's like using **Doctor Strange's Eye of Agamotto** to focus on one tiny, crucial detail!

## 🛠️ Approach
1.  Create a `bitMask` by left-shifting `1` by `i` positions (`1 << i`).
2.  Perform a bitwise `AND` operation between the input `number` and the `bitMask`.
3.  If the result of the `AND` operation is `0`, the bit at position `i` was `0`.
4.  If the result is non-zero (specifically, equal to `bitMask`), the bit at position `i` was `1`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - The operations involve a single left shift and a single bitwise AND, which are constant time regardless of the number's size. It's as quick as **Captain Marvel's binary blast** – instantaneous!
* **Space Complexity:** `O(1)` - No auxiliary space is used; all operations are performed directly. This is as efficient as **Ant-Man carrying data without needing a huge truck**.

### Code Explanation:
* The goal is to create a mask with a `1` at the `i`-th position. For example, if `i=3`, the mask should be `...01000` (`8` in decimal).
* `int bitMask = 1 << i;`: This is the correct way to create our **surgical tool** (the mask). It shifts a literal `1` by `i` positions.
* `if ((n & bitMask) == 0)`: This performs the **critical inspection**.
    * If the `i`-th bit of `n` is `0`, then `n & bitMask` will result in `0`.
    * If the `i`-th bit of `n` is `1`, then `n & bitMask` will result in `bitMask` (a non-zero value, indicating the bit was set).
* The output (`"0"` or `"1"`) then reports the status of that specific bit, much like **Shuri's vibranium analysis** providing precise data.



# 💥 Bit Manipulation - `bitManipulation3`: Set Bit 💥

## 📁 File: `BitManipulation/bitManipulation3.java`

## 🎯 Problem Statement
Given a number `n` and a bit position `i`, set the bit at that specific position to `1`. This is like **Iron Man activating a specific function** in his suit by flipping a designated switch to the 'on' position.

**LeetCode Link:** Not a specific LeetCode problem, but a common operation in bit manipulation.

## 🤔 Intuition
To guarantee that the bit at position `i` is `1` (regardless of its current state), we need a `bitMask` that has a `1` only at the `i`-th position, and `0`s everywhere else. When we perform a bitwise `OR` operation (`|`) between the original `number` and this `bitMask`, if the `i`-th bit was already `1`, it remains `1`. If it was `0`, the `OR` operation with the `1` in the mask will turn it into `1`. All other bits of the original number remain unchanged because `X | 0 = X`. This is like **Captain America inspiring a team member**: they either already believe or are convinced to fight with full force!

## 🛠️ Approach
1.  Create a `bitMask` by left-shifting `1` by `i` positions (`1 << i`).
2.  Perform a bitwise `OR` operation between the input `n` and the `bitMask`.
3.  Return the result, which will have the `i`-th bit set to `1`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - Involves a single left shift and a single bitwise `OR`. These operations are fundamental and execute in constant time, as fast as **Thor summoning Mjolnir**.
* **Space Complexity:** `O(1)` - No auxiliary memory is used. The operation is direct and efficient, much like **Groot growing a single branch without needing extra soil**.

### Code Explanation:
* `int bitMask = 1 << i;`: This creates our **activation signal**. If `i=2`, `1 << 2` results in `...0100` (binary `4`), which has a `1` at the 2nd position.
* `return n | bitMask;`: This is the **power-up moment**.
    * `n` (e.g., `10` is `...1010`)
    * `bitMask` (e.g., `i=2`, so `...0100`)
    * `...1010 | ...0100 = ...1110` (which is `14`). The 2nd bit of `10` was `0`, now it's `1`.
* The `OR` operation ensures that the `i`-th bit is `1` while leaving all other bits unaffected. It's a precise, targeted modification, similar to how **Hawkeye can hit a target's weak spot without collateral damage**.



# 💥 Bit Manipulation - `bitManipulation4`: Clear Bit 💥

## 📁 File: `BitManipulation/bitManipulation4.java`

## 🎯 Problem Statement
Given a number `n` and a bit position `i`, clear (set to `0`) the bit at that specific position. This is like **Black Widow disabling a specific security sensor** in a highly guarded facility, making sure it goes completely offline.

**LeetCode Link:** Not a specific LeetCode problem, but a common operation in bit manipulation.

## 🤔 Intuition
To turn off a specific bit at position `i` while leaving all other bits untouched, we need a `bitMask` that has a `0` only at the `i`-th position and `1`s everywhere else. We can achieve this by first creating a mask with `1` at the `i`-th position (`1 << i`) and then applying a bitwise `NOT` (`~`) to it. This inverted mask will have a `0` at our target position. When we perform a bitwise `AND` operation (`&`) between the original `number` and this inverted `bitMask`, the `i`-th bit will be forced to `0` (because `X & 0 = 0`), while all other bits remain unchanged (because `X & 1 = X`). It's like **Hulk subtly, yet effectively, removing one problematic element** without smashing the entire structure.

## 🛠️ Approach
1.  Create a temporary `bitMask` by left-shifting `1` by `i` positions (`1 << i`).
2.  Invert this `bitMask` using the bitwise `NOT` operator (`~`). This `invertedMask` will have a `0` at position `i` and `1`s everywhere else.
3.  Perform a bitwise `AND` operation between the input `n` and the `invertedMask`.
4.  Return the result, which will have the `i`-th bit cleared (set to `0`).

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - Involves simple bitwise operations (left shift, NOT, AND), which are constant time. It's as quick and decisive as **Gamora slicing through an enemy**.
* **Space Complexity:** `O(1)` - No additional memory is used, as operations are performed directly on the numbers. This is as efficient as **Hawkeye's quiver, carrying everything he needs without bulk**.

### Code Explanation:
* The core idea for clearing a bit is to `AND` the number with a mask that has a `0` at the target bit and `1`s everywhere else.
* `int bitMask = ~(1 << i);`: This is the standard and correct way to create the necessary mask.
    * First, `(1 << i)` creates a mask with a `1` at the `i`-th position (e.g., if `i=1`, `1 << 1` is `...0010`).
    * Then, `~` (bitwise NOT) inverts all bits. So `~(...0010)` becomes `...1101`. This `...1101` is our desired `bitMask` that will clear the `i`-th bit when `AND`ed.
    * *(Self-correction/Note based on provided code: Your provided code uses `~(i << i)`. For the common "clear bit at index `i`" operation, it should generally be `~(1 << i)` to ensure the `1` is shifted, not the index `i` itself.)*
* `return n & bitMask;`: This performs the **bit-clearing operation**.
    * `n` (e.g., `10` is `...1010`)
    * `bitMask` (e.g., for `i=1`, it's `...1101`)
    * `...1010 & ...1101 = ...1000` (which is `8`). The 1st bit of `10` was `1`, now it's `0`.
* The `AND` operation with this `bitMask` precisely targets and zeroes out the `i`-th bit while preserving all others, much like **Doctor Strange strategically removing a single problematic thread from the fabric of reality**.




# 💥 Bit Manipulation - `bitManipulation5`: Update Bit (Set or Clear) 💥

## 📁 File: `BitManipulation/bitManipulation5.java`

## 🎯 Problem Statement
Given a number `n`, a bit position `i`, and a target value `set` (0 or 1), update the bit at position `i` to be either `0` (clear) or `1` (set) based on the `set` parameter. This is like **Vision seamlessly adapting his density** – changing his state precisely as required for the mission.

**LeetCode Link:** Not a specific LeetCode problem, but a practical application of bit manipulation.

## 🤔 Intuition
We've learned how to `set` a bit and `clear` a bit individually. This problem combines those powers. The intuition is to create a versatile function that acts as a **smart switch**: if we want to `set` the bit, we use the `OR` logic (like activating a hero's full power); if we want to `clear` it, we use the `AND` with an inverted mask logic (like subtly disarming a threat). The `set` parameter dictates which operation our "smart switch" will perform, allowing for dynamic bit control.

## 🛠️ Approach
1.  The `bitManipulate` function takes the number `n`, the target bit position `i`, and a `set` flag.
2.  It checks the value of the `set` flag:
    * If `set` is `1`, it calls the `setBit` helper function.
    * If `set` is `0` (or anything else, in this code), it calls the `clearBit` helper function.
3.  The `setBit` function works by creating a mask `(1 << i)` and performing `n | mask`.
4.  The `clearBit` function works by creating an inverted mask `~(1 << i)` and performing `n & invertedMask`.
5.  The result of the chosen operation is then printed.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - All operations (shifts, bitwise AND/OR, conditional check) are constant time. This function operates with the efficiency of **Makkari running a quick calculation**.
* **Space Complexity:** `O(1)` - No auxiliary data structures are used. The entire process occurs directly on the numbers in memory, making it as lean as **Black Panther's stealth suit**.

### Code Explanation:
* `setBit(int n, int i)`: This function handles setting the `i`-th bit to `1`.
    * `int bitMask = (1 << i);`: Creates a mask with `1` only at the `i`-th position.
    * `return n | bitMask;`: Performs an `OR` operation. If `n`'s `i`-th bit is `0`, it becomes `1`; if it's already `1`, it stays `1`. All other bits remain unchanged. It's like **Thor charging up an existing power conduit**.
* `clearBit(int n, int i)`: This function handles clearing the `i`-th bit to `0`.
    * `int bitMask = ~(1 << i);`: Creates an inverted mask with `0` at the `i`-th position and `1`s elsewhere.
    * `return n & bitMask;`: Performs an `AND` operation. If `n`'s `i`-th bit is `1`, it becomes `0`; if it's already `0`, it stays `0`. All other bits remain unchanged. This is **Spider-Man precisely webbing an off-switch**.
* `bitManipulate(int n, int i, int set)`: This is our **command center** that decides the action.
    * `if (set == 1)`: If the `set` flag is `1`, it calls `setBit`. (e.g., `bitManipulate(10, 2, 1)` for `10` (`...1010`), setting 2nd bit results in `...1110` -> `14`).
    * `else`: Otherwise (if `set` is `0`), it calls `clearBit`. (e.g., if `set` were `0`, `bitManipulate(10, 2, 0)` for `10` (`...1010`), clearing 2nd bit results in `...1010` -> `10`, as it was already `0`).
    * This logic makes the function flexible, allowing us to **dynamically control individual bits like a master strategist**.



    # 💥 Bit Manipulation - `bitManipulation6`: Clear Bits from MSB to `i` 💥

## 📁 File: `BitManipulation/bitManipulation6.java`

## 🎯 Problem Statement
Given a number `n` and a bit position `i`, clear (set to `0`) all bits from the most significant bit (MSB) down to and including position `i`. This is like **Doctor Strange conjuring a magical shield** that precisely wipes out a section of an enemy's power, starting from their main energy source.

**LeetCode Link:** Not a specific LeetCode problem, but a powerful bit manipulation technique.

## 🤔 Intuition
To clear a range of bits, we need a special `bitMask`. We want this mask to have `0`s from the MSB down to position `i`, and `1`s for all bits *below* `i`. The trick here is understanding `~0`. In binary, `~0` (bitwise NOT of 0) results in a number where *all* bits are `1`s (e.g., `...11111`). If we left-shift this "all ones" mask by `i` positions (`(~0) << i`), it creates a mask with `0`s at positions `0` to `i-1` and `1`s from `i` up to the MSB. To get our desired mask (which has `0`s from MSB to `i` and `1`s below `i`), we actually need the *inverse* of what `(~0) << i` typically gives if we're only focused on the lower bits.

The provided code's `int bitMask = ((~0) << i);` actually creates a mask where all bits from position `i` onwards (towards MSB) are `0`s, and bits *below* `i` are `1`s IF `i` is 0. More accurately, `(~0) << i` results in a number with `0`s at the `i` least significant bits and `1`s everywhere else. When you `AND` `n` with this mask, it effectively *clears* all bits *from `0` to `i-1`*, leaving bits from `i` upwards unchanged.

Let's refine the intuition based on the actual code's effect: The mask `(~0) << i` creates a sequence of `1`s followed by `i` zeros (e.g., for 32-bit int, `11...11000`). When `n` is `AND`ed with this, it effectively **zeroes out the `i` least significant bits**. This is like **Rocket Raccoon precisely detonating the last `i` gadgets** from a sequence, leaving the initial powerful ones intact.

## 🛠️ Approach
1.  Create a `bitMask` by taking `~0` (all bits set to `1`) and left-shifting it by `i` positions. This results in a mask with `1`s from position `i` to MSB, and `0`s from position `0` to `i-1`.
2.  Perform a bitwise `AND` operation between the input `n` and this `bitMask`.
3.  Return the result, which will have all bits from position `0` to `i-1` cleared (set to `0`), and bits from `i` onwards remaining unchanged.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - Involves a single bitwise NOT, a left shift, and a bitwise AND. These are all constant time operations, making it as swift as **Quicksilver delivering a message across a continent**.
* **Space Complexity:** `O(1)` - No auxiliary space is used. All operations are direct manipulations, as lightweight as **Wasp's miniature form**.

### Code Explanation:
* `int bitMask = ((~0) << i);`: This is the crucial part.
    * `~0`: In a 32-bit integer, this becomes `11111111 11111111 11111111 11111111` (all ones).
    * `<< i`: When you left-shift this "all ones" value by `i` positions, it pushes `i` zeros into the least significant positions.
        * E.g., if `i=2` (for 32-bit int), `((~0) << 2)` becomes `11111111 11111111 11111111 11111100`.
        * This mask has `1`s from the MSB down to position `i`, and `0`s at positions `0` to `i-1`.
        * So, this mask will clear the `i` least significant bits.
* `return n & bitMask;`: This performs the **selective clearing operation**.
    *



# 💥 Bit Manipulation - `bitManipulation7`: Clear Bit Range (Specific Mask) 💥

## 📁 File: `BitManipulation/bitManipulation7.java`

## 🎯 Problem Statement
Given a number `n`, and a range defined by bit positions `i` and `j` (inclusive, from `i` to `j`), clear (set to `0`) the bits within this range, while also implicitly clearing bits from `0` to `i-2`. This is like **Thanos's snap, but with highly specific targets**: clearing a segment of the population while also affecting some unexpected, lower-ranked individuals.

**LeetCode Link:** Not a specific LeetCode problem, but demonstrates complex mask creation.

## 🤔 Intuition
This method uses a unique combination of masks to achieve its effect. The `a` mask (`(~0) << (j+1)`) is like a **cosmic broom**, sweeping all bits from position `0` up to `j` to `0`, leaving `1`s from `j+1` to the MSB. The `b` mask (`1 << (i-1)`) is a **surgical re-activation**, placing a `1` specifically at position `i-1`. When these two are `OR`ed together, the final `bitMask` will have: `1`s for bits from `j+1` to MSB (preserving them), `0`s for bits from `i` to `j` (clearing the desired range), a `1` at bit `i-1` (preserving it), and `0`s for bits from `0` to `i-2` (also clearing them due to the `a` mask). The final `AND` operation with `n` then applies this precise pattern.

## 🛠️ Approach
1.  Create `mask_a` by left-shifting `~0` (all bits set to `1`) by `j+1` positions. This results in `0`s for bits `0` through `j`, and `1`s from `j+1` to MSB.
2.  Create `mask_b` by left-shifting `1` by `i-1` positions. This results in a `1` only at position `i-1`, and `0`s elsewhere.
3.  Combine `mask_a` and `mask_b` using a bitwise `OR` (`|`) to form the `bitMask`. This `bitMask` will have `1`s from `j+1` to MSB, `0`s from `i` to `j`, a `1` at `i-1`, and `0`s from `0` to `i-2`.
4.  Perform a bitwise `AND` operation between the input number `n` and the calculated `bitMask`.
5.  Return the modified number.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - Involves a few constant-time bitwise operations (NOT, shifts, AND, OR). This is as immediate as **Drax's reaction time in a fight**.
* **Space Complexity:** `O(1)` - No auxiliary memory is used. The entire process is an in-place modification of bit patterns, as compact as **Pym Particles shrinking a skyscraper**.

### Code Explanation:
* `int a = (~0) << (j+1);`: This creates a mask where all bits from `j+1` upwards are `1`, and all bits from `0` to `j` are `0`. Think of it as **clearing everything below a certain threshold `j`**.
    * Example: For `j=4`, `j+1=5`. `(~0) << 5` results in `...11100000`.
* `int b = (1 << (i-1));`: This creates a mask with a single `1` at position `i-1`.
    * Example: For `i=2`, `i-1=1`. `(1 << 1)` results in `...00000010`.
* `int bitMask = a | b;`: This combines the two.
    * The `0`s from `a` dominate in the range `i` to `j`.
    * The `1` from `b` ensures bit `i-1` is preserved (if it was `1` in `n`) or set to `1`.
    * The `0`s from `a` for bits `0` to `i-2` remain `0`, causing these bits to be cleared in `n`.
    * Example `bitMask` for `i=2, j=4`: `...11100000 | ...00000010 = ...11100010`.
* `return n & bitMask;`: This performs the actual bit modification.
    * It effectively **clears bits from `0` to `i-2` AND from `i` to `j`**, while preserving bit `i-1` and all bits from `j+1` to MSB.
    * Example: `clearRange(15, 2, 4)`
        * `n=15` (`...00001111`)
        * `bitMask = ...11100010`
        * `...00001111 & ...11100010 = ...00000010` (which is `2`).
    * This demonstrates a **highly specific, almost surgical, bit pattern modification**, much like **Okoye leading a precise strike force** to neutralize very particular threats.




# 💥 Bit Manipulation - `bitManipulation8`: Check if Power of 2 💥

## 📁 File: `BitManipulation/bitManipulation8.java`

## 🎯 Problem Statement
Determine if a given positive integer `n` is a power of 2. This is like **verifying if a new recruit has that unique 'spark' of being a true Avenger** – a very specific, recognizable trait.

**LeetCode Link:** [LeetCode 231. Power of Two](https://leetcode.com/problems/power-of-two/)

## 🤔 Intuition
Numbers that are powers of 2 (`1, 2, 4, 8, 16, ...`) have a very unique binary representation: they always have **exactly one bit set to `1`**, and all other bits are `0`.
For example:
* `1` = `...0001`
* `2` = `...0010`
* `4` = `...0100`
* `8` = `...1000`

Now, consider `n - 1`:
* If `n = 8` (`...1000`), then `n-1 = 7` (`...0111`)
* If `n = 4` (`...0100`), then `n-1 = 3` (`...0011`)

Notice a pattern? If `n` is a power of 2, `n-1` will have all the bits *below* `n`'s single set bit turned to `1`, and `n`'s original set bit turned to `0`. When you perform a bitwise `AND` (`&`) between `n` and `n-1`, if `n` is a power of 2, the result will always be `0`. Why? Because `n` has only one `1` bit, and `n-1` has a `0` at that same position. Every other bit in `n` is `0`, so `0 & X` is always `0`. This is an **elegant trick, like something Doctor Strange would conjure** to quickly reveal a hidden property!

**Important Edge Case (The Hulk problem):** This trick works perfectly for positive integers. If `n` is `0`, the logic `(0 & -1)` is `0`, which would incorrectly return `true`. So, we must explicitly handle `n > 0`.

## 🛠️ Approach
1.  First, ensure the input number `n` is positive. If `n` is `0` or negative, it cannot be a power of 2.
2.  Perform a bitwise `AND` operation between `n` and `(n - 1)`.
3.  If the result of this operation is `0`, then `n` is a power of 2.
4.  Otherwise, `n` is not a power of 2.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - This check involves a single subtraction and a single bitwise `AND` operation, both of which are constant time. It's **faster than Quicksilver in a sprint**!
* **Space Complexity:** `O(1)` - No additional memory is allocated, making this an incredibly memory-efficient solution. It's as light on resources as **Vision when he goes intangible**.

### Code Explanation:
* `public static boolean checkPower(int n)`: Our function to determine the `power-of-2` status.
* `if ((n & (n-1)) == 0)`: This is the core of the **secret handshake** for powers of 2.
    * Example: `n = 8` (`...1000`)
        * `n-1 = 7` (`...0111`)
        * `8 & 7` -> `...1000 & ...0111 = ...0000` (Result `0`). Thus, `true`.
    * Example: `n = 10` (`...1010`)
        * `n-1 = 9` (`...1001`)
        * `10 & 9` -> `...1010 & ...1001 = ...1000` (Result `8`). Thus, `false`.
* `return true;` / `return false;`: Based on the `AND` result, the function correctly reports if `n` possesses the unique **'power of 2' signature**. (Note: A more robust solution might add `n > 0` check here for strict compliance with power of 2 definition, like `return (n > 0) && ((n & (n - 1)) == 0);` but for this specific code, we are testing the bitwise pattern.)




# 💥 Bit Manipulation - `bitManipulation9`: Count Set Bits 💥

## 📁 File: `BitManipulation/bitManipulation9.java`

## 🎯 Problem Statement
Count the number of 'set' bits (bits with a value of `1`) in the binary representation of a given integer `n`. This is like **counting how many Infinity Stones are active** on Thanos's gauntlet – a direct tally of the active powers!

**LeetCode Link:** [LeetCode 191. Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/)

## 🤔 Intuition
To count the `1`s, we need a way to inspect each bit individually. A simple yet effective strategy is to repeatedly check the least significant bit (LSB) and then "shift" the number to the right, bringing the next bit into the LSB position for inspection.
* We can check the LSB by performing a bitwise `AND` with `1` (`n & 1`). If the result is `1`, the LSB was `1`; otherwise, it was `0`.
* After checking the LSB, we right-shift the number by `1` (`n = n >> 1`). This moves all bits one position to the right, effectively discarding the old LSB and bringing the next bit into the LSB position.
We repeat this process until the number becomes `0`, meaning all bits have been inspected. This methodical approach is as precise as **Hawkeye aiming for the bullseye** with every arrow.

## 🛠️ Approach
1.  Initialize a `count` variable to `0`. This will store our tally of set bits.
2.  Enter a `while` loop that continues as long as `n` is not `0`.
3.  Inside the loop:
    * Check if the LSB of `n` is `1` using `(n & 1) != 0`.
    * If it is `1`, increment `count`.
    * Right-shift `n` by `1` (`n = n >> 1`) to discard the LSB and bring the next bit into position.
4.  Once `n` becomes `0`, the loop terminates, and `count` holds the total number of set bits.
5.  Return `count`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(log N)` (or `O(number of bits)` in `N`) - The loop runs once for each bit in the number `n`. For a 32-bit integer, this means a maximum of 32 iterations, which is effectively constant time. So, `O(32)` which simplifies to `O(1)`. It's incredibly fast, like **Captain Marvel traversing the galaxy at light speed** to inspect all the stars.
* **Space Complexity:** `O(1)` - Only a few variables are used, and no additional data structures are created. This is as memory-efficient as **Ant-Man's personal space**, needing almost nothing.

### Code Explanation:
* `int count = 0;`: Our **scorekeeper** for the `1`s.
* `while(n != 0)`: The loop continues until all bits have been `shifted out` and `n` becomes `0`.
* `if ((n & 1) != 0)`: This is the **bit-inspector**.
    * `n & 1`: Performs a bitwise AND. If `n`'s LSB is `1`, the result is `1`. If `n`'s LSB is `0`, the result is `0`.
    * `!= 0`: Checks if the LSB was `1`.
    * If true, `count++`; we've found another active power!
* `n = n >> 1;`: This **shifts `n` to the right**, bringing the next bit to the LSB position for the next iteration. It's like **Doctor Strange moving a timeline forward** to see the next event.
    * Example: `n = 10` (`...01010`)
        * Iteration 1: `(10 & 1)` is `0`. `count=0`. `n = 5` (`...00101`).
        * Iteration 2: `(5 & 1)` is `1`. `count=1`. `n = 2` (`...00010`).
        * Iteration 3: `(2 & 1)` is `0`. `count=1`. `n = 1` (`...00001`).
        * Iteration 4: `(1 & 1)` is `1`. `count=2`. `n = 0` (`...00000`).
* `return count;`: Finally, we present the **final tally of active powers**, which for `10` (binary `1010`) is `2`.




# 💥 Bit Manipulation - `bitManipulation10`: Power (a^n) using Bit Manipulation 💥

## 📁 File: `BitManipulation/bitManipulation10.java`

## 🎯 Problem Statement
Calculate `a` raised to the power of `n` (`a^n`) efficiently using bitwise operations. This is like **Iron Man calculating the precise trajectory for a complex aerial maneuver** – needing to multiply repeatedly, but wanting to do it with maximum speed!

**LeetCode Link:** [LeetCode 50. Pow(x, n)](https://leetcode.com/problems/powx-n/) (This is a common approach for that problem)

## 🤔 Intuition
The core idea here is "Exponentiation by Squaring," also known as the "Binary Exponentiation" method. We leverage the binary representation of the exponent `n`. Any number `n` can be expressed as a sum of powers of 2. For example, if `n = 6`, its binary is `110`. This means `6 = 4 + 2` (or `2^2 + 2^1`).
So, `a^6 = a^(4+2) = a^4 * a^2`.

We can iterate through the bits of `n` from right to left (LSB to MSB).
* If a bit in `n` is `1`, it means that corresponding power of `a` contributes to our final answer.
* In each step, we effectively square `a` (`a = a * a`) and shift `n` to the right (`n = n >> 1`). This way, `a` always represents `a^(2^k)` for the current bit position `k`. When we encounter a `1` in `n`, we multiply our running `ans` by the current `a`. This method drastically reduces the number of multiplications needed, transforming a potentially linear `O(N)` process into a logarithmic `O(log N)` one. It's like **Doctor Strange opening portals** to skip unnecessary steps in a journey!

## 🛠️ Approach
1.  Initialize `ans` to `1` (as `a^0 = 1`).
2.  Start a `while` loop that continues as long as the exponent `n` is greater than `0`.
3.  Inside the loop:
    * Check the least significant bit (LSB) of `n` using `(n & 1)`.
    * If the LSB is `1` (meaning this power of `a` contributes to the result), multiply `ans` by the current value of `a` (`ans *= a`).
    * Square `a` (`a = a * a`). This prepares `a` for the next bit position (effectively `a^1` becomes `a^2`, `a^2` becomes `a^4`, etc., corresponding to `2^0, 2^1, 2^2, ...`).
    * Right-shift `n` by `1` (`n = n >> 1`). This moves to the next bit of the exponent.
4.  Once `n` becomes `0`, the loop terminates, and `ans` holds the final result `a^n`.
5.  Return `ans`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(log N)` - The loop runs once for each bit in the exponent `n`. For a typical 32-bit integer, this means at most 32 iterations. This is significantly faster than `O(N)` repetitive multiplication, making it a **Quantum Realm jump** in efficiency!
* **Space Complexity:** `O(1)` - Only a few variables are used, making it incredibly memory-efficient. It's as lightweight as **Wasp changing size without any additional mass**.

### Code Explanation:
* `int ans = 1;`: Our **accumulated power**, starting with the base case of `a^0`.
* `while(n > 0)`: The loop continues as long as there are bits left in `n` to process.
* `if ((n & 1) != 0)`: This is the **bit-inspector checking for contribution**.
    * If the LSB of `n` is `1`, it means the current `a` (which is `base^(2^current_bit_position)`) needs to be multiplied into our `ans`. This is like **assembling an active Infinity Stone** into the gauntlet.
* `ans *= a;`: If the bit is `1`, we factor in this power of `a`.
* `a = a * a;`: This is the **squaring step**. In each iteration, `a` is updated to be `a` raised to the power of the *next* bit's place value (e.g., if `a` was `a^2`, now it's `a^4`). It's like **Hulk powering up for the next big smash!**
* `n = n >> 1;`: This **shifts `n` to the right**, moving to the next bit of the exponent for inspection. It's like **the Quinjet cruising to the next target location**.
* `return ans;`: Finally, `ans` contains the product of all necessary `a^(2^k)` terms, resulting in `a^n`. For `powerOfNum(3, 6)`:
    * `n=6 (110)`
    * Iter 1: `n&1` is `0`. `a=3*3=9`. `n=3 (011)`.
    * Iter 2: `n&1` is `1`. `ans=1*9=9`. `a=9*9=81`. `n=1 (001)`.
    * Iter 3: `n&1` is `1`. `ans=9*81=729`. `a=81*81=6561`. `n=0 (000)`.
    * Loop ends. Returns `729` (`3^6`). This method is a **true piece of Stark-level engineering** for efficient computation!