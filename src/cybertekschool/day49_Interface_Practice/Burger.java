package cybertekschool.day49_Interface_Practice;

//--class can implement multiple interfaces
public class Burger implements Edible, Juicy{

    public static final boolean IS_HUMAN_FOOD=true;

//    public Burger(){
//        super();
//    }

    @Override
    public void eat() {
        System.out.println("Eating burger...");
    }

    @Override
    public void drink() {
        System.out.println("Eat burger then drink soda");
    }

    @Override
    public void melt() {
        System.out.println("Juicy burger is melting...");
    }
}
