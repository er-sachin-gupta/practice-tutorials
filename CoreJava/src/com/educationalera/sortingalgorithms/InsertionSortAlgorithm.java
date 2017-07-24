package com.educationalera.sortingalgorithms;

/**
 * Created by Sachin Gupta on 21-07-2017.
 * Program to Implement Insertion Sort Algorithm in Java
 */

public class InsertionSortAlgorithm {

    public static int[] insertionSortAlgo(int[] array){
        //Calculation no. of elements in array
        int i, j, l = array.length;
        int tempVar;
        for(i = 1 ; i < l ; i++){
            tempVar = array[i];
            for(j = i ; j > 0 && tempVar < array[j-1] ; j--){
                array[j] = array[j-1];
            }
            array[j] = tempVar;
        }
        return array;
    }

    public static void main(String[] args){
        int[] unSortedItemArray = {3, 1, 15, -2, 2, 12, 20, 7, 13, 10};

        //Displaying the Unsorted Array Elements
        System.out.print("Unsorted Array Elements are : ");
        for(int i = 0 ; i < unSortedItemArray.length ; i++ ){
            System.out.print(unSortedItemArray[i] + "\t");
        }

        int[] sortedItemArray = insertionSortAlgo(unSortedItemArray);

        //Displaying the Sorted Array Elements
        System.out.print("\nSorted Array Elements are : ");
        for(int arr: sortedItemArray){
            System.out.print(arr + "\t");
        }

    }
}
