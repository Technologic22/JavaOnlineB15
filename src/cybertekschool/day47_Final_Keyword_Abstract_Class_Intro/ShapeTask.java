package cybertekschool.day47_Final_Keyword_Abstract_Class_Intro;

public class ShapeTask {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(10, 15);
        System.out.println("r1 = " + r1);

        r1.calculateArea();
        r1.toString();

        Triangle t1=new Triangle("My triangle", 12, 8);
        System.out.println("t1 = " + t1);
        t1.calculateArea();
    }
}
