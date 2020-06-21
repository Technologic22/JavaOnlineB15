package cybertekschool.day49_Interface_Practice;

public class Tesla extends Vehicle implements Autonomous, Chargeable{

    String model;
    int horsePower;

    public Tesla(String model, int year, int horsePower) {
        super(year);
        this.model=model;
        this.horsePower=horsePower;
//        System.out.println("My car's model is "+model
//                +", it's horsepower is "+horsePower);
    }

    @Override
    public void start() {
        System.out.println("Tesla "+model+ " starts!");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla model "+model+" is a self-Driven Car!");
    }

    @Override
    public void chargedDaily() {
        System.out.println("My Tesla "+model+" is charged daily!");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", year=" + year +
                '}';
    }

   }
