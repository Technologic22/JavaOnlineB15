package cybertekschool.day55_Oop_review_Casting_HasA.association2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {

    public static void main(String[] args) {

//        List <String > lst =
//                new ArrayList<>(Arrays.asList("Azat","Aynur", "Aman", "Leyla" ));
//
//        Course java = new Course("Java", lst);
        Course java = new Course("Java",
                new ArrayList<>(Arrays.asList("Azat","Aynur", "Aman", "Leyla" )));   //in one shot


        System.out.println("java before adding = \n"+ java);

//        //too add more people
//        java.studentNames.add("Selbi");
//        java.studentNames.add("Shatlyk");
//        java.studentNames.add("Shohrat");
//        java.studentNames.add("Ogultar");
//        java.studentNames.addAll(Arrays.asList("Dovran", "Batyr"));//to add in one shot

        //adding students using addStudent method
        java.addStudent("Ali");
        java.addStudent("Veli");

        //adding more studentswith method
        java.addManyStudents(Arrays.asList("Gyulzar", "Muhamed"));

        System.out.println("java.student names = " + java.studentNames);
        System.out.println("Course java \n"+java);
        //does adding new names lst, change my original arraylist object???
        //of course YES!!!
        //there r 2 references to that list object
       // System.out.println("my original lst is : "+ lst);
    }

}
