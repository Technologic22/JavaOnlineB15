package cybertekschool.day54_Polymorphism_practice_Interface_as_ref_type;

public class Clothes implements Wearable {

    int size;

    public static void main(String[] args) {

        //try out all the polymorphic assignment
        //according to these relationship

      Clothes c1 = new Clothes();

    }
}

class Watch implements Wearable {

}

class Perfume implements Wearable, Cosmetics {

}

class MakeUps implements Wearable, Cosmetics {

}