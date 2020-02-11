package cybertekschool.day34_;

public class PracticeMethodWithNumbers {
    public static void main(String[] args) {
        //for examplke 376 --->> digit1 is 3, dig 2 is 7, di3 is 6

        int digit1, digit2, digit3;
        digit1=3;
        digit2=7;
        digit3=6;

        int number=digit1*100+digit2*10+digit3;  /// DO NOT TREAT AS STRING+ NO CONCATENATION

        int result1 = build3DigitNumber(6,4,0);
        System.out.println("result1 = " + result1);

        int result2 = build3DigitNumber(6,14,0);
        System.out.println("result2 = " + result2);

        int result3 = build3DigitNumber(16,14,90);
        System.out.println("result3 = " + result3);


        //add the result of first2 method call

        System.out.println("result1 + result2 = "+(result1+result2));
        System.out.println(result1+result2+" ");


    }
    //write method called build3Dignum &it has 3 int parametrs and it will return 3 dig numbers u have build
    //if any digt1,2,3 is not within the range of 0-9 the change it to
    // for exmple
    //build3Dignm (4,2,4) = 424   or build3DigNum(0,2,1) = 21  or build3DigNumb (65,6,9) = 69

    public static int build3DigitNumber (int digit1, int digit2, int digit3){

        //if any  of the digit is invalid, make it valid

        if (digit1<0 || digit1>9){
            digit1=0;
        }if  (digit2<0 || digit2>9){
            digit2=0;
        }if (digit3<0 || digit3>9){
            digit3=0;
        }
        int number = digit1*100+digit2*10+digit3;
        return number;





    }
}
