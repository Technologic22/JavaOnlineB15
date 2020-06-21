package cybertekschool.day49_Interface_Practice;

public class Circle extends Shape implements Drawable{

    int radius;

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
