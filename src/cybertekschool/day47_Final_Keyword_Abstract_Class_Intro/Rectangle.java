package cybertekschool.day47_Final_Keyword_Abstract_Class_Intro;

public class Rectangle extends Shape {

    int height;
    int width;

    public Rectangle(int height, int width) {
        //-- i want to set the name to rectangle
        //-- I am reusing the functionality of super class
        //-- to set the name to rectangle
        super("Rectangle");
        this.height=height;
        this.width=width;
    }

    @Override
    public void calculateArea() {
        int area=height*width;
        System.out.println("Area of the rectangle is : "+area);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
