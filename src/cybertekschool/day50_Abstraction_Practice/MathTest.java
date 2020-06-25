package cybertekschool.day50_Abstraction_Practice;

public class MathTest {

    public static void main(String[] args) {

        Addition a1=new Addition(15, 40);
        System.out.println("Before calculation "+ a1);
        a1.calculate();
        System.out.println("After calculation " + a1);

        System.out.println("==============================");

        Subtraction s1=new Subtraction(90,10);
        System.out.println("s1 = " + s1);
        s1.calculate();
        System.out.println("s1 = " + s1);

        Subtraction s2=new Subtraction(10,90);
        System.out.println("s2 = " + s2);
        s2.calculate();
        System.out.println("s2 = " + s2);

    }
}
