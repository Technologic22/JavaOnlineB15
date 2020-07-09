package cybertekschool.day51_polymorphism;

//Flyable is super type of UprightFlyable
//Flyable is more general idea, UprightFlyable is less general but still is a abstract idea!
public interface UprightFlyable extends Flyable{
    //public abstract void fly(); inherited
    public abstract void flyUpright();
}
