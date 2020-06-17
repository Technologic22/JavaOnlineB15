package cybertekschool.day48_AbstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public class Lion extends Mammals{

    public static void main(String[] args) {
        Lion l1=new Lion();
        l1.drinkMilk();
        l1.makeNoise();

        //--any class U created, it can be data type or variable
        //-- aka reference variable

        Animal a1 = new Lion(); //-- our reference variable says we can point to any animal object
        a1.makeNoise();

        List<Integer>lst=new ArrayList<>(); // -- Generalizing your refrence variable type!!


    }

    @Override
    public void drinkMilk() {
        System.out.println("Lion drink milk");
    }

    @Override
    public void makeNoise() {
        System.out.println("Lion Roars...");
    }
}
