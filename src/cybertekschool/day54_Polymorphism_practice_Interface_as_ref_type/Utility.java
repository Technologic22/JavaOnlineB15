package cybertekschool.day54_Polymorphism_practice_Interface_as_ref_type;

public class Utility {

    public static void main(String[] args) {

        Wearable w1 = new Clothes();
        wearMyWearable(w1);

        Wearable w2 = new Watch();
        wearMyWearable(w2);

        Wearable w3 = new Perfume();
        wearMyWearable(w3);

        Wearable w4 = new MakeUps();
        wearMyWearable(w4);

        //directly passing the object without storing
        wearMyWearable(new Watch());
       // wearMyWearable(new String());   - DOESN'T woork, because String is not a Wearable!!!

        System.out.println("\n ----- calling the getMyWearable-----\n");
        Wearable result = getMyWearable();
        System.out.println("result = " + result);

        System.out.println(result.getClass().getSimpleName());

    }

    //Create a static method called getMyWearable
    //It returns a Wearable Object (or anything IS-A Wearable)

    public static Wearable getMyWearable(){

//        Wearable w = new Clothes();
//        return w;
//        return new Clothes();
        return new Watch();
//        return new MakeUps();
//        return new Perfume();
    }

    //create a static void method wearMyWearable
    //it has 1 parameter with type Wearable
    //we made it static so we can just call it directly

    public static void wearMyWearable(Wearable any){

        any.wear();

    }

}
