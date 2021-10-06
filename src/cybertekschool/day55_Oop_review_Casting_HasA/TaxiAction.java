package cybertekschool.day55_Oop_review_Casting_HasA;

public class TaxiAction {

    public static void main(String[] args) {
        Engine en = new Engine("V6", 250);
        Driver d = new Driver("Babamurat", 8787);
        //printout first character of this driver
        //
        System.out.println(d.name.charAt(0));



        Taxi t1 = new Taxi(1699, en, d);
        System.out.println("t1 = " + t1.toString());

        //directly giving the object without storing!
        Taxi t2 = new Taxi(8787,
                new Engine("V8", 440),
                new Driver("tacho", 123455));

        //print out driver name and car horse power
        //driver <name > is driving a taxi with horsepower <xx> on the highway
        //System.out.println(t2.dr.name   );

        //how do I store the plate number in a variable x
        int x = t2.plateNumber; //we r accessing the field of taxi object

        //how do I store the t2 Driver field in a variable y;
        Driver y = t2.dr;

        //how do I store the t2 Engine field in a variable z;
        Engine z = t2.eng;

        System.out.println("Driver " +t2.dr.name+
                " is driving a taxi with horsepower "+
                t2.eng.horsePower);

        //how do I get the name of the driver using t2
        System.out.println("Driver name "+y.name);
        System.out.println("Driver name "+t2.dr.name);

        //how do I get the horpsepower of the taxi
        System.out.println("Horsepower of the Taxi is "+z.horsePower +"hp");

        //how do i get the first character of the driver name
        System.out.println("First character of the driver's name is "+t2.dr.name.charAt(0));

    }

}
