package cybertekschool.day52_Polymorphism_practice.polymorphism;

public class ShapePolymorphism2 {

    public static void main(String[] args) {


        Circle s1 = new Circle("penny", 5);

        printAnyShapeArea(s1);

    }



    public static void printAnyShapeArea (Shape anyShape){

        anyShape.calculateArea();
        System.out.println(anyShape.area);

    }



}
