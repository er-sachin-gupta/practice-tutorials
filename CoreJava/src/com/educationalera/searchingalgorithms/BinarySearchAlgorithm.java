package com.educationalera.searchingalgorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sachin Gupta.
 * Program to implement Binary Search in Java
 */
public class BinarySearchAlgorithm {

    //Binary Search Algorithm Method
    public int binarySearchAlgo(int[] array, int key){
        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            //Find the middle of array
            int middle = (start + end) / 2;
            if(key == array[middle]){
                return middle;
            }
            if(key < array[middle]){
                end = middle - 1;
            }else {
                start = middle + 1;
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
