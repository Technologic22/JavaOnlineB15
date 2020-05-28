package cybertekschool.day44_StatiecField_InheritanceIntro;

public class Vehicle {

    //protected Acc. Modif.
    //make the member accessible in subclass of this class
    //in different packages
    protected String make;
    private int year;

    public Vehicle (){}

    public void goForward(){
        System.out.println(make+" is going forward");
    }
    public void start(){
        System.out.println("starting "+make);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
