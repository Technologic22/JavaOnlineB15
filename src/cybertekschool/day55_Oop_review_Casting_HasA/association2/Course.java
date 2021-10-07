package cybertekschool.day55_Oop_review_Casting_HasA.association2;

import java.util.List;

public class Course {

    String subject;
    List<String> studentNames;         //String [] studentNames;  this will work but fixed in size

    public Course(String subject, List<String> studentNames) {
        this.subject = subject;
        this.studentNames = studentNames;
    }

    public void addStudent (String name){
        this.studentNames.add(name);
    }

    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", studentNames=" + studentNames +
                '}';
    }
}
