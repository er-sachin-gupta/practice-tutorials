package com.educationalera.oops;

/**
 * Created by Sachin Gupta.
 * Program to copy values of one object into another object using Constructor.
 */

public class Employee1 {
    String emp_name;
    int emp_id;

    Employee1(int id,  String name){
        emp_id = id;
        emp_name = name;
    }

    Employee1(Employee1 e){
        emp_id = e.emp_id;
        emp_name= e.emp_name;
    }

    public static void main(String[] args){
        Employee1 e1 = new Employee1(101, "Peter Parker");
        Employee1 e2 = new Employee1(e1); //Copying values of one object into another object using constructor

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
