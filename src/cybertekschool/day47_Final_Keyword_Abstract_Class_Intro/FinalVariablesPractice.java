package cybertekschool.day47_Final_Keyword_Abstract_Class_Intro;

public class FinalVariablesPractice {

    public static void main(String[] args) {

        int x=10;   // declaring and initializing a variable/ assingning initial value
        //reassigning new value to the variable,
        // giving changing originial value
        x=100;

        //declaring and initializing a final variable
        //declaring and assigning initial value to a final variable
        final int a=20;
        //re-assingning new value to the final variable - ERROR!!!!!
        //a=200;

        final Student s1= new Student(112);
        System.out.println("s1 = " + s1.studentID);  // gives an address in the heap!
        //canm not reassign value since it is final, one TV on remote!
        //s1=new Student(110);   // U cant change address, thats why it doesnt work
        //u can still CHANGE internal Data attached to the object
        //as long as its the same object s1 pointing to
        //as long as the address doesnt change
        //s1.studentID=200;
        System.out.println("s1 = " + s1.studentID);  // same address of an object

        System.out.println(Student.SCHOOL);
        //--can not reassign value becauyse its final
     // Student.school="abc";

        //IntelliJ AUTOMATICALLY Recognize Constant (public static final field)
        //it will automatically make it italic (cant be done by programmer)
        //easy way to distionguish btw fields and methods is
        //by looking at () at the end

        System.out.println(Byte.MAX_VALUE);   //

        //PI in Java
        System.out.println(Math.PI);

        printDoubleNumber(15);

        final String name="Michael";
        // name="murad" this will not work, cant be reassigned
    }

     /**
     *a void method that accepts int value and generates double
     * @param x
     */// anywhere we declare a ariable we have option to make it final(incl. method parameter)
     //making method parameter final
     //it will make the method only use the argument ser passed w/out modifying it;
    public static void printDoubleNumber(final int x){
        //x=x*2;
        //System.out.println("x*2= "+x);
        System.out.println("x*2= "+x*2);
    }
}
