package cybertekschool.day54_Polymorphism_practice_Interface_as_ref_type;

public class AnimalShow {

    public static void main(String[] args) {

        //Dog IS-A Dog (own type)
        //Dog IS-A Animal (Super Type)
        //DOg IS-A Object
        //Dog IS-A IndoorPet (Int Reference type)

                //refer a dog object as a dog
                //it can do everything a dog can do(incl. animal, Indoorpet stuff)
        Dog d1 = new Dog();

                 //refer a dog object as an Animal
                 //it can do only things that Animal can do
                 //only speak here
        Animal a1 = d1;
        a1.speak();

        //refer a dog object as an Object
        //it can do only things that Object can do
        //i.e. toString, hasCode & others
        Object o1=d1;
       //  o1.speak();   when we hover over it says 'Cast qualifier'
        o1.toString();

        //refer a dog as an IndoorPet
        //it can do only play
        IndoorPet p1=d1;
        p1.play();

    }

}

