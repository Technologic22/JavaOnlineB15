package cybertekschool.day47_Final_Keyword_Abstract_Class_Intro;

//-- this is clalled CONCRETE CLASS
//--CONCRETE CLAS MUST provide body for all inherited abstract methods
//--otherwise it will not even COMPILE
public class GasCar extends Car{

    int gasLevel;

    //implementing an abstract method in sub class means
    //--providing the body for that method in sub class
    @Override
    public void start() {
        System.out.println("Gas Car starting");
    }

    @Override
    public void goForward() {
        System.out.println("Gas Car going Forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Gas Car going backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Gas Car turning "+direction);
    }
}
