package cybertekschool.day45_Constructor_In_Inheritance;

public class Fruit {
    //ALLWAYS!! add No args Constructor in Super Class
    // to avoid Unncessary error of sub class calling
    //Super class's No arg Constructor

    public Fruit(){
        System.out.println("No arg constructor");
    }
    public Fruit(String str){
        System.out.println("One arg Fruit Constructor");
    }
}
