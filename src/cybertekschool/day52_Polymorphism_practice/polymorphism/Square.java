package cybertekschool.day52_Polymorphism_practice.polymorphism;

public class Square extends Shape implements Drawable {

    int length;

    public Square(String name, int length) {
        super(name);
        this.length=length;
    }

    @Override
    public void calculateArea() {
        area=length*length;
    }

    @Override
    public void draw() {
        System.out.println("Draw 4 equal lines with 90 degrees, length "+length+ " with color "+ Drawable.COLOR);
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
