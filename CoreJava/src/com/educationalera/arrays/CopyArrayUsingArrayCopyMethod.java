package com.educationalera.arrays;

import java.util.Arrays;

/**
 * Created by Sachin Gupta.
 * A Program to copy an array from another array using arraycopy() method of System Class.
 * System.arraycopy() method either copies full array or partial array.
 * Syntax : arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 */

public class CopyArrayUsingArrayCopyMethod {
    public static void main(String args[]){
        String[] arr1 = {"Educational", "Era", "Dot", "Com", "has", "best", "tutorials"};
        System.out.println("Elements of First Array are : " + Arrays.toString(arr1));

        //Copy all elements of one array into another
        String[] arr2 = new String[arr1.length];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        System.out.println("Elements of Second Array are : " + Arrays.toString(arr2));

        //Copy last three elements from one array into another
        Object arr3[] = new Object[3];
        System.arraycopy(arr1, 4, arr3, 0, 3);
        System.out.println("Elements of Third Array are i.e. last three elements of first array : " + Arrays.toString(arr3));

        //Copy two middle elements from one array into another
        Object[] arr4 = new Object[2];
        System.arraycopy(arr1, 2, arr4, 0, 2);
        System.out.println("Elements of Fourth Array are i.e. middle 2 elements of first array : " + Arrays.toString(arr4));
    }
}
