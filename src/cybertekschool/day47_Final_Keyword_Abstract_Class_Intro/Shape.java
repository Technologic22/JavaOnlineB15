package cybertekschool.day47_Final_Keyword_Abstract_Class_Intro;

public abstract class Shape {
    String name;
    int area;
    //--add a constructor to set these value
    //--add a an abstract method called calculateArea

    public Shape(String name){
        this.name=name;
    }

    public abstract void calculateArea();

    //-- I want to enforce sub classes to provide tostring method!!!
    public abstract String toString();

}
    //--add two concrete class of Shape:
    //--Triangle
    //--     Instance fields: int height and base

    //--constructor
    //--       to set the name, height and base

    //-implement calculateArea method  area=height*(base/2)

    //-- add toString method()

    //--rectangle
    //--    Instance fields: width and height
    //-implement calculateArea method  area=height*width

