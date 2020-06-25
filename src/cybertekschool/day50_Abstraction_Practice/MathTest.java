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

        System.out.println("==============================");

        Multiplication m1= new Multiplication(10, 3);
        System.out.println("m1 = " + m1);
        m1.calculate();
        System.out.println("m1 = " + m1);

        System.out.println("==============================");

        Division d1=new Division(10, 5);
        System.out.println("d1 = " + d1);
        d1.calculate();
        System.out.println("d1 = " + d1);

        Division d2=new Division(10,50);
        System.out.println("d2 = " + d2);
        d2.calculate();
        System.out.println("d2 = " + d2);

        Division d3=new Division(6,0);
        System.out.println("d3 = " + d3);
        d3.calculate();
        System.out.println("d3 = " + d3);




    }
}
