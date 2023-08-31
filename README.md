# PiDigitAnalyzer
Program Name: PiDigitAnalyzer
PiDigitAnalyzer is a small Java program that reads the first 100 digits of the mathematical constant π (pi) from a file named "Pi100" and analyzes the frequency distribution of each digit (0-9). The program then generates a histogram to visualize the distribution of digit occurrences.

How to Use
Compile: Compile the program by running the following command in your terminal:

javac PiDigitAnalyzer.java
Run: Run the compiled program using the following command:

java PiDigitAnalyzer
Output: The program will display the frequency of each digit and generate a histogram to visualize the distribution of digit occurrences. The histogram uses asterisks (*) to represent the count of each digit. The scaling of asterisks is based on the maximum count of any digit.

Sample Output:

number of 0s: 93
number of 1s: 116
number of 2s: 103
number of 3s: 103
number of 4s: 93
number of 5s: 97
number of 6s: 94
number of 7s: 95
number of 8s: 101
number of 9s: 106
---------------------------------------------------------------------------------------------------- 
number of 0s: ******
number of 1s: *******
number of 2s: ******
number of 3s: ******
number of 4s: ******
number of 5s: ******
number of 6s: ******
number of 7s: ******
number of 8s: ******
number of 9s: *******

Note: Make sure to have a file named "Pi100" in the same directory as the program file. The "Pi100" file should contain the first 100 digits of π (pi).
