package cybertekschool.day48_AbstractClass_Interface;

public class HR_Action {

    public static void main(String[] args) {
        // Employee e1=new Employee();  //-- CAN NOT be created, its an ABSTRACT CLASS
    HourlyEmployee e1=new HourlyEmployee("Aynur", 1406, 60, 1500);
    e1.calculateAnnualSalary();
        System.out.println("e1 = " + e1);

    HourlyEmployee e2= new HourlyEmployee("Leyla", 504, 50, 1300);
    e2.calculateAnnualSalary();
        System.out.println("e2 = " + e2);

    FullTimeEmployee e3=new FullTimeEmployee("Gulzar", 506, 5000) ;
    e3.calculateAnnualSalary();
        System.out.println("e3 = " + e3);

        FullTimeEmployee e4 = new FullTimeEmployee("Muhamed", 227, 8000);
        e4.calculateAnnualSalary();
        System.out.println("e4 = " + e4);


        //-- each and every class we create, it will become a data type (reference type!)

    }

    }
