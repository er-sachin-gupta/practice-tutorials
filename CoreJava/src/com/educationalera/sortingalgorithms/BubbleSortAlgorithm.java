package com.educationalera.sortingalgorithms;

/**
 * Created by Sachin Gupta on 21-07-2017.
 */

public class BubbleSortAlgorithm {

    public static void swapPosition( int i, int  j, int[] unSortedArray){
        int temp = unSortedArray[i];
        unSortedArray[i] = unSortedArray[j];
        unSortedArray[j] = temp;
    }

    public static  void bubbleSortAlgo(int[] unSortedArray){
            //Calculate the size of Array
            int l = unSortedArray.length;

            for(int j = l ; j >= 0 ; j-- ){
                for(int i = 0 ; i < l-1 ; i++ ){
                    if(unSortedArray[i] > unSortedArray[i+1]){
                            //Exchanging the array items position
                            swapPosition(i, i+1, unSortedArray);
                    }
                }
            }
    }

    public static void main(String[] args){

        int[] unSortedItemList = {3, 1, 15, -2, 2, 12, 20, 7, 13, 10};
        int[] sortedItemList = new int[unSortedItemList.length];

        //Displaying the Unsorted Array Elements
        System.out.print("Unsorted Array Elements are : ");
        for(int i = 0 ; i < unSortedItemList.length ; i++ ){
            System.out.print(unSortedItemList[i] + "\t");
        }

        bubbleSortAlgo(unSortedItemList);

        //Copying Array Elements from Unsorted Array to Sorted Array
        for(int i = 0 ; i < unSortedItemList.length ; i++ ){
           sortedItemList[i] = unSortedItemList[i];
        }


        //Displaying the Sorted Array Elements

        System.out.print("\nSorted Array Elements are : ");
        for(int i = 0 ; i < unSortedItemList.length ; i++ ){
            System.out.print(unSortedItemList[i] + "\t");
        }
    }

}
