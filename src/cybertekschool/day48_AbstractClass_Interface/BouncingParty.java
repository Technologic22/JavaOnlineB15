package cybertekschool.day48_AbstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public class BouncingParty {

    public static void main(String[] args) {

        Kangaroo k1=new Kangaroo("Rocky", 8);
        System.out.println("k1 = " + k1);
        k1.bounce();
        k1.eat();
        k1.carryChildInThePouch();
        k1.kickBox();

        //--SuperType variableName= new SubType (....) ; THIS WORKS
        //List <Integer> lst=new ArrayList<>();

        Bouncible k2=new Kangaroo("Ginger", 7);
        k2.bounce();

        Ball b1=new Ball("Round", "Gray");
        System.out.println("b1 = " + b1);
        b1.bounce();

        System.out.println(Bouncible.GRAVITY);
    }
}
