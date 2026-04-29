# 💥 Control Flow - `break_use`: Loop Termination with Break 💥

## 📁 File: `ControlFlow/break_use.java`

## 🎯 Problem Statement
Implement a program that continuously prompts the user for numbers until a number that is a multiple of 10 is entered. Once a multiple of 10 is encountered, the loop should immediately terminate. This is like a **S.H.I.E.L.D. agent on a surveillance mission**: keep gathering intel until a specific, critical event (the multiple of 10) occurs, then extraction is immediate!

**LeetCode Link:** Not applicable (basic I/O and control flow).

## 🤔 Intuition
We need a loop that keeps going indefinitely (`while(true)`) but has a secret escape hatch. The `break` statement is our **Emergency Evacuation Protocol**. It allows us to jump out of the current loop immediately, regardless of the loop's normal condition. We'll use this `break` when our specific condition is met – in this case, when the user inputs a number perfectly divisible by 10. It's a direct, no-nonsense exit, like **Hulk deciding he's done with a fight** and just walks away.

## 🛠️ Approach
1.  Initialize a `Scanner` object to read user input from the console.
2.  Start an infinite `do-while(true)` loop. This loop will execute at least once.
3.  Inside the loop:
    * Prompt the user to enter a number.
    * Read the integer input using `sc.nextInt()`.
    * Check if the entered number is a multiple of 10 using the modulo operator (`%10 == 0`).
    * If it is a multiple of 10, print a message indicating termination and then execute the `break` statement.
    * If it's not a multiple of 10, print the given number and the loop continues.
4.  After the loop (due to the `break`), close the `Scanner` to release resources.
5.  Print a final message confirming successful loop termination.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(K)` - Where `K` is the number of inputs taken until a multiple of 10 is entered. In the worst case, if a multiple of 10 is never entered, it would theoretically be `O(infinity)`. However, for practical purposes, it depends on user input. Each iteration is `O(1)`. This is like **Doctor Strange's time loop**: it continues until a specific condition (like Dormammu giving up) is met.
* **Space Complexity:** `O(1)` - Only a few variables (`sc`, `n`) are used. No additional data structures are created. It's as lightweight as **Ant-Man's Pym Particles** – minimal resource footprint.

### Code Explanation:
* `Scanner sc = new Scanner(System.in);`: Our **communication link** to the user, allowing us to receive input.
* `do { ... } while(true);`: This is our **infinite mission loop**. It will keep repeating its task, much like S.H.I.E.L.D. on perpetual standby. The `do` ensures it runs at least once.
* `int n = sc.nextInt();`: We **receive the intel** (the number) from the user.
* `if ((n % 10) == 0)`: This is our **critical event detector**. We check if the number is perfectly divisible by 10 (i.e., its remainder when divided by 10 is 0).
* `System.out.println("Provided number is multiple of 10, therefore i'm out of the loop"); break;`: This is the **immediate extraction command**. If the condition is met, we print a confirmation and then `break` immediately forces the program out of the `do-while` loop, **like an Avenger dropping out of the sky** to handle a priority threat elsewhere.
* `System.out.println("Given number:" + n);`: If the number wasn't a multiple of 10, we simply **log the received intel** and continue the loop.
* `sc.close();`: After the loop, we **secure our communication lines**.
* `System.out.println("Loop terminated successfully.");`: A final message confirming the **mission is complete**.




# 💥 Control Flow - `calculator`: Simple Calculator using Switch 💥

## 📁 File: `ControlFlow/calculator.java`

## 🎯 Problem Statement
Build a basic command-line calculator that takes two numbers and an operator, then performs the corresponding arithmetic operation. This is like **Jarvis handling a quick computation for Tony Stark**, executing a specific function based on a direct command.

**LeetCode Link:** Not applicable (basic I/O and control flow).

## 🤔 Intuition
When you have multiple possible actions to take based on a single input value (like an operator symbol), a `switch` statement is your **go-to command center**. Instead of a long chain of `if-else if` statements, `switch` allows you to define clear "cases" for each possible operator. The program jumps directly to the matching case, executes the code within it, and then uses `break` to exit the `switch` block, preventing unintended execution of other cases. It's clean, efficient, and much like how **Captain America assigns specific roles to his team** – each hero knows exactly what to do for their designated task.

## 🛠️ Approach
1.  Initialize a `Scanner` object to receive numerical and operator inputs from the user.
2.  Prompt the user to enter two integers (`a` and `b`).
3.  Prompt the user to enter an operator symbol (`+`, `-`, `*`, `/`, `%`). Read this as a character.
4.  Use a `switch` statement on the `choice` (the operator character):
    * Define `case` blocks for each valid operator (`+`, `-`, `*`, `/`, `%`).
    * Inside each case, perform the respective arithmetic operation on `a` and `b`, and print the result.
    * Use a `break` statement at the end of each `case` to exit the `switch` block.
    * Include a `default` case to handle any invalid operator input, printing an error message.
5.  After the `switch` statement completes, close the `Scanner` resource.
6.  Print a message indicating the completion of the calculation.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - The program involves a fixed number of input operations and a single arithmetic calculation chosen by the `switch` statement. All these steps are constant time. This calculation is as immediate as **Thor striking Mjolnir against an enemy**.
* **Space Complexity:** `O(1)` - Only a few variables (`sc`, `a`, `b`, `choice`) are used. No dynamic memory allocation or complex data structures are involved. It's as memory-light as **Groot's single word vocabulary** – incredibly compact.

### Code Explanation:
* `Scanner sc = new Scanner(System.in);`: Our **input interface**, ready to receive commands and data.
* `int a = sc.nextInt(); int b = sc.nextInt();`: We **ingest the raw numbers** for our computation.
* `char choice = sc.next().charAt(0);`: We then **listen for the specific command** (operator). `charAt(0)` ensures we grab just the first character if the user types more.
* `switch(choice) { ... }`: This is our **decision-making hub**, akin to **Jarvis routing a request to the appropriate subroutine**.
    * `case '+': System.out.println("Addition = "+(a+b)); break;`: If the choice is `+`, we perform addition and immediately `break` out of the `switch`. Each `case` is a dedicated **Avenger's specialized skill**.
    * `default : System.out.println("wrong Choice");`: If the `choice` doesn't match any of the defined cases, this `default` block catches it, reporting an invalid command. It's our **error handling system**, preventing the entire operation from going sideways.
* `sc.close();`: After the calculation, we **de-activate the input stream** to conserve resources.
* `System.out.println("Calculation completed successfully.");`: A final confirmation that the **mission objective is fulfilled**.




# 💥 Control Flow - `condition_leapyear`: Check for Leap Year 💥

## 📁 File: `ControlFlow/condition_leapyear.java`

## 🎯 Problem Statement
Determine if a given year is a leap year based on the standard rules.

**LeetCode Link:** Not applicable (basic conditional logic).

## 🤔 Intuition
Leap year rules are a nested set of conditions: divisible by 4, but if also by 100, then it must also be by 400. A **ternary operator is like a quick decision matrix** – it allows condensing these nested `if-else` checks into a single, compact expression.

## 🛠️ Approach
* Get year input from the user.
* Use a nested ternary operator:
    * Check divisibility by 4.
    * If divisible by 4, check divisibility by 100.
    * If divisible by 100, check divisibility by 400.
* Print the resulting "Leap year" or "Non leap year" string.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - Constant time arithmetic operations and comparisons.
* **Space Complexity:** `O(1)` - No extra space allocated.

### Code Explanation:
* `String leapcheck = ...;`: The **nested ternary operator** is the star here, making conditional assignments.
* `(year % 4) == 0`: First check: divisible by 4.
* `? (((year % 100) == 0) ? ... : "Leap year")`: If divisible by 4, check by 100. If by 100, proceed to check by 400. If not by 100, it's a leap year.
* `? (((year % 400) == 0) ? "Leap year" : "Non leap year")`: If divisible by 100, *only then* check by 400 to confirm leap year status.
* The whole expression functions like **Jarvis instantly evaluating complex atmospheric conditions** to predict weather.




# 💥 Control Flow - `conditional_fever`: Temperature Check for Fever 💥

## 📁 File: `ControlFlow/conditional_fever.java`

## 🎯 Problem Statement
Determine if a person has a fever based on their body temperature (in Fahrenheit).

**LeetCode Link:** Not applicable (basic conditional logic).

## 🤔 Intuition
This is a straightforward binary decision: either you have a fever, or you don't. A **simple comparison operator** (`>`) combined with a **ternary operator** acts like a quick medical diagnostic scan, immediately classifying the patient's status. It's a binary outcome, like **whether the Infinity Stones are gathered or scattered.**

## 🛠️ Approach
* Get temperature input (as a double) from the user.
* Use a ternary operator to check if `temp` is greater than 100.
* Assign "Fever" or "No Fever" string based on the comparison.
* Print the result.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - Involves one input read, one comparison, and one print operation.
* **Space Complexity:** `O(1)` - No auxiliary storage used.

### Code Explanation:
* `double temp = sc.nextFloat();`: We **scan the vital signs** (temperature) from the user.
* `String check = (temp > 100) ? "Fever" : "No Fever";`: This **ternary operator** is our rapid diagnostic tool. If `temp` is over 100, it's "Fever"; otherwise, "No Fever." It's like **Jarvis quickly assessing a threat level**: red alert or all clear.
* The result is then printed, giving us the **immediate health report**.




# 💥 Control Flow - `conditional_ques`: Ternary Operator Showcase 💥

## 📁 File: `ControlFlow/conditional_ques.java`

## 🎯 Problem Statement
Demonstrate the use of the ternary operator for both boolean and integer assignments based on a simple comparison.

**LeetCode Link:** Not applicable (basic language feature demonstration).

## 🤔 Intuition
The ternary operator (`? :`) is a **compact, in-line `if-else` statement**. It allows you to evaluate a condition and return one of two values based on whether the condition is true or false. This makes code concise for simple conditional assignments, like **choosing between two paths based on a quick scan of the environment**.

## 🛠️ Approach
* Declare two integer variables, `a` and `b`.
* Use a ternary operator to assign a boolean value to `x` based on whether `a` is less than `b`.
* Use another ternary operator to assign an integer value to `y` (the greater of `a` and `b`) based on whether `a` is greater than `b`.
* Print the values of `x` and `y`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - Fixed number of assignments and comparisons.
* **Space Complexity:** `O(1)` - No auxiliary storage used.

### Code Explanation:
* `boolean x = (a < b) ? true : false;`: This line checks if `a` is less than `b`. If true, `x` becomes `true`; otherwise, `false`. It's a **binary decision**, like whether a **hero wins a popularity contest**.
* `int y = (a > b) ? a : b;`: This line checks if `a` is greater than `b`. If true, `y` takes the value of `a`; otherwise, `y` takes the value of `b`. This effectively finds the **maximum of the two values**, much like **selecting the stronger Avenger for a specific task**.
* The code then **reports the results** of these quick conditional assignments.




# 💥 Control Flow - `conditionalposneg`: Check Positive or Negative 💥

## 📁 File: `ControlFlow/conditionalposneg.java`

## 🎯 Problem Statement
Determine if an integer entered by the user is positive or negative (including zero as positive).

**LeetCode Link:** Not applicable (basic conditional logic).

## 🤔 Intuition
Classifying a number as positive or negative is a fundamental binary decision. The **ternary operator** is perfectly suited for this quick, concise check. It's like **Iron Man's Heads-Up Display (HUD)** giving an immediate "friendly" or "foe" classification based on a simple sensor reading.

## 🛠️ Approach
* Get an integer input (`a`) from the user.
* Use a ternary operator to check if `a` is greater than or equal to zero (`a >= 0`).
* If true, the output string is "Positive"; otherwise, it's "Negative".
* Print the result.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - Involves one input read, one comparison, and one print operation.
* **Space Complexity:** `O(1)` - No auxiliary storage used.

### Code Explanation:
* `int a = sc.nextInt();`: We **scan the incoming data** (the number) from the user.
* `String output = (a >= 0) ? "Positive" : "Negative";`: This **ternary operator** is our rapid classification system. If `a` is 0 or more, it's "Positive"; otherwise, it's "Negative." It's as quick and clear as **Captain America's judgment of character**: good or bad.
* The result is then printed, giving us the **immediate verdict** on the number's sign.




# 💥 Control Flow - `ifelse_largestof2`: Find Larger of Two Numbers 💥

## 📁 File: `ControlFlow/ifelse_largestof2.java`

## 🎯 Problem Statement
Determine and print which of two given integers is greater.

**LeetCode Link:** Not applicable (basic comparison).

## 🤔 Intuition
When you need to perform one action if a condition is true and a different action if it's false, the **`if-else` statement** is your fundamental tool. It provides a clear fork in the road, ensuring only one path is taken based on a comparison. It's like **Captain America choosing which flank to attack** based on enemy strength.

## 🛠️ Approach
* Get two integer inputs (`a` and `b`) from the user.
* Use an `if-else` statement:
    * The `if` condition checks if `a` is greater than or equal to `b`.
    * If true, print a message indicating `a` is greater.
    * Otherwise (in the `else` block), print a message indicating `b` is greater.
* Close the `Scanner`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - Involves two input reads, one comparison, and one print operation.
* **Space Complexity:** `O(1)` - No auxiliary storage used.

### Code Explanation:
* `int a = sc.nextInt(); int b = sc.nextInt();`: We **scan the combatants' stats** (the numbers).
* `if (a >= b)`: This is the **primary assessment**. We check if `a` has the equal or greater 'power level' than `b`.
* `System.out.println("a greater than b");`: If the `if` condition is true, this statement executes. It's the **affirmation of strength**.
* `else { System.out.println("b greater than a"); }`: If the `if` condition is false, the `else` block executes. This is the **alternative outcome**, like **Iron Man acknowledging a stronger opponent** when facing Thanos.
* The code clearly shows how `if-else` guides the program down one specific path.




# 💥 Control Flow - `ifelse_oddeven`: Check Odd or Even 💥

## 📁 File: `ControlFlow/ifelse_oddeven.java`

## 🎯 Problem Statement
Determine if an integer entered by the user is an odd or an even number.

**LeetCode Link:** Not applicable (basic arithmetic and conditional logic).

## 🤔 Intuition
The simplest way to check for odd or even is by using the modulo operator (`%`). If a number divided by 2 leaves no remainder (`% 2 == 0`), it's even. Otherwise, it's odd. The **`if-else` statement** acts as a reliable **binary classifier**, like **Vision distinguishing between an ally and an enemy** based on a quick scan.

## 🛠️ Approach
* Get an integer input (`num`) from the user.
* Use an `if-else` statement:
    * The `if` condition checks if `num` modulo 2 is equal to 0.
    * If true, print a message indicating the number is "Even".
    * Otherwise (in the `else` block), print a message indicating the number is "Odd".
* Close the `Scanner`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - Involves one input read, one modulo operation, one comparison, and one print.
* **Space Complexity:** `O(1)` - No auxiliary storage used.

### Code Explanation:
* `int num = sc.nextInt();`: We **scan the number for its parity** from the user.
* `if (num % 2 == 0)`: This is the **parity test**. If the remainder after division by 2 is 0, it's an even number.
* `System.out.println("Number given is Even");`: If the number passes the test, it's confirmed "Even."
* `else { System.out.println("Number given is odd"); }`: If not even, it falls into the "Odd" category. This clear separation is like **Captain America splitting his forces**: one group for evens, another for odds.
* The result provides an **immediate classification** of the number's nature.




# 💥 Control Flow - `ifelse_tax`: Income Tax Calculator 💥

## 📁 File: `ControlFlow/ifelse_tax.java`

## 🎯 Problem Statement
Calculate the income tax based on varying income slabs using `if-else if-else` statements.

**LeetCode Link:** Not applicable (basic conditional logic).

## 🤔 Intuition
When you have multiple, mutually exclusive conditions where only one block of code should execute, an **`if-else if-else` ladder** is your perfect tool. It processes conditions sequentially, executing the first one that evaluates to true and skipping the rest. This is like **Nick Fury assigning tasks based on clearance levels**: the highest clearance gets the first shot, and if they don't take it, it moves down the chain.

## 🛠️ Approach
* Get income input from the user.
* Use an `if-else if-else` ladder:
    * If `income` is less than 500,000, `tax` is 0.
    * Else if `income` is between 500,000 and less than 1,000,000, `tax` is 20% of income.
    * Else (for income 1,000,000 or more), `tax` is 30% of income.
* Print the calculated tax.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - Involves one input read, a few comparisons, a multiplication, and a print.
* **Space Complexity:** `O(1)` - No auxiliary storage used.

### Code Explanation:
* `int income = sc.nextInt();`: We **receive the financial data** (income) from the user.
* `if (income < 500000)`: This is the **first-tier assessment**. If income falls into the lowest bracket, `tax` is `0`.
* `else if (income >= 500000 && income < 1000000)`: This is the **second-tier assessment**. If the first condition isn't met, we check if income falls into the middle bracket, and calculate 20% tax. This cascading logic is like **Iron Man's suit diagnostics checking systems one by one** until a relevant issue (or tax bracket) is found.
* `else`: This is the **catch-all for the highest bracket**. If previous conditions are false, this executes, applying 30% tax.
* `tax = (int)(income * 0.2);` / `tax = (int)(income * 0.3);`: The `(int)` cast is crucial here, **converting the calculated tax to a whole number**, preventing fractional tax amounts.
* The code then prints the **final tax liability**, much like **a financial report from Wakanda** detailing its vibranium profits.





# 💥 Control Flow - `ifelse_vote`: Age-Based Classification 💥

## 📁 File: `ControlFlow/ifelse_vote.java`

## 🎯 Problem Statement
Classify a person's age into categories: Adult, Teenager, or Not Adult, based on predefined age ranges.

**LeetCode Link:** Not applicable (basic conditional logic).

## 🤔 Intuition
When categorizing data into several distinct groups, especially with overlapping or sequential conditions, an **`if-else if-else` structure** acts as a reliable decision tree. It processes each condition in order, ensuring that once a match is found, the corresponding action is taken, much like **S.H.I.E.L.D. assigning agents to different threat levels** based on their experience.

## 🛠️ Approach
* Get age input from the user.
* Use an `if-else if-else` ladder:
    * If `age` is 18 or greater, classify as "Adult".
    * Else if `age` is greater than 12 and less than 18, classify as "Teenager".
    * Else (for all other ages), classify as "Not Adult".
* Print the determined classification.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - Involves one input read, a few comparisons, and a print operation.
* **Space Complexity:** `O(1)` - No auxiliary storage used.

### Code Explanation:
* `int age = sc.nextInt();`: We **scan the individual's age** for classification.
* `if (age >= 18)`: This is the **primary check for adulthood**. If true, the person is an "Adult."
* `else if (age > 12 && age < 18)`: If not an adult, this is the **secondary check for the 'in-between' stage**. The `&&` operator ensures both conditions must be true, like **requiring both strength and agility for a specific mission**. If true, the person is a "Teenager."
* `else`: This is the **catch-all category**. If neither of the above conditions is met, the person is simply "Not Adult." This system efficiently classifies, much like **Jarvis categorizing threats** from immediate to low priority.
* The code then **reports the final age-based classification**.





# 💥 Control Flow - `largestof3`: Find Largest of Three Numbers 💥

## 📁 File: `ControlFlow/largestof3.java`

## 🎯 Problem Statement
Determine and print the largest among three given integers.

**LeetCode Link:** Not applicable (basic comparison).

## 🤔 Intuition
To find the single largest value among three, we can use a series of comparisons. The **`if-else if-else` structure** acts as a competitive arena, sequentially checking if each number is superior to the others. The first one that proves itself the strongest claims the title! This is like **determining the strongest Avenger** in a friendly spar.

## 🛠️ Approach
* Get three integer inputs (`a`, `b`, and `c`) from the user.
* Use an `if-else if-else` ladder:
    * The `if` condition checks if `a` is greater than both `b` and `c`.
    * Else if, check if `b` is greater than both `a` and `c`.
    * Else (if neither `a` nor `b` is the largest), `c` must be the largest.
* Print the result.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - Involves three input reads, a few comparisons, and one print.
* **Space Complexity:** `O(1)` - No auxiliary storage used.

### Code Explanation:
* `int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();`: We **scan the power levels** of our three contenders.
* `if (a > b && a > c)`: This is the **initial challenge for 'a'**. The `&&` ensures `a` must be greater than *both* `b` and `c`. If true, `a` is the largest.
* `else if (b > a && b > c)`: If `a` isn't the largest, `b` gets its turn to prove dominance. This is the **second challenger stepping up**.
* `else`: If neither `a` nor `b` proved to be the largest, then by elimination, `c` must be. This is the **default champion** if others fall short.
* The code clearly identifies the **ultimate victor** among the three numbers.




# 💥 Control Flow - `prime`: Prime Number Checker 💥

## 📁 File: `ControlFlow/prime.java`

## 🎯 Problem Statement
Determine if a given integer is a prime number.

**LeetCode Link:** Not a specific LeetCode problem, but a fundamental number theory concept.

## 🤔 Intuition
A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself. To check for primality, we only need to test for divisibility by numbers from 2 up to the square root of the given number. If any number in this range divides it evenly, it's composite. This optimization saves a lot of checks, like **Doctor Strange narrowing down possibilities to find the single true outcome.**

## 🛠️ Approach
* Get an integer `n` from the user.
* Handle the special case: if `n` is `2`, it's prime.
* For `n > 2`, iterate from `i = 2` up to `sqrt(n)`:
    * If `n` is divisible by `i`, it's composite. Set a flag and stop checking.
* Based on the flag, print whether the number is Prime or Composite.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(sqrt(N))` - The loop runs up to the square root of the input number `N`. This is much faster than `O(N)`, like **Flash's super-speed allowing him to check possibilities far quicker**.
* **Space Complexity:** `O(1)` - Only a few variables are used.

### Code Explanation:
* `if (n == 2)`: **Special case handling.** `2` is the only even prime number, so it's handled separately.
* `boolean istrue = true;`: This acts as our **"prime" flag**, initially assuming the number is innocent (prime) until proven guilty.
* `for (int i=2; i <= Math.sqrt(n); i++)`: This loop iterates through potential divisors. We only need to check up to `sqrt(n)` because if `n` has a divisor greater than its square root, it must also have one smaller than its square root.
* `if ((n % i) == 0) istrue = false;`: If `n` is divisible by `i`, it's composite, so we flip our flag.
* `break;`: **Critical note**: In the provided code, this `break` statement is inside the `if` block. This means the loop will **only check for divisibility by `2`** and then immediately exit, leading to incorrect results for many numbers (e.g., `9` would be incorrectly labeled prime). For a correct prime check, the `break` should only be executed *after* setting `istrue = false;` or removed if you're checking all `i` up to `sqrt(n)` to find a divisor.
* The final `if (istrue == true)` block then **announces the verdict** – whether the number maintains its 'prime' status or is 'composite', just like **a jury's final decision on a case**.




# 💥 Control Flow - `switch1`: Menu Choice Selector 💥

## 📁 File: `ControlFlow/switch1.java`

## 🎯 Problem Statement
Implement a program that provides a menu of choices and prints a corresponding item based on the user's integer input.

**LeetCode Link:** Not applicable (basic control flow).

## 🤔 Intuition
When you have a single variable that needs to trigger different actions based on its specific value, a **`switch` statement is your efficient dispatcher**. It directly jumps to the matching `case`, avoiding multiple `if-else if` checks. This is like **Nick Fury picking a specific Avenger for a mission** based on their unique abilities – direct and targeted.

## 🛠️ Approach
* Get an integer `choice` from the user.
* Use a `switch` statement on `choice`:
    * Define `case` blocks for specific values (1, 2, 3).
    * Inside each case, print the corresponding menu item.
    * Use `break` to exit the `switch` after a match.
    * Include a `default` case for invalid inputs.
* Close the `Scanner`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - Input read, a single comparison to match a `case`, and a print.
* **Space Complexity:** `O(1)` - No auxiliary storage used.

### Code Explanation:
* `int choice = sc.nextInt();`: We **receive the user's order** from the menu.
* `switch (choice) { ... }`: This is our **menu order processing system**.
* `case 1: System.out.println("Samosa"); break;`: If `choice` is `1`, print "Samosa" and `break`. Each `case` is a **specific menu item's recipe**, perfectly prepared.
* `default: System.out.println("We Wake Up");`: If `choice` doesn't match any `case`, this `default` handles the unexpected, like **the Avengers being alerted to a new, unforeseen threat**.
* The `break` statements are crucial, ensuring that once an item is selected, we **don't accidentally prepare other items** from the menu.




# 💥 Control Flow - `switchweek`: Day of the Week Selector 💥

## 📁 File: `ControlFlow/switchweek.java`

## 🎯 Problem Statement
Given a number from 1 to 7, print the corresponding day of the week.

**LeetCode Link:** Not applicable (basic control flow).

## 🤔 Intuition
When mapping numerical choices to distinct outcomes, a **`switch` statement** is the most direct and readable approach. It's like having a **detailed Avenger's roster**: input a number, and you immediately get the specific hero (day) assigned.

## 🛠️ Approach
* Get an integer `choice` (1-7) from the user.
* Use a `switch` statement on `choice`:
    * Define `case` blocks for numbers 1 through 7.
    * Print the corresponding day of the week for each `case`.
    * Use `break` after each `case` to prevent "fall-through."
    * Include a `default` case for invalid inputs.
* Close the `Scanner`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - Input read, a single comparison to match a `case`, and a print.
* **Space Complexity:** `O(1)` - No auxiliary storage used.

### Code Explanation:
* `int choice = sc.nextInt();`: We **receive the numeric command** for the day of the week.
* `switch(choice) { ... }`: This is our **"Day Decoder"**, swiftly identifying the correct day.
* `case 1: System.out.println("Monday"); break;`: For each `case`, it directly maps the number to a day. The `break` is essential, preventing the code from running into the next day's printout, like **ensuring an Avenger completes their specific task without starting another's!**
* `default: System.out.println("Wrong Choice filled");`: This handles any number outside 1-7, acting as a **system alert for incorrect input**.




# 💥 Control Flow - `ternary`: Even/Odd Check with Ternary 💥

## 📁 File: `ControlFlow/ternary.java`

## 🎯 Problem Statement
Determine and print whether a given integer is even or odd using the ternary operator.

**LeetCode Link:** Not applicable (basic language feature demonstration).

## 🤔 Intuition
For simple `if-else` scenarios where you need to assign one of two values based on a condition, the **ternary operator** (`? :`) offers extreme conciseness. It's like **Jarvis giving a quick 'affirmative' or 'negative' response** based on a sensor reading, streamlining the decision-making process.

## 🛠️ Approach
* Get an integer `num` from the user.
* Use the ternary operator: `(condition) ? value_if_true : value_if_false`.
    * The condition checks if `num` is divisible by 2 (`num % 2 == 0`).
    * If true, assign "Even"; otherwise, assign "Odd".
* Print the resulting string.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - Single input, one modulo operation, one comparison, and one print.
* **Space Complexity:** `O(1)` - No auxiliary storage used.

### Code Explanation:
* `int num = sc.nextInt();`: We **scan the number's digital signature**.
* `String type = ((num % 2) == 0) ? "Even" : "Odd";`: This single line is our **powerful, compact decision engine**.
    * `(num % 2) == 0`: Checks if the number is perfectly divisible by 2.
    * `? "Even" : "Odd"`: If the condition is true, `type` becomes "Even"; otherwise, it becomes "Odd".
* This direct assignment shows how a ternary operator can **efficiently classify outcomes**, much like **Vision instantly discerning a threat's type**.




# 💥 Control Flow - `ternarymarks`: Student Result with Ternary 💥

## 📁 File: `ControlFlow/ternarymarks.java`

## 🎯 Problem Statement
Determine a student's result (PASS, FAIL, or Invalid) based on their percentage marks, using nested ternary operators.

**LeetCode Link:** Not applicable (basic conditional logic).

## 🤔 Intuition
When evaluating multiple, hierarchical conditions for an outcome, **nested ternary operators** offer a highly compressed way to write the logic. First, we validate the input (marks must be within 0-100). If valid, we then apply the pass/fail criterion. It's like **Tony Stark's suit running a multi-stage diagnostic**: first, is the system online? Then, are core functions operational? All in one rapid sequence.

## 🛠️ Approach
* Get integer `marks` input from the user.
* Use a nested ternary operator:
    * The outer condition checks if `marks` are between 0 and 100 (inclusive).
    * If valid, the inner ternary checks if `marks` are greater than or equal to 33.
        * If `marks >= 33`, result is "PASS".
        * Else, result is "FAIL".
    * If the outer condition is false, result is "Invalid".
* Print the `result` string.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(1)` - Input read, a few comparisons, and a print.
* **Space Complexity:** `O(1)` - No auxiliary storage used.

### Code Explanation:
* `int marks = sc.nextInt();`: We **receive the student's performance data**.
* `String result = (marks >= 0 && marks <= 100) ? ... : "Invalid";`: This is the **outer gatekeeper**.
    * `(marks >= 0 && marks <= 100)`: First, it validates if the marks are in a realistic range (`0-100`). If not, it immediately sets `result` to "Invalid", like **S.H.I.E.L.D. discarding clearly false intelligence**.
* `((marks >= 33) ? "PASS" : "FAIL")`: This is the **inner decision-maker**, executed only if marks are valid.
    * `(marks >= 33)`: Checks if the marks meet the passing threshold. If true, `result` is "PASS"; otherwise, "FAIL". This is our **pass/fail classifier**, as straightforward as **Captain America's moral compass**.
* The code then prints the **final academic verdict**.