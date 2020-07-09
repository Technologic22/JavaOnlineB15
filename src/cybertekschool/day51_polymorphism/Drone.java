package cybertekschool.day51_polymorphism;

//Class 'implements' an interface
//An interface 'extends' another interface
//a class 'extends' another class


public class Drone implements UprightFlyable{


    @Override
    public void flyUpright() {
        System.out.println("Flying upright");
    }

    @Override
    public void fly() {
        System.out.println("Regular flying");
    }


}
