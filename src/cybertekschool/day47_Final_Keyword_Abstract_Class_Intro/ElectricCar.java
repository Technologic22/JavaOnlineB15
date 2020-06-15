package cybertekschool.day47_Final_Keyword_Abstract_Class_Intro;

public class ElectricCar extends Car {

    int batteryLevel;

    @Override
    public void start() {
        System.out.println("This is how electric car starts");
    }

    public static void main(String[] args) {
        //Car c1 = new Car();

        ElectricCar e1=new ElectricCar();
        e1.start();
    }
}
