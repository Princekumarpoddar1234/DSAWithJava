# Variables & Data Types in Java

This folder contains Java source code and notes related to the fundamental concepts of **variables** and **data types** in Java.

## Contents

- **Variable Declaration and Initialization:**  
  Learn how to declare variables, assign values, and understand variable scope.

- **Primitive Data Types:**  
  Explore Java's built-in data types such as `int`, `float`, `double`, `char`, `boolean`, `byte`, `short`, and `long`.

- **Reference Data Types:**  
  Understand objects, arrays, and how reference types differ from primitives.

- **Type Conversion and Casting:**  
  Examples of implicit and explicit type conversion in Java.

- **Best Practices:**  
  Tips for naming variables, choosing appropriate data types, and writing readable code.

## How to Use

1. Open the Java files in this folder to review code examples and explanations.
2. Compile and run the code using your preferred Java IDE or the command line to see how variables and data types work in practice.

## Additional Resources

- [Official Java Documentation - Data Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- [Java Variables (W3Schools)](https://www.w3schools.com/java/java_variables.asp)

---





# Circle Area Calculator

This Java program calculates the area of a circle based on user input for the radius.

## How It Works

- The program prompts the user to enter the radius of a circle.
- It reads the radius as an integer from the console.
- It calculates the area using the formula:  
  `area = 3.14 × radius × radius`
- The calculated area is displayed to the user.

## Example

```
Enter radius of circle:
5
Area of circle is: 78.5
```

## How to Run

1. Compile the program:
   ```
   javac Circle.java
   ```
2. Run the program:
   ```
   java Circle
   ```

---





# Stationery Bill Calculator

This Java program calculates the total cost of purchasing a pencil, pen, and eraser based on user input.

## How It Works

- The program prompts the user to enter the cost of a pencil, pen, and eraser (in that order).
- It reads the three costs as floating-point numbers.
- It calculates the total cost by summing the three values.
- The total cost is then displayed to the user.

## Example

```
Enter the cost of pencil, pen, and eraser respectively:
5.5
10
3.25
Total cost: 18.75
```

## How to Run

1. Compile the program:
   ```
   javac StationeryBill.java
   ```
2. Run the program:
   ```
   java StationeryBill
   ```

---





# Java Data Types and Expressions Demo

This Java program demonstrates the use of various primitive data types, arithmetic operations, type casting, and valid variable naming conventions in Java.

## How It Works

- Declares variables of types: `byte`, `char`, `short`, `int`, `float`, and `double`.
- Performs a complex arithmetic expression involving multiplication, modulus, and subtraction with mixed data types.
- Prints the result of the arithmetic expression.
- Demonstrates that variable names can include the `$` symbol by declaring and printing an integer variable named `$`.

## Example Output

```
-51147.72
24
```

## How to Run

1. Compile the program:
   ```
   javac test.java
   ```
2. Run the program:
   ```
   java test
   ```

---





# Java Type Promotion Demonstration

This Java program demonstrates type promotion in arithmetic expressions involving different primitive data types.

## How It Works

- Declares variables of types: `int`, `float`, `long`, and `double`.
- Adds all variables together in a single expression.
- Java automatically promotes all operands to the widest type (`double` in this case) during the calculation.
- Prints the result, showing how type promotion works in mixed-type arithmetic.

## Example Output

```
85.25
```

## How to Run

1. Compile the program:
   ```
   javac type_promotion.java
   ```
2. Run the program:
   ```
   java type_promotion
   ```

---