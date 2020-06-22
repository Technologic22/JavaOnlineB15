package cybertekschool.day50_Abstraction_Practice;

public class Main {

    public static void main(String[] args) {
        Square s1=new Square("My dear", 8);
        System.out.println("s1 without area calculation = " + s1);
        s1.calculateArea();
        System.out.println("s1 with area calculation "+s1);
        s1.draw();

    }
}
