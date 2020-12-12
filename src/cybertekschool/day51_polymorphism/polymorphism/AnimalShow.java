package cybertekschool.day51_polymorphism.polymorphism;

public class AnimalShow {

    public static void main(String[] args) {

        // Dog d1=new Dog();
        // we r referring Dog object using animal reference

        Animal a1=new Dog();
        a1.makeNoise();
        //here we r reassigning a1 to a new object
        a1=new Horse();
        a1.makeNoise();

        Animal a2 = new Horse();
               a2.makeNoise();

        Dog d1 = new Dog();

        Animal a3 = d1;
        a3.makeNoise();

    }

}
