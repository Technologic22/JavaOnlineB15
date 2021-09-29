package cybertekschool.day55_Oop_review_Casting_HasA;

public class CalculatorTest {

    public static void main(String[] args) {

        SimpleCalculator c1 = new SimpleCalculator();
        c1.addNum(50);
        c1.addNum(30)
           .addNum(50)
           .addNum(100)
           .minusNum(60)
           .displayResult();   //we were able to chain the method
       //System.out.println(c1.result);  when ' private int result; ' there is no access!

        //--- into multiple steps
//        c1=c1.addNum(30);
//        c1=c1.addNum(50);
//        c1=c1.addNum(100);
//        c1=c1.minusNum(60);

    }

}
