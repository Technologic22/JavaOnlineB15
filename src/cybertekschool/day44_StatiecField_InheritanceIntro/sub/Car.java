package cybertekschool.day44_StatiecField_InheritanceIntro.sub;

import cybertekschool.day44_StatiecField_InheritanceIntro.Vehicle;

public class Car extends Vehicle {
    //String make is not inherited
    //it has default acc. modifier - cuz diffrenet packages
    //private int is not inherited
    int milage;

    public static void main(String[] args) {
        Car c1= new Car();
        c1.milage=39657;
        System.out.println("c1 milage = " + c1.milage);
        c1.setYear(1999);
        System.out.println("c1.getYear() = " + c1.getYear());
        c1.make="Subaru WRX sti";


    }

}
