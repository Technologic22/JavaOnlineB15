package cybertekschool.day55_Oop_review_Casting_HasA;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.addNum(50);
        c1.addNum(30).addNum(50).addNum(100).minusNum(60).displayResult();   //we were able to chain the method
       //System.out.println(c1.result);  int result is now private so it can not access!

        //--- into multiple steps
//        c1=c1.addNum(30);
//        c1=c1.addNum(50);
//        c1=c1.addNum(100);
//        c1=c1.minusNum(60);

    }

}
