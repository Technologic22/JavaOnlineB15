package cybertekschool.day48_AbstractClass_Interface;

import java.util.Arrays;
import java.util.List;

public class HR_STUFF {

    public static void main(String[] args) {

        //Employee is an abstract super type
        //--Hourly / FUll time is specific types

        //--if we have Employee data type for e1 variable
        //--we can write down the adress of aanything IS-A Employee

        Employee e1=new HourlyEmployee("Aynur", 1406, 60, 1500);
                 e1.calculateAnnualSalary();

                 e1=new FullTimeEmployee("Gulzar", 506, 5000) ;
                 e1.calculateAnnualSalary();

        Employee e2=new HourlyEmployee("Leyla", 504, 50, 1300);
        Employee e3=new FullTimeEmployee("Muhamed", 227, 8000);

        //--what is the easiest way to store these 3 objects together

        List<Employee>allEmployee= Arrays.asList(e1,e2,e3);

        for (Employee eachEmployee : allEmployee) {
            System.out.println(eachEmployee);  //-- since we have toString method overriiden we dont neet to specify here
            System.out.println("Name is "+ eachEmployee.name);
            eachEmployee.calculateAnnualSalary();
        }


    }
}
