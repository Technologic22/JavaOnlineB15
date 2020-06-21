package cybertekschool.day49_Interface_Practice;

// interface is like a contract, so it must provide all the details

public interface Edible {

    //--in INTERFACE, Fields are autoimarically 'public static final' if not defined so
    //--caps loc on!!!
    public static final boolean IS_HUMAN_FOOD=true;

    //--all methods are 'PUBLIC ABSTRACT' if not defined explicitly
    void eat();
    public abstract void drink();

    //--!! when U add new method to Interface, all the implementing classes will start to fail

    //--since J 8, default implementation to not the break current implementations
    //--classes have option to use it as is
    //--override it according to their own requirement
    //--ONLY EXIST IN INTERFACE
    //-- 'DEFAULT' Keyword NOT A ACCESS MODIFIER
    public default void digest(){
        System.out.println("U implement the code yourself");
    }
}
