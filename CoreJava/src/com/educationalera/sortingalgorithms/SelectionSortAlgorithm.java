package com.educationalera.sortingalgorithms;

/**
 * Created by Sachin Gupta on 21-07-2017.
 * Program to Implement Selection Sort Algorithm in Java
 */

public class SelectionSortAlgorithm {

    //Selection Sort Algorithm
    public static int[] selectionSortAlgo(int[] Array){
        int index;

        //Calculating no. of elements in array
        int l = Array.length;

        for(int i = 0 ; i < l-1; i++){
            index = i;
            for(int j = i+1 ; j < l ; j++ ){
                if(Array[j] < Array[index]){
                    index = j;
                }
            }

            //Exchange Elements
            swapPositon(index, i, Array);
        }

        return Array;

    }

    //Method for swapping of Array Elements
    public static void swapPositon(int smallestNumberIndex, int swappingElementIndex, int[] Array){
        int temp = Array[smallestNumberIndex];
        Array[smallestNumberIndex] = Array[swappingElementIndex];
        Array[swappingElementIndex] = temp;
    }

    public static void main(String[] args){
        int[] unSortedItemArray = {3, 1, 15, -2, 2, 12, 20, 7, 13, 10};

        //Displaying the Unsorted Array Elements
        System.out.print("Unsorted Array Elements are : ");
        for(int i = 0 ; i < unSortedItemArray.length ; i++ ){
            System.out.print(unSortedItemArray[i] + "\t");
        }

        int[] sortedItemArray =  selectionSortAlgo(unSortedItemArray);

        //Displaying the Sorted Array Elements
        System.out.print("\nSorted Array Elements are : ");
        for(int i = 0 ; i < sortedItemArray.length ; i++ ){
            System.out.print(sortedItemArray[i] + "\t");
        }
    }
}
