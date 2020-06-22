package cybertekschool.day50_Abstraction_Practice;

public class Circle extends Shape implements Drawable{

    int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius=radius;
    }

    @Override
    public void calculateArea() {
        area=Math.PI*radius*radius;
    }

    @Override
    public void draw() {
        System.out.println("Make a point and start making circle");
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
