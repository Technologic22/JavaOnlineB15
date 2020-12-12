package cybertekschool.day51_polymorphism.polymorphism;

import java.util.Arrays;
import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {

        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();

        s1.draw();
        s2.draw();
        s3.draw();

        //Task: Create Array of shape to store
        // 5 concrete  Shape Objects
        //and call the draw method!

        System.out.println("---------------With For Each Loop-------------------------");

        Shape [] allShapes = {s1,s2,s3,new Triangle(),s2};
        for (Shape each : allShapes) {
                each.draw();
        }
        System.out.println("---------------With For Loop-------------------------");

        for (int x = 0; x <allShapes.length ; x++) {
                allShapes[x].draw();
        }

        //Also try to create ArrayList of Shape
        //and store 4 concrete Shape objects
        // and call the draw method on each of them
        System.out.println("--------------- For Each with List-------------------------");

        //--Quick way to create a List   --- >> Can we add/remove item from this short way   ?  -~!! NO
        List <Shape > shapeList = Arrays.asList(s1,s2,s3,s2,s1);

        for (Shape each: shapeList) {
            each.draw();
        }

        System.out.println("--------------- For Loop With List -------------------------");

        for (int x = 0; x <shapeList.size() ; x++) {
            shapeList.get(x).draw();
        }

        //Create a different class:
        //and try to use the Shape, Circle Triangle class from day 50
        //Create list of Shape and calculate their area

    }
}
