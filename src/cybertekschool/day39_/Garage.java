package cybertekschool.day39_;

public class Garage {

    //Create a object using Car class
    //or !! Get an Instance of Car class
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.make="Subaru";
        car1.model="WRX";
        car1.year=2019;
        car1.color="Nardo Gray";

        System.out.println("Car1 color: " + car1.color);
        System.out.println("Car1 make: "+car1.make);
        System.out.println("Car1 model: "+car1.color);
        System.out.println("Car1 year: "+car1.year);

        System.out.println("========- CAR II -=========");

        Car car2= new Car();

        car2.make="BMW";
        car2.model="M3";
        car2.year=2015;
        car2.color="Black";

        System.out.println("car2.make = " + car2.make);
        System.out.println("car2.model = " + car2.model);
        System.out.println("car2.year = " + car2.year);
        System.out.println("car2.color = " + car2.color);


        System.out.println("---------------------------------");
        int  car1NewerYear=2020;   //or just car1.year=2020
        car1.year=car1NewerYear;

        System.out.println("car1 Upgraded year= " + car1.year);
        // change the color of Subaru to Color of bmw
        car1.color=car2.color;
        System.out.println("car1 New color = " + car1.color);

    }


}
