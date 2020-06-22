package cybertekschool.day50_Abstraction_Practice;

public class Main {

    public static void main(String[] args) {
        Square s1=new Square("My dear", 8);
        System.out.println("s1 without area calculation = " + s1);
        s1.calculateArea();
        System.out.println("s1 with area calculation "+s1);
        s1.draw();

        System.out.println("------------------------------------------");

        Circle c1=new Circle("My nice", 7);
        System.out.println("c1 before area calculation "+c1);
        c1.calculateArea();
        System.out.println("c1 with area calculation "+c1);
        c1.draw();

    }
}
