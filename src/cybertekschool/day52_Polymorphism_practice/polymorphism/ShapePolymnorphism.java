package cybertekschool.day52_Polymorphism_practice.polymorphism;

public class ShapePolymnorphism {

    public static void main(String[] args) {


        Circle s1 = new Circle("penny", 5);
 //       Shape s1 = new Circle("penny", 5);
   //     Object s1 = new Circle("penny", 5);
  //      Drawable s1 = new Circle("penny", 5);

        //  ONLY THE REFERENCE TYPE DECIDES WHAT u CAN ACCESS WITH THAT VARIABLE
        // As in Object as reference type, the more general reference type is, the less method has specific action
        // (so it will not draw a circle!!!)
        // All the polymorphism is about UPCASTING !!!
      // s1.draw();

        System.out.println(s1.toString());

        //  !!!  How do I know what is the actual object type?   ----  !!!
        s1.getClass();   //coming from 'Object'  class

        System.out.println(s1.getClass().getSimpleName());


    }
}

