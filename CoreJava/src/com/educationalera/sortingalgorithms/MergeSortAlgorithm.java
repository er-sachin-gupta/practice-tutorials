package com.educationalera.sortingalgorithms;

import java.util.Arrays;

/**
 * Created by Sachin Gupta.
 * Program to implement Merge Sort in Java
 */

public class MergeSortAlgorithm {
    private int length;
    private int[] array;
    private int[] tempArrayForMerge;

    public void sortArray(int[] array){
        this.array = array;
        //Calculating the Size of Array.
        length = array.length;

        //Creating a temporary array with length equals to our unsorted array.
        this.tempArrayForMerge = new int[length];
        mergeSortAlgo(0, length-1);
    }

    public void mergeSortAlgo(int lowerBoundIndex, int upperBoundIndex){
        if(lowerBoundIndex < upperBoundIndex){
            int mid = lowerBoundIndex + (upperBoundIndex - lowerBoundIndex) / 2;
            mergeSortAlgo(lowerBoundIndex, mid); //Sort Left Side of Array
            mergeSortAlgo(mid + 1, upperBoundIndex); //Sort Right Side of Array
            mergeBoth(lowerBoundIndex, mid, upperBoundIndex); //Combine them both above array sides
        }
    }

    public void mergeBoth(int lower, int mid, int upper){
        //Copy the array into the temporary array
        for(int i = lower; i <= upper; i++){
            tempArrayForMerge[i] = array[i];
        }

        int i = lower;
        int j = mid + 1;
        int k = lower;

        while(i <= mid && j <= upper ){
            //Copy the smallest elements to Original array, either from Left Side or right side of temporary array.
            if(tempArrayForMerge[i] <= tempArrayForMerge[j]){
                array[k] = tempArrayForMerge[i];
                i++;
            } else{
                array[k] = tempArrayForMerge[j];
                j++;
            }
            k++;
        }

        //Copy the remaining left side of  temporary array into Original Array
        while(i <= mid){
            array[k] = tempArrayForMerge[i];
            k++;
            i++;
        }

    }

    public static void main(String[] args){
        int[] unSortedItemArray = {3, 1, 15, -2, 2, 12, 20, 7, 13, 10};

        //Unsorted Elements of Array are :
        System.out.print("Displaying Unsorted Elements of Array :");
        System.out.print(Arrays.toString(unSortedItemArray));

        MergeSortAlgorithm mergeSortAlgorithm = new MergeSortAlgorithm();
        mergeSortAlgorithm.sortArray(unSortedItemArray);

        //Sorted Elements of Array are :
        System.out.print("\nDisplaying Sorted Elements of Array :");
        System.out.print(Arrays.toString(mergeSortAlgorithm.array));

    }
}
