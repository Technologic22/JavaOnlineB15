package cybertekschool.day52_Polymorphism_practice.polymorphism;

public class ShapePolymorphism2 {

    public static void main(String[] args) {


        //Circle s1 = new Circle("penny", 5);
        Shape s1 = new Circle("penny", 5);

        printAnyShapeArea(s1);

        Shape s2 = new Rectangle("Book", 5, 10 );

        printAnyShapeArea(s2);

        //  ..??? Can I driectly pass an object to a method

        printAnyShapeArea(new Square("CHess Board", 6));

        drawShape3Times(s1);
        drawShape3Times(s2);
        drawShape3Times(new Square("CHess Board", 6));

    }

        //Create a static method called drawShape3Times
        //it has  Shape as parameter0
        //return nothing
        // it will draw the shape 3 times
    public static void drawShape3Times(Shape anyShape){

        anyShape.draw();
        anyShape.draw();
        anyShape.draw();


    }

    public static void printAnyShapeArea (Shape anyShape){

        anyShape.calculateArea();
        System.out.println(anyShape.name+"'s area is "+anyShape.area+" cm square");
    }
    }
