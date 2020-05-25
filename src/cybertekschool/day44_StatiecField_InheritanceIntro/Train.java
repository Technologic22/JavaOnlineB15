package cybertekschool.day44_StatiecField_InheritanceIntro;

public class Train extends Vehicle{

    //what is inherited:  Visible methods and attributes, fields
    //constructors not inherited

    int wagonCount;
    public void makeChooChooSound(){
        System.out.println("Choo Chooo choooo wooooo");
    }

    public static void main(String[] args) {
        Train t1= new Train();
        t1.makeChooChooSound();

        //these attributes from Vehicle class

        t1.make="Thomas";
        t1.year= 1999;
        //calling the method from Vehicle class
        t1.start();
        t1.goForward();
        
    }
}
