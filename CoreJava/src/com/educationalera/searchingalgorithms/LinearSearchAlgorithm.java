package com.educationalera.searchingalgorithms;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sachin Gupta.
 * Program to implement Linear Search in Java
 */
public class LinearSearchAlgorithm {

    public static int linerSearchAlgo(int[] array, int key){
        //Calculating the Size of Array
        int length = array.length;

        for(int i = 0 ; i < length ;  i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] itemArray = {12, 67, 23, 90, 78, 100, 98, 20, 45}; // Array Elements
        int searchElement = 78; //Element to Search in Array

        //Display all Elements of Array.
        System.out.print("Elements in Array are : " + Arrays.toString(itemArray));

        System.out.print("\nElement " + searchElement + " is located at : "  + linerSearchAlgo(itemArray, searchElement));

        //Accept User Input
        System.out.print("\nEnter element from above Array to Search : ");
        Scanner scanner = new Scanner(System.in);
        searchElement= scanner.nextInt();

        System.out.print("Element " + searchElement + " is located at : "  + linerSearchAlgo(itemArray, searchElement));

        //Note : -1 will be returned if element will not be found  in array.
    }
}
