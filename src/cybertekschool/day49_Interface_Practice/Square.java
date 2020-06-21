package cybertekschool.day49_Interface_Practice;

public class Square extends Shape implements Drawable{

    int length;

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
