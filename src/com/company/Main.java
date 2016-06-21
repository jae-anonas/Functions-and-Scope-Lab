package com.company;

/*

Requirements

Please write code that implements various functions, following the requirements in the list below:

Define a function, parameterCount, that accepts an unknown number of String parameters, and prints
out the the number of parameters.

Define a function stringLength, that accepts a String parameter, and prints out the length of the String.

Define a function longestString, that accepts two String parameters of different length, and returns
the String with the longest length. Print the returned value to the command line.

Define a function userInput, asks the user to type something into the command line, uses the Scanner
class we used during the lesson to take the String the user provides in the command line and prints
it back to the command line.

Define a function typeQuit, asks the user to type something into the command line, prints the String,
then continues to ask the user to type something until the user types in quit. Use the Scanner class
we used during the lesson, to take the String the user provides in the command line. hint: this requires
recursion

Bonus

Define a function isEven, that takes an int parameter, and returns true if the number is even, false
if it is not. Print this returned value to the command line. Note how do we know a number is even?

Define a function fibonacci, that takes an int parameter, and prints out the fibonacci sequence up
to that value. Note: Fibonacci sequence: given a number N, the fibonacci sequence equals the sum of
(N-1) + (N-2) hint: this requires recursion
 */


import java.util.Scanner;

public class Main {

    static void parameterCount(String... strings) {
        System.out.println(strings.length);
    }

    static void stringLength(String str){
        System.out.println(str.length());
    }

    static String longestString(String str1, String str2){
        String longerStr = str1;
        if (str2.length() > str1.length())
            longerStr = str2;

        System.out.println(longerStr);
        return longerStr;
    }

    static void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        System.out.println("User input: " + sc.nextLine().toString());
    }

    static void typeQuit() {
        Scanner sc = new Scanner(System.in);

        if (sc.nextLine().equalsIgnoreCase("quit"))
            return;

        typeQuit();
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static void fibonacci(int num) {


    }



    public static void main(String[] args) {
	    // write your code here
        //System.out.println(fibonacci(4));
        
    }
}
