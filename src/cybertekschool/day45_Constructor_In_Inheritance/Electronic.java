package cybertekschool.day45_Constructor_In_Inheritance;

public class Electronic {

    String brand;
    static boolean useElectricity=true;

    public void showBrand(){
        System.out.println("Show brand "+brand );
    }

    public static void displayUseElectricity(){
        System.out.println("Displaying Electricity Usage "+useElectricity);
    }
}
