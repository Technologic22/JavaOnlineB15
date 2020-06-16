package cybertekschool.day47_Final_Keyword_Abstract_Class_Intro;

public class Garage {

    public static void main(String[] args) {
        //Abstract class can not be instantiated
        //It means we can not
       // Car c= new Car();

        ElectricCar c1=new ElectricCar();
        c1.start();
        c1.goForward();
        c1.goBackward();
        c1.turn("Right");

        //Create another subclass of CAR
        //Gas Car subclass, add a field gasLevel
        //implement all the abstract method
        GasCar g1=new GasCar();
        g1.goBackward();
        g1.goForward();
        g1.start();
        g1.turn("left");
        g1.gasLevel=40;
    }

}
