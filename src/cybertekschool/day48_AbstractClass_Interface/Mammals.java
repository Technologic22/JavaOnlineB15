package cybertekschool.day48_AbstractClass_Interface;

//-- Mammal is extending Abstract super class animal
//-- and yet Mammal is another Abstract class itself
public abstract class Mammals extends Animal {

    //--if the subclass of abstract super class is also abstract
    //-- U r not required to provide body for abstract method
    //--because abstract class can have abstract method (inherited from parent abstract class)
    //--YOU CAN OPTIONALLY Provide body!!!
    public abstract void drinkMilk();
}
