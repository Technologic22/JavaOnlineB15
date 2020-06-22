package cybertekschool.day50_Abstraction_Practice;

public class Square extends Shape implements Drawable{

    int length;

    public Square(String name) {
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
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
