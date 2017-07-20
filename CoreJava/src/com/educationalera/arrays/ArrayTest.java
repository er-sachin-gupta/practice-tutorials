package com.educationalera.arrays;

/**
 * Created by Sachin Gupta on 20-07-2017.
 */

public class ArrayTest {
    public static void main(String[] args){

        //Declaring and Initializing Arrays
        double[] itemList = {1.2,4.5,5.6,2.3,3.4};

        double sum = 0.0d;

        //Iteration of the Array List Elements
        //Printing the Array List Elements
        for(int i = 0 ; i < itemList.length ; i++ ){
            System.out.print(itemList[i] + " \t ");
        }

        //Calculating the Sum of Array List Elements
        for(int i = 0 ; i < itemList.length ; i++){
            sum += itemList[i];
        }

        //Sum of all Array List Elements
        System.out.println("\nSum of all Array List Elements : " + sum);

        //Find the Largest Element from Array List
        double bigElement = itemList[0];
        for(int i = 1; i < itemList.length ; i++){
            if(bigElement < itemList[i]){
                bigElement = itemList[i];
            }
        }

        //Largest element from ArrayList
        System.out.println("Largest element from Array List is : " + bigElement);
    }
}
