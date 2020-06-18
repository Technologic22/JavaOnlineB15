package cybertekschool.day48_AbstractClass_Interface;

//--we build relationship between interface and class
//--using "implements" keyword
//--it will build a IS-A relationship
//-- we can say 'Plane IS-A Flyeable'
//--since we inheriting from abstract type
//--we need to provide body for abstract methods

public class Plane implements Flyeable{

    String name;
    int capacity;
    int speed;
   //  public static final boolean HAVE_WING = true;  -- we dont see it but its there!

    @Override
    public void fly() {
        System.out.println("Plane is flying!");
    }


    public static void main(String[] args) {
        Plane p1=new Plane();
        p1.fly();
        System.out.println(Flyeable.HAVE_WING); //anything STATIC, we can access it static way
                                                //Including the static field of interface

        //--if we have static field in this class
        //-- can we access them instatic method main directlt?! - YES
        System.out.println(HAVE_WING);
    }


}
