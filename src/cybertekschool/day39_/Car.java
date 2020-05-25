package cybertekschool.day39_;


// Create a car class Object

public class Car {
    //make model year color
    String make;
    String model;
    int year;
    String color;

    public void goForward() {
        System.out.println(make + " Going forward ");
    }

    // Create a method to print how old is this car
    public void printCarAge() {
        System.out.println("car age : " + (2020 - year));
    }

    // create a method to change the color

    public void changeColorTo(String newColor) {
        // Write bunch of code here to validate
        // user is actually passing correct color
        // for example  Red , Blue is valid color
        //              ABC , EFG is not valid color
        color = newColor;
    }

    // instance methods are tied to the object
    // it does not have have static keyword
    // we need an object when we call them

}
