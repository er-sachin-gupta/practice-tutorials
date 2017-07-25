package com.educationalera.arrays;

import java.util.Arrays;

/**
 * Created by Sachin Gupta.
 * A Program to copy an array from another array using copyOfRange method of Arrays Class.
 * Arrays.copyOfRange() method either copies full array or partial array.
 */
public class CopyArrayUsingCopyOfRangeMethod {
    public static void main(String[] args){
        String[] arr1 = {"Educational", "Era", "Dot", "Com"};
        System.out.println("Elements of First Array are : " + Arrays.toString(arr1));

        String[] arr2 = Arrays.copyOfRange(arr1, 0, arr1.length);
        System.out.println("Elements of Second Array are : " + Arrays.toString(arr2)); // To Copy all elements of Array

        //Copy only Last 2 elements of Second Array
        String arr3[] = Arrays.copyOfRange(arr2, 2,4 );
        System.out.println("Elements of Third Array i.e. last 2 elements of Second Array are : " + Arrays.toString(arr3));

        //Copy middle 2 elements of First Array
        String arr4[] = Arrays.copyOfRange(arr1, 1,3);
        System.out.print("Elements of Fourth Array i.e. Middle 2 elements of First Array are : ");
        for(String obj : arr4){
            System.out.print(obj + " ");
        }
    }
}
