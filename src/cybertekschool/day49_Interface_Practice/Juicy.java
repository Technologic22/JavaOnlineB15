package cybertekschool.day49_Interface_Practice;

//--INTERFACE can achieve LOOSELY COUPLING Between implementing classes
//-- s.a. flyable
//--all the implementing classes like Plane, Superman, FLY...
//-- can be all flyable but nothing to do with each other
//--and almost no knowledge each other: Known as LOOSELY COUPLING
//--This is why its always preferred in DESIGN

public interface Juicy {

    public abstract void melt();

    //-- another type of method Interface can have is
    //--STATIC METHOD, It MUST have a BODY
    //--It is there to provide some UTILITY methods
    //--NOT Belong to ANY CLASS
    //--NOT INHERITED!!!
    //--Must HAVE BODY

    public static void squeeze(){
        System.out.println("static squeezing!");
    }

}
