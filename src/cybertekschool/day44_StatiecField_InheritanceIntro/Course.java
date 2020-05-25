package cybertekschool.day44_StatiecField_InheritanceIntro;

public class Course {

            // each object will have their own name and type
            String name;
            String type;

            // there is only one value for this counter shared by all the objects
            static int counter;

    public Course(String name, String type){
        this.name=name;
        this.type=type;
        counter+=1;
        // You can access static field
        // in constructor, instance method , static methods
    }

}
