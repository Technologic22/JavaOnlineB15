package cybertekschool.day50_Abstraction_Practice;

//--Abstract class is NOT REQUIRED to implement
//-inherited abstract methods of the INTERFACE
public abstract class Shape implements Drawable {

    String name;
    double area;
        //--!! Why abstract class constructor, when we dont create an object of it?!!
        //--!! it exists purely to let subclas to call and reuse the functionality in sub class constructor
    public Shape(String name){
        this.name=name;
    }

    public abstract void calculateArea();
}
