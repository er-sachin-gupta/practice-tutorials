package com.educationalera.oops;

/**
 * Created by Sachin Gupta.
 * Program to copy values of one object into another object using object clone method
 * To Use Clone Method, we need to implement  java.lang.Cloneable interface
 * and we need to throw ClassNotSupportedException.
 */

public class Employee3 implements Cloneable{
    String emp_name;
    int emp_id;

    Employee3(int id,  String name){
        emp_id = id;
        emp_name = name;
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Employee3 e1 = new Employee3(101, "Peter Parker");
        Employee3 e2 = (Employee3)e1.clone(); // Make a clone of e1 object.

        //Display Values of First Object i.e. e1
        System.out.println("Values of First Object are : ");
        e1.dispValues();

        //Display Values of Second Object i.e. e1
        System.out.println("Values of Second Object are : ");
        e2.dispValues();
    }

    void dispValues(){
        System.out.println("Id is : " + emp_id + ", Name is : " + emp_name);
    }
}
