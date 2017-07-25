package com.educationalera.arrays;

import java.util.Arrays;

/**
 * Created by Sachin Gupta.
 * A Program to copy an array from another array using copyOf method of Arrays Class.
 * Arrays.copyOf() method either copies full array or partial array.
 */

public class CopyArrayUsingCopyOfMethod {
    public static void main(String[] args) {
        String[] arr1 = {"Educational", "Era", "Dot", "Com"};
        System.out.println("Elements of First Array are : " + Arrays.toString(arr1));

        String[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println("Elements of Second Array are : " + Arrays.toString(arr2)); // Copy Full Array

        //Copy only First 3 elements of Array
        String arr3[] = Arrays.copyOf(arr2, 2);
        System.out.println("Elements of Third Array with only 2 elements are : " + Arrays.toString(arr3)); // Copy Full Array
    }
}