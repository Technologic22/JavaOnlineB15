package cybertekschool.day46_Method_Overriding;

// Programmer as super class
// JavProgrammer SQLProgrammer
//please override code and test under Subclass

    //Java Programmer
        //unique behaviour: drink Coffer, doRepl, doJavaDev
//SQL Programmer
        //unique behaviour: write SQL Query, createDatabase()

        // There is NO CONCEPT OF OVERRIDING FOR ANYTHINGOTHER THAN INSTANCE METHOD

public class Programmer {

    //PRIVATE FIELD CAN NOT BE OVERRIDDEN
    void code(){
        System.out.println("Any Programmer Code!");
    }

    void test(){
        System.out.println("Any Programmer Test!");
    }


}
