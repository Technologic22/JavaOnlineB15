package cybertekschool.day47_Final_Keyword_Abstract_Class_Intro;

//--I dont need to create car object using this class
//-- only want this class to be super class to provide
//-- reusable fields and methods
//-- this class is designed to be a super class

public abstract class Car {

        int year;
    String brand;

    //-- abstract class can have abstract method
    //-- ONLY ABSTRACT  CLASS CAN HAVE ABSTRACT METHOD
    //-- it has abstract keyword
    //--doesnt have a body, doesnt have {}
    //-- it ends with ;
    //-- IT IS MEANT TO BE OVERRIDDEN TO PROVIDE BODY
    //IN SUB CLASS

    public abstract void start();
    public abstract void goForward();
    public abstract void goBackward();
    public abstract void turn(String direction);

    //add abstract void methods:
    //goForward
    //goBackward
    //turn (String direction)

}
