package com.educationalera.arrays;

import java.util.Arrays;

/**
 * Created by Sachin Gupta.
 * A Program to copy an array from another array using clone method of Object Class.
 * Array inherits methods from Object class.
 * Recommended way to copy Array
 */
public class CopyArrayUsingCloneMethod {
    public static void main(String[] args){
        int[] arr1 = {0, 7, 8, 2, 90, 34};
        System.out.println("Elements of First Array are : " + Arrays.toString(arr1));

        int[] arr2 = arr1.clone();
        System.out.println("Elements of Second Array are : " + Arrays.toString(arr2));

        arr1[1] = 17; // Set Second element of First Array to 17
        System.out.println("\n\nSet Second element of First Array to 17");
        System.out.println("Elements of First Array are : " + Arrays.toString(arr1));
        System.out.println("Elements of Second Array are : " + Arrays.toString(arr2) + " No Change here");

        arr2[4] = 87; // Set Fifth element of Second Array to 87
        System.out.println("\n\nSet Fifth element of Second Array to 87");
        System.out.println("Elements of First Array are : " + Arrays.toString(arr1) + " No Change here");
        System.out.println("Elements of Second Array are : " + Arrays.toString(arr2));

    }
}
