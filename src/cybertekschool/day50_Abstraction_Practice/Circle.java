package cybertekschool.day50_Abstraction_Practice;

public class Circle extends Shape implements Drawable{

    int radius;

    public Circle(String name) {
        super(name);
    }

    @Override
    public void calculateArea() {

    }

    @Override
    public void draw() {

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
