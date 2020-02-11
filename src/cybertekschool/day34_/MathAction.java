package cybertekschool.day34_;

import cybertekschool.day31_.Calculator_V2;

import java.util.Arrays;

public class MathAction {

    //calling the static methods of other classes

    public static void main(String[] args) {
        //call your build3DigitNumber here
        //build3DigitNum is under day 34 package
        //and inside the Practice Method with.. class

        int result1 = PracticeMethodWithNumbers.build3DigitNumber(6,4,0);
        System.out.println("result1 = " + result1);

        // in order to use arrays class that coming from java.util package(NOT YOUR Package!)
        //first we need to import java.util.Arrays;
        //in order to call static method Arrays class. we need to use classname.methodName (...);
        //here Arrays.toString (yout array object goes here!)


        int [] nums = {2,5,87};
        System.out.println("Arrays.toString (nums) = " + Arrays.toString(nums));

        //How can I call static method Calculator_v2 fromm day 31 package
        //1st- we need to import the class --->>day.31.Calculator_v2
        //in order to call static method of Calculator_v2 class,
        //Calculator_V2.yourStaticMethodName (....)

        Calculator_V2.calculate(10, 20, '-');


    }
}
