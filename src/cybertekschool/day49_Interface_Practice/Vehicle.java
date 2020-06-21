package cybertekschool.day49_Interface_Practice;

public abstract class Vehicle implements Autonomous {

                protected int year;

                public Vehicle(int year){
                    this.year=year;
                }

                public abstract void start();

                protected void goForward(){
                    System.out.println("Vehicle goes forward!");
                }

}
