package com.educationalera.arrays;

import java.util.Arrays;

/**
 * Created by Sachin Gupta.
 * A Simple Program to copy an array from another array.
 * Intializing array from another array.
 *  This is not a Recommended way to copy Array
 */

public class CopyArray {
    public static void main(String[] args){
        int arr1[] = {1, 3, 8, 10, 20, 50, 90};
        System.out.println("Elements of Array are : " + Arrays.toString(arr1));

        int arr2[] = arr1; // Means array 2 is referring to same location referred by array 1
        System.out.println("Elements of Second Array are : " + Arrays.toString(arr2));

        arr1[3] = 13; // arr2[3] will display 13. Same Reference.
        System.out.println("Elements of Second Array, after changing element of First array: " + Arrays.toString(arr2));

        arr2[4] = 17; // arr1[4] will also display 20, because of same reference used by arr2
        System.out.println("Elements of First Array, after changing element of Second array: " + Arrays.toString(arr1));
    }
}
