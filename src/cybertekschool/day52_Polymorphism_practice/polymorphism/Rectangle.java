package cybertekschool.day52_Polymorphism_practice.polymorphism;

public class Rectangle extends Shape {

    int width;
    int height;

    public Rectangle(String name) {
        super(name);
    }

   @Override
    public void calculateArea() {
       area= width * height;
    }

    @Override
    public void draw() {

    }
}
