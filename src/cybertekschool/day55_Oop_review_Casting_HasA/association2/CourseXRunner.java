package cybertekschool.day55_Oop_review_Casting_HasA.association2;

import java.util.ArrayList;
import java.util.List;

public class CourseXRunner {

    public static void main(String[] args) {

        List<Student > myList= new ArrayList<>();
        myList.add(new Student("Aynur", 100));
        myList.add(new Student("Leylash", 200));
        myList.add(new Student("Selbi", 300));
        myList.add(new Student("Olya", 400));
        myList.add(new Student("Shohrat", 500));

        CourseX java = new CourseX("HAS-A", myList);
        System.out.println("java before = " + java);

        java.addStudent(new Student("Shatlyk", 600));    //adding student 1st way
        java.addStudent("Aman", 700);     //adding student 2nd way

        System.out.println("java after = " + java);


    }

}
