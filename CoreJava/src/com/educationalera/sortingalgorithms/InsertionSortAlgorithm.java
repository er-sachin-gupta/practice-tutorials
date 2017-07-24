package com.educationalera.sortingalgorithms;

/**
 * Created by Sachin Gupta on 21-07-2017.
 */

public class InsertionSortAlgorithm {

    public static int[] insertionSortAlgo(int[] array){
        //Calculation no. of elements in array
        int j, l = array.length;
        int temp;
        for(int i = 1 ; i < l ; i++){
            temp = array[i];
            j = i;
            while(j > 0 && temp < array[j-1]){
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
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
            System.out.print(sortedItemArray[arr] + "\t");
        }

    }
}
