package com.educationalera.sortingalgorithms;

import java.util.Arrays;

/**
 * Created by Sachin Gupta.
 * Program to Implement Quick Sort Algorithm in Java
 */

public class QuickSortAlgorithm {

    private int[] array;
    private int length;

    public void sortArray(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        this.array = array;

        //Calculating the size of Array
        length = array.length;
        quickSortAlgo(0, length-1);
    }

    public void quickSortAlgo(int lowerBoundIndex, int uppperBoundIndex){
        int i = lowerBoundIndex, j = uppperBoundIndex;

        //Calculating Pivot Point, Pivot we considering here is a middle index number between lowerBoundIndex and uppperBoundIndex
        int middle  = lowerBoundIndex+(uppperBoundIndex-lowerBoundIndex) / 2;
        int pivot = array[middle];

        /***
         * With Every Iteration of this While Loop,
         * we will find  a number from left side which is greater than pivot point
         * and a number from right side which is smaller than pivot point.
         * Once we have both such numbers, we will swap / interchange their positions.
         */
        while(i <= j){
            while ( array[i] < pivot){
                i++;
            }
            while( array[j] > pivot ){
                j--;
            }

            if(i <= j){
                swapPositions(i, j); //Swap positions of elements
                //Move Index by one position ahead on both sides of pivot point
                ++i;
                --j;
            }

            if(lowerBoundIndex < j){
                quickSortAlgo(lowerBoundIndex, j); // Recursive Call
            }
            if(i < uppperBoundIndex){
                quickSortAlgo(i, uppperBoundIndex); // Recursive Call
            }

        }
    }

    //Method for Swapping Positions of array elements
    public void swapPositions(int pos1, int pos2){
        int tempVar = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = tempVar;
    }


    public static void main(String[] args){
        int[] unSortedItemArray = {3, 1, 15, -2, 2, 12, 20, 7, 13, 10};

        //Unsorted Elements of Array are :
        System.out.print("Displaying Unsorted Elements of Array :");
        System.out.print(Arrays.toString(unSortedItemArray));

        QuickSortAlgorithm quickSortAlgorithm = new QuickSortAlgorithm();
        quickSortAlgorithm.sortArray(unSortedItemArray);

        //Sorted Elements of Array are :
        System.out.print("\nDisplaying Sorted Elements of Array :");
        System.out.print(Arrays.toString(unSortedItemArray));

    }
}
