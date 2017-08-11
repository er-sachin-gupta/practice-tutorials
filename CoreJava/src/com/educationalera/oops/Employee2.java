package com.educationalera.oops;

/**
 * Created by Sachin Gupta.
 * Program to copy values of one object into another object without Constructor
 */
public class Employee2 {
    String emp_name;
    int emp_id;

    Employee2(){}

    Employee2(int id,  String name){
        emp_id = id;
        emp_name = name;
    }

    public static void main(String[] args){
        Employee2 e1 = new Employee2(101, "Peter Parker");
        Employee2 e2 = new Employee2();

        //Copying values of one object into another object
        e2.emp_id = e1.emp_id;
        e2.emp_name = e1.emp_name;

        //Display Values of First Object i.e. e1
        System.out.println("Values of First Object are : ");
        e1.dispValues();

        //Display Values of Second Object i.e. e1
        System.out.println("Values of Second Object are : ");
        e2.dispValues();
    }

    void dispValues(){
        System.out.println("Name is : " + emp_name + ", Id is  : " + emp_id);
    }
}
