package cybertekschool.day48_AbstractClass_Interface;

public interface Bouncible {

    //--ALL THE MEMBERS IN INTERFACE MUST BE PUBLIC
    //--THIS IS EXCLUSIVE TO INTERFACE  ==  NOWHERE ELSE U GET THIS AT ALL!!!!!!
    //--if we dont add add any part of "public static final" for the field
    //-- all interface fields are automatically public static final
    public static final double GRAVITY=9.81;

    //-- Every memeber of Interface is automatically 'PUBLIC'
    //-- If no access modifier is given
    //--all the method with no body automatically public abstract

    //void bounce();

    public abstract void bounce();

}
