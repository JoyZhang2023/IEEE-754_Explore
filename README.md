# Assignment: Understanding IEEE 754 Floating Point Numbers - Practical Exercises
AD 315 Assignment

## Requirements
For these exercises, students can use a programming language that supports IEEE 754 floating-point arithmetic (like Python, Java, or C++).

### Convert Decimal to IEEE 754 Format
Write a function to convert a decimal number to its IEEE 754 32-bit single-precision floating-point binary representation.

### Arithmetic Operations
Perform the following arithmetic operations in your chosen programming language and show the IEEE 754 results:
0.1 + 0.2
1.0/3.0
Explain any discrepancies observed from the expected decimal results.

### Special Values Handling
Write code to generate positive infinity, negative infinity, and NaN using arithmetic operations. Verify by checking their properties (like checking if NaN is not equal to itself).

### Rounding Modes
Experiment with different rounding modes available in your programming environment. Provide examples where different rounding modes lead to different results.

### Underflow and Overflow
Demonstrate underflow and overflow scenarios with specific examples.

### Visualizing Precision Loss
Create a plot to visualize the loss of precision that occurs as numbers become very small (denormalized numbers) or very large.

### Comparative Study
Compare how different programming languages or systems handle IEEE 754 arithmetic differently. This can involve differences in default rounding modes, how exceptions like overflow or underflow are handled, etc.

#### Default Rouding Modes
Python and Java use “round to nearest, ties to even” as the default rounding mode. C and C++ also default to “round to nearest, ties to even” but allow changing the rounding mode using functions like fesetround from the fenv.h library.
#### Overflow and Underflow
Python: Overflow results in inf (infinity), and underflow results in `0.0` or a very small number close to zero. Python raises an OverflowError for integer overflow but handles floating-point overflow by returning `inf`.
Java: Similar to Python, Java handles overflow by returning `Infinity` and underflow by returning `0.0` or a very small number. Java does not raise exceptions for floating-point overflow or underflow.
C/C++: Overflow results in `HUGE_VAL`, `HUGE_VALF`, or `HUGE_VALL` for floating-point types, and underflow results in `0.0` or a very small number. C/C++ can raise floating-point exceptions if configured to do so.

## Vidoe demo
Language: Java
https://github.com/user-attachments/assets/b829792b-cbc6-48c3-9c36-0be64739269c

