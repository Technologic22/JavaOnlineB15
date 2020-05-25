package cybertekschool.day44_StatiecField_InheritanceIntro;

public class CourseCreator {
    public static void main(String[] args) {

        System.out.println("Course.counter = " + Course.counter); //shortcut: !!

        Course c1= new Course("Java", "Foundation");
        Course c2= new Course("Selenium", "Automation");
        Course c3= new Course("SQL", "Database");
        Course c4= new Course("API", "WebServices");
        Course c5= new Course("Agile", "SoftSkills");

        System.out.println("Course.counter = " + Course.counter);


    }
}
