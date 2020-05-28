package cybertekschool.day45_Constructor_In_Inheritance;

public class Phone extends Electronic{

    //Subclass  inherit every Visible Instance Field, Static Field
    //Subclass inherit every visible instance method and static method
    double size;
    double price;

    //bad idea to have main method here
   //doing just for the sake of using less screen
    public static void main(String[] args) {
        Phone p1= new Phone();
        p1.size=12;
        p1.price=250;
        p1.brand="Apple";

        System.out.println(Electronic.useElectricity);
        System.out.println(Phone.useElectricity);
        //directly accessing the static field of same class in static method
        System.out.println(useElectricity);

        //how to call showBrand method
        p1.showBrand();

        //how to call displayUseElectricity static method
        displayUseElectricity();   //--> use as if it is in this class! doesnt need an object when calling!!!
        //STATIC WAY like below!
        Electronic.displayUseElectricity();
        Phone.displayUseElectricity();
    }

}
