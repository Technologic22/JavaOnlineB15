package cybertekschool.day39_;

public class Garage2 {

    public static void main(String[] args) {
        // Create car object using Class
        // or
        // Get an instance of Car class

        Car car1 = new Car();
        car1.make="Subaru";
        car1.model="WRX";
        car1.year=2019;
        car1.color="Nardo Gray";

        car1.goForward();
        car1.printCarAge();
        car1.changeColorTo("Blue");
        System.out.println("car1.color = " + car1.color);
        System.out.println("-----------");

        Car car2 = new Car();
        car2.make="BMW";
        car2.model="M3";
        car2.year=2015;
        car2.color="Black";

        car2.goForward();
        car2.printCarAge();

        System.out.println("END ");
    }

}
