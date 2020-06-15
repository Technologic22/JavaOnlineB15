package cybertekschool.day47_Final_Keyword_Abstract_Class_Intro;

public class Student {

     //set once dont update/change! reassigning doesnt work when made final!!!
    //CONSTANT
    //Public Final static field with initial value set
    //this type of field name always suggested to make all UPPERCASE
    // to make it clear that this is a public static final field  that never change
    //other languages has specific term called CONSTANT for this
    //If Interviewer asks how do I define CONSTANT in java?
    //-- SAY 'CREATE PUBLIC STATIC FINAL FIELD'

    public static final String  SCHOOL = "Cybertek";
    //final instance field
    final int studentID;

    public Student(int studentID){
        this.studentID=studentID;
    }

}
