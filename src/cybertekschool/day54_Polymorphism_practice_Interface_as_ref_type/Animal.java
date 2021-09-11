package cybertekschool.day54_Polymorphism_practice_Interface_as_ref_type;

public abstract class Animal {

    public abstract void speak();

}

class Dog extends Animal implements
        IndoorPet {

    @Override
    public void speak() {
        System.out.println("BARK!!");
    }

    @Override
    public void play() {
        System.out.println("Running after the ball ");
    }
}