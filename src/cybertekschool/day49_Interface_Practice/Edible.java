package cybertekschool.day49_Interface_Practice;

// interface is like a contract, so it must provide all the details

public interface Edible {

    //--in INTERFACE, Fields are autoimarically 'public static final' if not defined so
    //--caps loc on!!!
    public static final boolean IS_HUMAN_FOOD=true;

    //--all methods are 'PUBLIC ABSTRACT' if not defined explicitly
    void eat();
    public abstract void drink();
    //public abstract void digest();
}
