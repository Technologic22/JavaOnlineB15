package cybertekschool.day55_Oop_review_Casting_HasA;


// Taxi:   Engine   -- Driver  -- Passengers

//Taxi has Driver -- Driver Object has 2 attributes (name, driver ID)

//Create a class called Driver --> has 2 attributes, (name String, driverID int)
//Constructor to set the value, add toString method
//add a instance field called Driver, update your constructor to set Driver as well

//Encapsulate All the fields
public class Taxi {

    int plateNumber;
    Engine eng;   // just like String, we have class Engine
                    //so I can use it as a data type for my field
    Driver dr;

        public Taxi(int plateNumber, Engine eng, Driver dr) {
        this.plateNumber = plateNumber;
        this.eng = eng;
        this.dr = dr;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "plateNumber=" + plateNumber +
                ", engine=" + eng +
                ", driver=" + dr +
                '}';
    }
}

class Engine {
    String type;
    int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;

     }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }



}

class Driver{
    String name;
    int driverID;

    public Driver(String name, int driverID) {
        this.name = name;
        this.driverID = driverID;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverID=" + driverID +
                '}';
    }
}

