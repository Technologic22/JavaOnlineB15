package cybertekschool.day55_Oop_review_Casting_HasA.association2;

import java.util.List;

public class CourseX {
    String topic;
    List<Student> studentList;

    public CourseX(String topic, List<Student> studentList) {
        this.topic = topic;
        this.studentList = studentList;
    }

    //2 ways to add students
    public void addStudent(Student s){
        studentList.add(s);
    }

    public void addStudent(String name, int ID){
        Student s1 = new Student(name, ID);
        studentList.add(s1);
    }

    @Override
    public String toString() {
        return "CourseX{" +
                "topic='" + topic + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
