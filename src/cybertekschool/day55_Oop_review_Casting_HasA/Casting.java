package cybertekschool.day55_Oop_review_Casting_HasA;

public class Casting {

    public static void main(String[] args) {

//        int x = 10;
//
//        long y = x; // it works implicitly | automatically
//
////        byte b = x ;
//
//        byte b = (byte) x; // need to be casted explicitly
//        // polymorphism
        Object o = new Dog("Chiwava"); // this is upcasting from type Dog to Object
//        o.bark();
        //Dog d =  new Dog("ashjgdashjdgahjsgdahjsg") ;  //this is new object
        Dog d = (Dog) o; // this is downcasting from type Object to Dog
        d.bark();        // in order to let Dog object bark, we need to refer a dog as a dog
                         // or we dont have an access to DOg only actions

        //Only reference type decide what U can access in an Object stuff

//        // Creating object with Object reference
        Object o2 = new Object();
//        // compile fine because Dog IS-A Object , BUT CLASS CAST EXCEPTION AT RUNTIME
//        // Because d2 = new Object() will NOT WORK!!!
        boolean b1 = o2 instanceof Object;
        System.out.println(b1);
        b1=o2 instanceof Dog;
        System.out.println(b1);

        Dog d2 = (Dog) o2;  //new Object();
        d2.bark();



        // WHEN DOES CLASS CAST EXCEPTION HAPPEN
        // When we try to cast super type object to subtype
        // or when the object type IS-NOT-A your casted reference type

        // Shape s1 = new Circle();
        // Square s2 = (Square ) s1 // this will compile fine , but will throw CassCastException
        // because we can't do Square s2 = new Circle() ; CIRCLE IS NOT A SQUARE

    }

}
