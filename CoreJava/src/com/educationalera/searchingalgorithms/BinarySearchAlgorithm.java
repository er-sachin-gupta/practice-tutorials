package com.educationalera.searchingalgorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sachin Gupta.
 * Program to implement Binary Search in Java
 */

//Still needs to be fixed

public class BinarySearchAlgorithm {

    //Binary Search Algorithm Method
    public int binarySearchAlgo(int[] eArray, int key){

        int start = 0;
        int end = eArray.length - 1;
        while(start <= end){
            //Find the middle of array
            int middle = (start + end) / 2;
            if(key > eArray[middle]){
                start = middle + 1;
            }else if(key < eArray[middle]){
                end = middle - 1;
            }else {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] itemArray = {12, 67, 23, 90, 78, 100, 98, 20, 45}; // Array Elements
        int searchElement = 45; //Element to Search in Array

        //Display all Elements of Array.
        System.out.print("Elements in Array are : " + Arrays.toString(itemArray));

        BinarySearchAlgorithm binarySearchAlgorithm = new BinarySearchAlgorithm();
        System.out.print("\nElement " + searchElement + " is located at : "  + binarySearchAlgorithm.binarySearchAlgo(itemArray, searchElement));

        System.out.print("\nEnter the element you want to search from above Array : ");
        Scanner scanner = new Scanner(System.in);
        searchElement = scanner.nextInt();
        System.out.print("Element " + searchElement + " is located at : "  + binarySearchAlgorithm.binarySearchAlgo(itemArray, searchElement));
    }
}
