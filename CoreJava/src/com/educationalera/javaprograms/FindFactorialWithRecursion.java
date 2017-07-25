package com.educationalera.javaprograms;

import java.util.Scanner;

/**
 * Created by Sachin Gupta.
 *  Program to find factorial of number using Recursion
 */

public class FindFactorialWithRecursion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find factorial : ");
        int number = scanner.nextInt();
        System.out.println("Factorial of "+ number + " is : " + findFactorial(number));
    }

    public static int findFactorial(int n){
            if(n == 0) return 0;
            else if(n == 1) return 1;
            else return n*findFactorial(n-1);
    }
}
