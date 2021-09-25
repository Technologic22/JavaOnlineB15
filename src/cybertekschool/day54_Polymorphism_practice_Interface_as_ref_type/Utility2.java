package cybertekschool.day54_Polymorphism_practice_Interface_as_ref_type;

import java.util.Arrays;
import java.util.List;

public class Utility2 {
    public static void main(String[] args) {

        Wearable w1 = new Clothes();
        Wearable w2 = new Watch();
        Wearable w3 = new Perfume();
        Wearable w4 = new MakeUps();

        List <Wearable> list = Arrays.asList(w1,w2,w3,w4);  //arraysAsList, 'cuz no intent to add or delete

        for (Wearable each :list) {
            each.wear();
        }

    }
}
