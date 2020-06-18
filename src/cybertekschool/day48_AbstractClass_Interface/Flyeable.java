package cybertekschool.day48_AbstractClass_Interface;

//--this is how interface created
//--it is also abstract type like abstract class
//--No object can be created out of it
//--provides guidline for implementing classes
//--its like signing a contract

public interface Flyeable {

    //-- an interface can have only "Public Static Field"
    public static final boolean HAVE_WING=true;
    //-- Can we have constructor ? : Absloutely NO !!!!

    public abstract void fly();

}
