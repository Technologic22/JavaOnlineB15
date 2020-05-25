package cybertekschool.day44_StatiecField_InheritanceIntro;

public class Vehicle {
    String make;
    int year;

    public Vehicle (){}

    public void goForward(){
        System.out.println(make+" is going forward");
    }
    public void start(){
        System.out.println("starting "+make);
    }

}
