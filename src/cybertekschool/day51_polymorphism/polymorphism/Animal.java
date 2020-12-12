package cybertekschool.day51_polymorphism.polymorphism;

public abstract class Animal {

    public abstract void makeNoise();

}
// I can add more classes as long as only one class is public and name is same as file name

class Dog extends Animal{

    @Override
    public void makeNoise(){
        System.out.println("Woof!!");
    }

}

class Horse extends Animal{

    @Override
    public void makeNoise(){
        System.out.println("Neigh neigh...");
    }

}