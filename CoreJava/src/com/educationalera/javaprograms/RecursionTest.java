package com.educationalera.javaprograms;

/**
 * Created by Sachin Gupta
 * A simple program on Recursion in Java
 */
public class RecursionTest {
    static int count= 0;
    public static void func(){
        count++;
        if(count <= 10) {
            System.out.println(count + " Educational Era Dot Com has best tutorials");
            func();
        }
    }
    public static void main(String[] args){
        //Initiating Recursive Function
        func();
    }
}
