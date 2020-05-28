package cybertekschool.day45_Constructor_In_Inheritance;

public class Apple extends Fruit{

    /**
     * if we dont have any constructor
     * we get default constructor
     * and compiler automatically call
     * no args constructor of super class by inserting 'super()'
     */
    public Apple(){
        super("abc");
    }
    //FIRST LINE OF ANY CONSTRUCTOR IS AUTOMATICALLY CALLING
    //SUPER() if we dont call any
//    public Apple(){
//             // I wannaa use the functionality already
//                    // written in superclass constructor
//                    //we can use super() or super(arguments here)
//                    //to call super class's constructor
//
//        //how to call Constructor with 1 argument
//        super("Test");
//
//        // can we use this Super keyword to call more than one constructor
//        //NO
//        System.out.println("Message from Apple Constructor");
//    }

    public static void main(String[] args) {
        Apple a1= new Apple();

    }
}
