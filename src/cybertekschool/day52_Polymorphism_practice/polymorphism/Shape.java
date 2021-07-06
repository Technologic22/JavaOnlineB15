package cybertekschool.day52_Polymorphism_practice.polymorphism;

/*
 Task 2
       -Create an Interface called Drawable
          it has draw method
       - Create an abstract method called Shape
          it implements drawable interface
          it has 2 fields  : String name, double area
          abstract method calculateArea();

       - Create 2 concrete Shape classes called
              Square
                 field: length
                 instance methods  : (implement all abstract methods)
                 toString method
              Circle
                 field: radius
                 instance methods : (implement all abstract methods)
                 toString method

  **/

//abstract class is not required to implement
//inherited abstract methods of the interface
public abstract class Shape implements Drawable {

    String name;
    double area;
        //--!! Why abstract class has a constructor, when we dont create an object of it?!!
        //--!! it exists purely to let subclass to call and reuse the functionality in sub class constructor
    public Shape(String name){  this.name=name;}

    public abstract void calculateArea();
}
