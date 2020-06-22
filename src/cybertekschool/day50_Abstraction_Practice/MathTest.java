package cybertekschool.day50_Abstraction_Practice;

public class MathTest {

    public static void main(String[] args) {
        Addition a1=new Addition(15, 40);
        System.out.println(a1);
        a1.calculate();
        System.out.println("a1 = " + a1);
    }
}
