package cybertekschool.day51_polymorphism;

public interface Flyable {
   public abstract void fly();
   //An interface can extent another interface
    //to inherit its members for reusability - which is inheritance
    //I.E:  Flyable is super of UprightFlyable
    //so it inherit the methods of flyable
}
