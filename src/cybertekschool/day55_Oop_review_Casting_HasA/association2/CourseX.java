package cybertekschool.day55_Oop_review_Casting_HasA.association2;

import java.util.List;

public class CourseX {

    String topic;
    List<Student> studentList;

    public CourseX(String topic, List<Student> studentList) {
        this.topic = topic;
        this.studentList = studentList;
    }

    //2 ways to add students to the list
    //version accepting Student obj.
    public void addStudent(Student s){

        studentList.add(s);
    }

        //2nd way: version student name and ID
    //so we can create Obj inside the method and add to the list
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
